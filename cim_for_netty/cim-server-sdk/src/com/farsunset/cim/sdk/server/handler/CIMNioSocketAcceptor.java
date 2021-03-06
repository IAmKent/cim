/**
 * Copyright 2013-2023 Xia Jun(3979434@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ***************************************************************************************
 *                                                                                     *
 *                        Website : http://www.farsunset.com                           *
 *                                                                                     *
 ***************************************************************************************
 */
package com.farsunset.cim.sdk.server.handler;

import java.io.IOException;
import java.util.HashMap;

import com.farsunset.cim.sdk.server.constant.CIMConstant;
import com.farsunset.cim.sdk.server.filter.ServerMessageDecoder;
import com.farsunset.cim.sdk.server.filter.ServerMessageEncoder;
import com.farsunset.cim.sdk.server.model.HeartbeatRequest;
import com.farsunset.cim.sdk.server.model.SentBody;
import com.farsunset.cim.sdk.server.session.CIMSession;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.AttributeKey;

@Sharable
public class CIMNioSocketAcceptor extends SimpleChannelInboundHandler<SentBody> {

	/**
	 * websocket特有的握手处理handler
	 */
	public final static String WEBSOCKET_HANDLER_KEY = "client_websocket_handshake";
	/**
	 * 连接关闭处理handler
	 */
	public final static String CIMSESSION_CLOSED_HANDLER_KEY = "client_closed";

	private HashMap<String, CIMRequestHandler> innerHandlerMap = new HashMap<String, CIMRequestHandler>();
	private CIMRequestHandler outerRequestHandler;

	private int port;

	// 连接空闲时间
	public static final int READ_IDLE_TIME = 150;// 秒

	// 连接空闲时间
	public static final int WRITE_IDLE_TIME = 120;// 秒

	public static final int PING_TIME_OUT = 30;// 心跳响应 超时为30秒

	public void bind() throws IOException {

		/**
		 * 预制websocket握手请求的处理
		 */
		innerHandlerMap.put(WEBSOCKET_HANDLER_KEY, new WebsocketHandler());

		ServerBootstrap bootstrap = new ServerBootstrap();
		bootstrap.group(new NioEventLoopGroup(), new NioEventLoopGroup());
		bootstrap.childOption(ChannelOption.TCP_NODELAY, true);
		bootstrap.childOption(ChannelOption.SO_KEEPALIVE, true);
		bootstrap.channel(NioServerSocketChannel.class);
		bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
			@Override
			public void initChannel(SocketChannel ch) throws Exception {

				ch.pipeline().addLast(new ServerMessageDecoder());
				ch.pipeline().addLast(new ServerMessageEncoder());
				ch.pipeline().addLast(new LoggingHandler(LogLevel.INFO));
				ch.pipeline().addLast(new IdleStateHandler(READ_IDLE_TIME, WRITE_IDLE_TIME, 0));
				ch.pipeline().addLast(CIMNioSocketAcceptor.this);
			}
		});

		bootstrap.bind(port);
	}

	/**
	 * 设置应用层的sentbody处理handler
	 * 
	 * @param outerRequestHandler
	 */
	public void setAppSentBodyHandler(CIMRequestHandler outerRequestHandler) {
		this.outerRequestHandler = outerRequestHandler;
	}

	protected void channelRead0(ChannelHandlerContext ctx, SentBody body) throws Exception {

		CIMSession session = new CIMSession(ctx.channel());

		CIMRequestHandler handler = innerHandlerMap.get(body.getKey());
		/**
		 * 如果有内置的特殊handler需要处理，则使用内置的
		 */
		if (handler != null) {
			handler.process(session, body);
			return;
		}

		/**
		 * 有业务层去处理其他的sentbody
		 */
		outerRequestHandler.process(session, body);
	}

	/**
	 */
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {

		CIMSession session = new CIMSession(ctx.channel());
		SentBody body = new SentBody();
		body.setKey(CIMSESSION_CLOSED_HANDLER_KEY);
		outerRequestHandler.process(session, body);

	}

	/**
	 */
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if (evt instanceof IdleStateEvent && ((IdleStateEvent) evt).state().equals(IdleState.WRITER_IDLE)) {
			ctx.channel().attr(AttributeKey.valueOf(CIMConstant.HEARTBEAT_KEY)).set(System.currentTimeMillis());
			ctx.channel().writeAndFlush(HeartbeatRequest.getInstance());
		}

		// 如果心跳请求发出30秒内没收到响应，则关闭连接
		if (evt instanceof IdleStateEvent && ((IdleStateEvent) evt).state().equals(IdleState.READER_IDLE)) {

			Long lastTime = (Long) ctx.channel().attr(AttributeKey.valueOf(CIMConstant.HEARTBEAT_KEY)).get();
			if (lastTime != null && System.currentTimeMillis() - lastTime >= PING_TIME_OUT) {
				ctx.channel().close();
			}

			ctx.channel().attr(AttributeKey.valueOf(CIMConstant.HEARTBEAT_KEY)).set(null);
		}
	}

	public void setPort(int port) {
		this.port = port;
	}

}
