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
package com.farsunset.cim.sdk.model.proto;

public final class ReplyBodyProto {
	private ReplyBodyProto() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface ModelOrBuilder extends
			// @@protoc_insertion_point(interface_extends:com.farsunset.cim.sdk.model.proto.Model)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>string key = 1;</code>
		 */
		java.lang.String getKey();

		/**
		 * <code>string key = 1;</code>
		 */
		com.google.protobuf.ByteString getKeyBytes();

		/**
		 * <code>string code = 2;</code>
		 */
		java.lang.String getCode();

		/**
		 * <code>string code = 2;</code>
		 */
		com.google.protobuf.ByteString getCodeBytes();

		/**
		 * <code>string message = 3;</code>
		 */
		java.lang.String getMessage();

		/**
		 * <code>string message = 3;</code>
		 */
		com.google.protobuf.ByteString getMessageBytes();

		/**
		 * <code>int64 timestamp = 4;</code>
		 */
		long getTimestamp();

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */
		int getDataCount();

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */
		boolean containsData(java.lang.String key);

		/**
		 * Use {@link #getDataMap()} instead.
		 */
		@java.lang.Deprecated
		java.util.Map<java.lang.String, java.lang.String> getData();

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */
		java.util.Map<java.lang.String, java.lang.String> getDataMap();

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		java.lang.String getDataOrDefault(java.lang.String key, java.lang.String defaultValue);

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		java.lang.String getDataOrThrow(java.lang.String key);
	}

	/**
	 * Protobuf type {@code com.farsunset.cim.sdk.model.proto.Model}
	 */
	public static final class Model extends com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:com.farsunset.cim.sdk.model.proto.Model)
			ModelOrBuilder {
		// Use Model.newBuilder() to construct.
		private Model(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private Model() {
			key_ = "";
			code_ = "";
			message_ = "";
			timestamp_ = 0L;
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private Model(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			int mutable_bitField0_ = 0;
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!input.skipField(tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						java.lang.String s = input.readStringRequireUtf8();

						key_ = s;
						break;
					}
					case 18: {
						java.lang.String s = input.readStringRequireUtf8();

						code_ = s;
						break;
					}
					case 26: {
						java.lang.String s = input.readStringRequireUtf8();

						message_ = s;
						break;
					}
					case 32: {

						timestamp_ = input.readInt64();
						break;
					}
					case 42: {
						if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
							data_ = com.google.protobuf.MapField.newMapField(DataDefaultEntryHolder.defaultEntry);
							mutable_bitField0_ |= 0x00000010;
						}
						com.google.protobuf.MapEntry<java.lang.String, java.lang.String> data__ = input
								.readMessage(DataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
						data_.getMutableMap().put(data__.getKey(), data__.getValue());
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			} finally {
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor;
		}

		@SuppressWarnings({ "rawtypes" })
		protected com.google.protobuf.MapField internalGetMapField(int number) {
			switch (number) {
			case 5:
				return internalGetData();
			default:
				throw new RuntimeException("Invalid map field number: " + number);
			}
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_fieldAccessorTable
					.ensureFieldAccessorsInitialized(com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.class,
							com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.Builder.class);
		}

		private int bitField0_;
		public static final int KEY_FIELD_NUMBER = 1;
		private volatile java.lang.Object key_;

		/**
		 * <code>string key = 1;</code>
		 */
		public java.lang.String getKey() {
			java.lang.Object ref = key_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				key_ = s;
				return s;
			}
		}

		/**
		 * <code>string key = 1;</code>
		 */
		public com.google.protobuf.ByteString getKeyBytes() {
			java.lang.Object ref = key_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				key_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int CODE_FIELD_NUMBER = 2;
		private volatile java.lang.Object code_;

		/**
		 * <code>string code = 2;</code>
		 */
		public java.lang.String getCode() {
			java.lang.Object ref = code_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				code_ = s;
				return s;
			}
		}

		/**
		 * <code>string code = 2;</code>
		 */
		public com.google.protobuf.ByteString getCodeBytes() {
			java.lang.Object ref = code_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				code_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int MESSAGE_FIELD_NUMBER = 3;
		private volatile java.lang.Object message_;

		/**
		 * <code>string message = 3;</code>
		 */
		public java.lang.String getMessage() {
			java.lang.Object ref = message_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				message_ = s;
				return s;
			}
		}

		/**
		 * <code>string message = 3;</code>
		 */
		public com.google.protobuf.ByteString getMessageBytes() {
			java.lang.Object ref = message_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				message_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int TIMESTAMP_FIELD_NUMBER = 4;
		private long timestamp_;

		/**
		 * <code>int64 timestamp = 4;</code>
		 */
		public long getTimestamp() {
			return timestamp_;
		}

		public static final int DATA_FIELD_NUMBER = 5;

		private static final class DataDefaultEntryHolder {
			static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry = com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
					com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_descriptor,
					com.google.protobuf.WireFormat.FieldType.STRING, "",
					com.google.protobuf.WireFormat.FieldType.STRING, "");
		}

		private com.google.protobuf.MapField<java.lang.String, java.lang.String> data_;

		private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetData() {
			if (data_ == null) {
				return com.google.protobuf.MapField.emptyMapField(DataDefaultEntryHolder.defaultEntry);
			}
			return data_;
		}

		public int getDataCount() {
			return internalGetData().getMap().size();
		}

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		public boolean containsData(java.lang.String key) {
			if (key == null) {
				throw new java.lang.NullPointerException();
			}
			return internalGetData().getMap().containsKey(key);
		}

		/**
		 * Use {@link #getDataMap()} instead.
		 */
		@java.lang.Deprecated
		public java.util.Map<java.lang.String, java.lang.String> getData() {
			return getDataMap();
		}

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
			return internalGetData().getMap();
		}

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		public java.lang.String getDataOrDefault(java.lang.String key, java.lang.String defaultValue) {
			if (key == null) {
				throw new java.lang.NullPointerException();
			}
			java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
			return map.containsKey(key) ? map.get(key) : defaultValue;
		}

		/**
		 * <code>map&lt;string, string&gt; data = 5;</code>
		 */

		public java.lang.String getDataOrThrow(java.lang.String key) {
			if (key == null) {
				throw new java.lang.NullPointerException();
			}
			java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
			if (!map.containsKey(key)) {
				throw new java.lang.IllegalArgumentException();
			}
			return map.get(key);
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			if (!getKeyBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
			}
			if (!getCodeBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
			}
			if (!getMessageBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
			}
			if (timestamp_ != 0L) {
				output.writeInt64(4, timestamp_);
			}
			com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(output, internalGetData(),
					DataDefaultEntryHolder.defaultEntry, 5);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			if (!getKeyBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
			}
			if (!getCodeBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
			}
			if (!getMessageBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
			}
			if (timestamp_ != 0L) {
				size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, timestamp_);
			}
			for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : internalGetData().getMap()
					.entrySet()) {
				com.google.protobuf.MapEntry<java.lang.String, java.lang.String> data__ = DataDefaultEntryHolder.defaultEntry
						.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, data__);
			}
			memoizedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		public boolean equals(final java.lang.Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model)) {
				return super.equals(obj);
			}
			com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model other = (com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model) obj;

			boolean result = true;
			result = result && getKey().equals(other.getKey());
			result = result && getCode().equals(other.getCode());
			result = result && getMessage().equals(other.getMessage());
			result = result && (getTimestamp() == other.getTimestamp());
			result = result && internalGetData().equals(other.internalGetData());
			return result;
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			hash = (37 * hash) + KEY_FIELD_NUMBER;
			hash = (53 * hash) + getKey().hashCode();
			hash = (37 * hash) + CODE_FIELD_NUMBER;
			hash = (53 * hash) + getCode().hashCode();
			hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
			hash = (53 * hash) + getMessage().hashCode();
			hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
			hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTimestamp());
			if (!internalGetData().getMap().isEmpty()) {
				hash = (37 * hash) + DATA_FIELD_NUMBER;
				hash = (53 * hash) + internalGetData().hashCode();
			}
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code com.farsunset.cim.sdk.model.proto.Model}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:com.farsunset.cim.sdk.model.proto.Model)
				com.farsunset.cim.sdk.model.proto.ReplyBodyProto.ModelOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor;
			}

			@SuppressWarnings({ "rawtypes" })
			protected com.google.protobuf.MapField internalGetMapField(int number) {
				switch (number) {
				case 5:
					return internalGetData();
				default:
					throw new RuntimeException("Invalid map field number: " + number);
				}
			}

			@SuppressWarnings({ "rawtypes" })
			protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
				switch (number) {
				case 5:
					return internalGetMutableData();
				default:
					throw new RuntimeException("Invalid map field number: " + number);
				}
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_fieldAccessorTable
						.ensureFieldAccessorsInitialized(com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.class,
								com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.Builder.class);
			}

			// Construct using
			// com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				}
			}

			public Builder clear() {
				super.clear();
				key_ = "";

				code_ = "";

				message_ = "";

				timestamp_ = 0L;

				internalGetMutableData().clear();
				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor;
			}

			public com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model getDefaultInstanceForType() {
				return com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.getDefaultInstance();
			}

			public com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model build() {
				com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model buildPartial() {
				com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model result = new com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				result.key_ = key_;
				result.code_ = code_;
				result.message_ = message_;
				result.timestamp_ = timestamp_;
				result.data_ = internalGetData();
				result.data_.makeImmutable();
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model) {
					return mergeFrom((com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model other) {
				if (other == com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model.getDefaultInstance())
					return this;
				if (!other.getKey().isEmpty()) {
					key_ = other.key_;
					onChanged();
				}
				if (!other.getCode().isEmpty()) {
					code_ = other.code_;
					onChanged();
				}
				if (!other.getMessage().isEmpty()) {
					message_ = other.message_;
					onChanged();
				}
				if (other.getTimestamp() != 0L) {
					setTimestamp(other.getTimestamp());
				}
				internalGetMutableData().mergeFrom(other.internalGetData());
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private java.lang.Object key_ = "";

			/**
			 * <code>string key = 1;</code>
			 */
			public java.lang.String getKey() {
				java.lang.Object ref = key_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					key_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string key = 1;</code>
			 */
			public com.google.protobuf.ByteString getKeyBytes() {
				java.lang.Object ref = key_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					key_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string key = 1;</code>
			 */
			public Builder setKey(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				key_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string key = 1;</code>
			 */
			public Builder clearKey() {

				key_ = getDefaultInstance().getKey();
				onChanged();
				return this;
			}

			/**
			 * <code>string key = 1;</code>
			 */
			public Builder setKeyBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				key_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object code_ = "";

			/**
			 * <code>string code = 2;</code>
			 */
			public java.lang.String getCode() {
				java.lang.Object ref = code_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					code_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string code = 2;</code>
			 */
			public com.google.protobuf.ByteString getCodeBytes() {
				java.lang.Object ref = code_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					code_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string code = 2;</code>
			 */
			public Builder setCode(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				code_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string code = 2;</code>
			 */
			public Builder clearCode() {

				code_ = getDefaultInstance().getCode();
				onChanged();
				return this;
			}

			/**
			 * <code>string code = 2;</code>
			 */
			public Builder setCodeBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				code_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object message_ = "";

			/**
			 * <code>string message = 3;</code>
			 */
			public java.lang.String getMessage() {
				java.lang.Object ref = message_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					message_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string message = 3;</code>
			 */
			public com.google.protobuf.ByteString getMessageBytes() {
				java.lang.Object ref = message_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					message_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string message = 3;</code>
			 */
			public Builder setMessage(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				message_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string message = 3;</code>
			 */
			public Builder clearMessage() {

				message_ = getDefaultInstance().getMessage();
				onChanged();
				return this;
			}

			/**
			 * <code>string message = 3;</code>
			 */
			public Builder setMessageBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				message_ = value;
				onChanged();
				return this;
			}

			private long timestamp_;

			/**
			 * <code>int64 timestamp = 4;</code>
			 */
			public long getTimestamp() {
				return timestamp_;
			}

			/**
			 * <code>int64 timestamp = 4;</code>
			 */
			public Builder setTimestamp(long value) {

				timestamp_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>int64 timestamp = 4;</code>
			 */
			public Builder clearTimestamp() {

				timestamp_ = 0L;
				onChanged();
				return this;
			}

			private com.google.protobuf.MapField<java.lang.String, java.lang.String> data_;

			private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetData() {
				if (data_ == null) {
					return com.google.protobuf.MapField.emptyMapField(DataDefaultEntryHolder.defaultEntry);
				}
				return data_;
			}

			private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMutableData() {
				onChanged();
				;
				if (data_ == null) {
					data_ = com.google.protobuf.MapField.newMapField(DataDefaultEntryHolder.defaultEntry);
				}
				if (!data_.isMutable()) {
					data_ = data_.copy();
				}
				return data_;
			}

			public int getDataCount() {
				return internalGetData().getMap().size();
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public boolean containsData(java.lang.String key) {
				if (key == null) {
					throw new java.lang.NullPointerException();
				}
				return internalGetData().getMap().containsKey(key);
			}

			/**
			 * Use {@link #getDataMap()} instead.
			 */
			@java.lang.Deprecated
			public java.util.Map<java.lang.String, java.lang.String> getData() {
				return getDataMap();
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
				return internalGetData().getMap();
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public java.lang.String getDataOrDefault(java.lang.String key, java.lang.String defaultValue) {
				if (key == null) {
					throw new java.lang.NullPointerException();
				}
				java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
				return map.containsKey(key) ? map.get(key) : defaultValue;
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public java.lang.String getDataOrThrow(java.lang.String key) {
				if (key == null) {
					throw new java.lang.NullPointerException();
				}
				java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
				if (!map.containsKey(key)) {
					throw new java.lang.IllegalArgumentException();
				}
				return map.get(key);
			}

			public Builder clearData() {
				internalGetMutableData().getMutableMap().clear();
				return this;
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public Builder removeData(java.lang.String key) {
				if (key == null) {
					throw new java.lang.NullPointerException();
				}
				internalGetMutableData().getMutableMap().remove(key);
				return this;
			}

			/**
			 * Use alternate mutation accessors instead.
			 */
			@java.lang.Deprecated
			public java.util.Map<java.lang.String, java.lang.String> getMutableData() {
				return internalGetMutableData().getMutableMap();
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */
			public Builder putData(java.lang.String key, java.lang.String value) {
				if (key == null) {
					throw new java.lang.NullPointerException();
				}
				if (value == null) {
					throw new java.lang.NullPointerException();
				}
				internalGetMutableData().getMutableMap().put(key, value);
				return this;
			}

			/**
			 * <code>map&lt;string, string&gt; data = 5;</code>
			 */

			public Builder putAllData(java.util.Map<java.lang.String, java.lang.String> values) {
				internalGetMutableData().getMutableMap().putAll(values);
				return this;
			}

			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return this;
			}

			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return this;
			}

			// @@protoc_insertion_point(builder_scope:com.farsunset.cim.sdk.model.proto.Model)
		}

		// @@protoc_insertion_point(class_scope:com.farsunset.cim.sdk.model.proto.Model)
		private static final com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model();
		}

		public static com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser<Model> PARSER = new com.google.protobuf.AbstractParser<Model>() {
			public Model parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Model(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser<Model> parser() {
			return PARSER;
		}

		@java.lang.Override
		public com.google.protobuf.Parser<Model> getParserForType() {
			return PARSER;
		}

		public com.farsunset.cim.sdk.model.proto.ReplyBodyProto.Model getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_farsunset_cim_sdk_model_proto_Model_fieldAccessorTable;
	private static final com.google.protobuf.Descriptors.Descriptor internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\017ReplyBody.proto\022!com.farsunset.cim.sdk"
				+ ".model.proto\"\265\001\n\005Model\022\013\n\003key\030\001 \001(\t\022\014\n\004c"
				+ "ode\030\002 \001(\t\022\017\n\007message\030\003 \001(\t\022\021\n\ttimestamp\030"
				+ "\004 \001(\003\022@\n\004data\030\005 \003(\01322.com.farsunset.cim."
				+ "sdk.model.proto.Model.DataEntry\032+\n\tDataE"
				+ "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\020B\016"
				+ "ReplyBodyProtob\006proto3" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
		internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_com_farsunset_cim_sdk_model_proto_Model_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor,
				new java.lang.String[] { "Key", "Code", "Message", "Timestamp", "Data", });
		internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_descriptor = internal_static_com_farsunset_cim_sdk_model_proto_Model_descriptor
				.getNestedTypes().get(0);
		internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_com_farsunset_cim_sdk_model_proto_Model_DataEntry_descriptor,
				new java.lang.String[] { "Key", "Value", });
	}

	// @@protoc_insertion_point(outer_class_scope)
}
