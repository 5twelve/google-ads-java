// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/enums/criterion_type.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.enums;

/**
 * <pre>
 * The possible types of a criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.enums.CriterionTypeEnum}
 */
public final class CriterionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.enums.CriterionTypeEnum)
    CriterionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CriterionTypeEnum.newBuilder() to construct.
  private CriterionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CriterionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CriterionTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.enums.CriterionTypeProto.internal_static_google_ads_googleads_v19_enums_CriterionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.enums.CriterionTypeProto.internal_static_google_ads_googleads_v19_enums_CriterionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.enums.CriterionTypeEnum.class, com.google.ads.googleads.v19.enums.CriterionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible criterion types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.enums.CriterionTypeEnum.CriterionType}
   */
  public enum CriterionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Keyword, for example, 'mars cruise'.
     * </pre>
     *
     * <code>KEYWORD = 2;</code>
     */
    KEYWORD(2),
    /**
     * <pre>
     * Placement, also known as Website, for example, 'www.flowers4sale.com'
     * </pre>
     *
     * <code>PLACEMENT = 3;</code>
     */
    PLACEMENT(3),
    /**
     * <pre>
     * Mobile application categories to target.
     * </pre>
     *
     * <code>MOBILE_APP_CATEGORY = 4;</code>
     */
    MOBILE_APP_CATEGORY(4),
    /**
     * <pre>
     * Mobile applications to target.
     * </pre>
     *
     * <code>MOBILE_APPLICATION = 5;</code>
     */
    MOBILE_APPLICATION(5),
    /**
     * <pre>
     * Devices to target.
     * </pre>
     *
     * <code>DEVICE = 6;</code>
     */
    DEVICE(6),
    /**
     * <pre>
     * Locations to target.
     * </pre>
     *
     * <code>LOCATION = 7;</code>
     */
    LOCATION(7),
    /**
     * <pre>
     * Listing groups to target.
     * </pre>
     *
     * <code>LISTING_GROUP = 8;</code>
     */
    LISTING_GROUP(8),
    /**
     * <pre>
     * Ad Schedule.
     * </pre>
     *
     * <code>AD_SCHEDULE = 9;</code>
     */
    AD_SCHEDULE(9),
    /**
     * <pre>
     * Age range.
     * </pre>
     *
     * <code>AGE_RANGE = 10;</code>
     */
    AGE_RANGE(10),
    /**
     * <pre>
     * Gender.
     * </pre>
     *
     * <code>GENDER = 11;</code>
     */
    GENDER(11),
    /**
     * <pre>
     * Income Range.
     * </pre>
     *
     * <code>INCOME_RANGE = 12;</code>
     */
    INCOME_RANGE(12),
    /**
     * <pre>
     * Parental status.
     * </pre>
     *
     * <code>PARENTAL_STATUS = 13;</code>
     */
    PARENTAL_STATUS(13),
    /**
     * <pre>
     * YouTube Video.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO = 14;</code>
     */
    YOUTUBE_VIDEO(14),
    /**
     * <pre>
     * YouTube Channel.
     * </pre>
     *
     * <code>YOUTUBE_CHANNEL = 15;</code>
     */
    YOUTUBE_CHANNEL(15),
    /**
     * <pre>
     * User list.
     * </pre>
     *
     * <code>USER_LIST = 16;</code>
     */
    USER_LIST(16),
    /**
     * <pre>
     * Proximity.
     * </pre>
     *
     * <code>PROXIMITY = 17;</code>
     */
    PROXIMITY(17),
    /**
     * <pre>
     * A topic target on the display network (for example, "Pets &amp; Animals").
     * </pre>
     *
     * <code>TOPIC = 18;</code>
     */
    TOPIC(18),
    /**
     * <pre>
     * Listing scope to target.
     * </pre>
     *
     * <code>LISTING_SCOPE = 19;</code>
     */
    LISTING_SCOPE(19),
    /**
     * <pre>
     * Language.
     * </pre>
     *
     * <code>LANGUAGE = 20;</code>
     */
    LANGUAGE(20),
    /**
     * <pre>
     * IpBlock.
     * </pre>
     *
     * <code>IP_BLOCK = 21;</code>
     */
    IP_BLOCK(21),
    /**
     * <pre>
     * Content Label for category exclusion.
     * </pre>
     *
     * <code>CONTENT_LABEL = 22;</code>
     */
    CONTENT_LABEL(22),
    /**
     * <pre>
     * Carrier.
     * </pre>
     *
     * <code>CARRIER = 23;</code>
     */
    CARRIER(23),
    /**
     * <pre>
     * A category the user is interested in.
     * </pre>
     *
     * <code>USER_INTEREST = 24;</code>
     */
    USER_INTEREST(24),
    /**
     * <pre>
     * Webpage criterion for dynamic search ads.
     * </pre>
     *
     * <code>WEBPAGE = 25;</code>
     */
    WEBPAGE(25),
    /**
     * <pre>
     * Operating system version.
     * </pre>
     *
     * <code>OPERATING_SYSTEM_VERSION = 26;</code>
     */
    OPERATING_SYSTEM_VERSION(26),
    /**
     * <pre>
     * App payment model.
     * </pre>
     *
     * <code>APP_PAYMENT_MODEL = 27;</code>
     */
    APP_PAYMENT_MODEL(27),
    /**
     * <pre>
     * Mobile device.
     * </pre>
     *
     * <code>MOBILE_DEVICE = 28;</code>
     */
    MOBILE_DEVICE(28),
    /**
     * <pre>
     * Custom affinity.
     * </pre>
     *
     * <code>CUSTOM_AFFINITY = 29;</code>
     */
    CUSTOM_AFFINITY(29),
    /**
     * <pre>
     * Custom intent.
     * </pre>
     *
     * <code>CUSTOM_INTENT = 30;</code>
     */
    CUSTOM_INTENT(30),
    /**
     * <pre>
     * Location group.
     * </pre>
     *
     * <code>LOCATION_GROUP = 31;</code>
     */
    LOCATION_GROUP(31),
    /**
     * <pre>
     * Custom audience
     * </pre>
     *
     * <code>CUSTOM_AUDIENCE = 32;</code>
     */
    CUSTOM_AUDIENCE(32),
    /**
     * <pre>
     * Combined audience
     * </pre>
     *
     * <code>COMBINED_AUDIENCE = 33;</code>
     */
    COMBINED_AUDIENCE(33),
    /**
     * <pre>
     * Smart Campaign keyword theme
     * </pre>
     *
     * <code>KEYWORD_THEME = 34;</code>
     */
    KEYWORD_THEME(34),
    /**
     * <pre>
     * Audience
     * </pre>
     *
     * <code>AUDIENCE = 35;</code>
     */
    AUDIENCE(35),
    /**
     * <pre>
     * Negative Keyword List
     * </pre>
     *
     * <code>NEGATIVE_KEYWORD_LIST = 36;</code>
     */
    NEGATIVE_KEYWORD_LIST(36),
    /**
     * <pre>
     * Local Services Ads Service ID.
     * </pre>
     *
     * <code>LOCAL_SERVICE_ID = 37;</code>
     */
    LOCAL_SERVICE_ID(37),
    /**
     * <pre>
     * Search Theme.
     * </pre>
     *
     * <code>SEARCH_THEME = 38;</code>
     */
    SEARCH_THEME(38),
    /**
     * <pre>
     * Brand
     * </pre>
     *
     * <code>BRAND = 39;</code>
     */
    BRAND(39),
    /**
     * <pre>
     * Brand List
     * </pre>
     *
     * <code>BRAND_LIST = 40;</code>
     */
    BRAND_LIST(40),
    /**
     * <pre>
     * Life Event
     * </pre>
     *
     * <code>LIFE_EVENT = 41;</code>
     */
    LIFE_EVENT(41),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Keyword, for example, 'mars cruise'.
     * </pre>
     *
     * <code>KEYWORD = 2;</code>
     */
    public static final int KEYWORD_VALUE = 2;
    /**
     * <pre>
     * Placement, also known as Website, for example, 'www.flowers4sale.com'
     * </pre>
     *
     * <code>PLACEMENT = 3;</code>
     */
    public static final int PLACEMENT_VALUE = 3;
    /**
     * <pre>
     * Mobile application categories to target.
     * </pre>
     *
     * <code>MOBILE_APP_CATEGORY = 4;</code>
     */
    public static final int MOBILE_APP_CATEGORY_VALUE = 4;
    /**
     * <pre>
     * Mobile applications to target.
     * </pre>
     *
     * <code>MOBILE_APPLICATION = 5;</code>
     */
    public static final int MOBILE_APPLICATION_VALUE = 5;
    /**
     * <pre>
     * Devices to target.
     * </pre>
     *
     * <code>DEVICE = 6;</code>
     */
    public static final int DEVICE_VALUE = 6;
    /**
     * <pre>
     * Locations to target.
     * </pre>
     *
     * <code>LOCATION = 7;</code>
     */
    public static final int LOCATION_VALUE = 7;
    /**
     * <pre>
     * Listing groups to target.
     * </pre>
     *
     * <code>LISTING_GROUP = 8;</code>
     */
    public static final int LISTING_GROUP_VALUE = 8;
    /**
     * <pre>
     * Ad Schedule.
     * </pre>
     *
     * <code>AD_SCHEDULE = 9;</code>
     */
    public static final int AD_SCHEDULE_VALUE = 9;
    /**
     * <pre>
     * Age range.
     * </pre>
     *
     * <code>AGE_RANGE = 10;</code>
     */
    public static final int AGE_RANGE_VALUE = 10;
    /**
     * <pre>
     * Gender.
     * </pre>
     *
     * <code>GENDER = 11;</code>
     */
    public static final int GENDER_VALUE = 11;
    /**
     * <pre>
     * Income Range.
     * </pre>
     *
     * <code>INCOME_RANGE = 12;</code>
     */
    public static final int INCOME_RANGE_VALUE = 12;
    /**
     * <pre>
     * Parental status.
     * </pre>
     *
     * <code>PARENTAL_STATUS = 13;</code>
     */
    public static final int PARENTAL_STATUS_VALUE = 13;
    /**
     * <pre>
     * YouTube Video.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO = 14;</code>
     */
    public static final int YOUTUBE_VIDEO_VALUE = 14;
    /**
     * <pre>
     * YouTube Channel.
     * </pre>
     *
     * <code>YOUTUBE_CHANNEL = 15;</code>
     */
    public static final int YOUTUBE_CHANNEL_VALUE = 15;
    /**
     * <pre>
     * User list.
     * </pre>
     *
     * <code>USER_LIST = 16;</code>
     */
    public static final int USER_LIST_VALUE = 16;
    /**
     * <pre>
     * Proximity.
     * </pre>
     *
     * <code>PROXIMITY = 17;</code>
     */
    public static final int PROXIMITY_VALUE = 17;
    /**
     * <pre>
     * A topic target on the display network (for example, "Pets &amp; Animals").
     * </pre>
     *
     * <code>TOPIC = 18;</code>
     */
    public static final int TOPIC_VALUE = 18;
    /**
     * <pre>
     * Listing scope to target.
     * </pre>
     *
     * <code>LISTING_SCOPE = 19;</code>
     */
    public static final int LISTING_SCOPE_VALUE = 19;
    /**
     * <pre>
     * Language.
     * </pre>
     *
     * <code>LANGUAGE = 20;</code>
     */
    public static final int LANGUAGE_VALUE = 20;
    /**
     * <pre>
     * IpBlock.
     * </pre>
     *
     * <code>IP_BLOCK = 21;</code>
     */
    public static final int IP_BLOCK_VALUE = 21;
    /**
     * <pre>
     * Content Label for category exclusion.
     * </pre>
     *
     * <code>CONTENT_LABEL = 22;</code>
     */
    public static final int CONTENT_LABEL_VALUE = 22;
    /**
     * <pre>
     * Carrier.
     * </pre>
     *
     * <code>CARRIER = 23;</code>
     */
    public static final int CARRIER_VALUE = 23;
    /**
     * <pre>
     * A category the user is interested in.
     * </pre>
     *
     * <code>USER_INTEREST = 24;</code>
     */
    public static final int USER_INTEREST_VALUE = 24;
    /**
     * <pre>
     * Webpage criterion for dynamic search ads.
     * </pre>
     *
     * <code>WEBPAGE = 25;</code>
     */
    public static final int WEBPAGE_VALUE = 25;
    /**
     * <pre>
     * Operating system version.
     * </pre>
     *
     * <code>OPERATING_SYSTEM_VERSION = 26;</code>
     */
    public static final int OPERATING_SYSTEM_VERSION_VALUE = 26;
    /**
     * <pre>
     * App payment model.
     * </pre>
     *
     * <code>APP_PAYMENT_MODEL = 27;</code>
     */
    public static final int APP_PAYMENT_MODEL_VALUE = 27;
    /**
     * <pre>
     * Mobile device.
     * </pre>
     *
     * <code>MOBILE_DEVICE = 28;</code>
     */
    public static final int MOBILE_DEVICE_VALUE = 28;
    /**
     * <pre>
     * Custom affinity.
     * </pre>
     *
     * <code>CUSTOM_AFFINITY = 29;</code>
     */
    public static final int CUSTOM_AFFINITY_VALUE = 29;
    /**
     * <pre>
     * Custom intent.
     * </pre>
     *
     * <code>CUSTOM_INTENT = 30;</code>
     */
    public static final int CUSTOM_INTENT_VALUE = 30;
    /**
     * <pre>
     * Location group.
     * </pre>
     *
     * <code>LOCATION_GROUP = 31;</code>
     */
    public static final int LOCATION_GROUP_VALUE = 31;
    /**
     * <pre>
     * Custom audience
     * </pre>
     *
     * <code>CUSTOM_AUDIENCE = 32;</code>
     */
    public static final int CUSTOM_AUDIENCE_VALUE = 32;
    /**
     * <pre>
     * Combined audience
     * </pre>
     *
     * <code>COMBINED_AUDIENCE = 33;</code>
     */
    public static final int COMBINED_AUDIENCE_VALUE = 33;
    /**
     * <pre>
     * Smart Campaign keyword theme
     * </pre>
     *
     * <code>KEYWORD_THEME = 34;</code>
     */
    public static final int KEYWORD_THEME_VALUE = 34;
    /**
     * <pre>
     * Audience
     * </pre>
     *
     * <code>AUDIENCE = 35;</code>
     */
    public static final int AUDIENCE_VALUE = 35;
    /**
     * <pre>
     * Negative Keyword List
     * </pre>
     *
     * <code>NEGATIVE_KEYWORD_LIST = 36;</code>
     */
    public static final int NEGATIVE_KEYWORD_LIST_VALUE = 36;
    /**
     * <pre>
     * Local Services Ads Service ID.
     * </pre>
     *
     * <code>LOCAL_SERVICE_ID = 37;</code>
     */
    public static final int LOCAL_SERVICE_ID_VALUE = 37;
    /**
     * <pre>
     * Search Theme.
     * </pre>
     *
     * <code>SEARCH_THEME = 38;</code>
     */
    public static final int SEARCH_THEME_VALUE = 38;
    /**
     * <pre>
     * Brand
     * </pre>
     *
     * <code>BRAND = 39;</code>
     */
    public static final int BRAND_VALUE = 39;
    /**
     * <pre>
     * Brand List
     * </pre>
     *
     * <code>BRAND_LIST = 40;</code>
     */
    public static final int BRAND_LIST_VALUE = 40;
    /**
     * <pre>
     * Life Event
     * </pre>
     *
     * <code>LIFE_EVENT = 41;</code>
     */
    public static final int LIFE_EVENT_VALUE = 41;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CriterionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CriterionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return KEYWORD;
        case 3: return PLACEMENT;
        case 4: return MOBILE_APP_CATEGORY;
        case 5: return MOBILE_APPLICATION;
        case 6: return DEVICE;
        case 7: return LOCATION;
        case 8: return LISTING_GROUP;
        case 9: return AD_SCHEDULE;
        case 10: return AGE_RANGE;
        case 11: return GENDER;
        case 12: return INCOME_RANGE;
        case 13: return PARENTAL_STATUS;
        case 14: return YOUTUBE_VIDEO;
        case 15: return YOUTUBE_CHANNEL;
        case 16: return USER_LIST;
        case 17: return PROXIMITY;
        case 18: return TOPIC;
        case 19: return LISTING_SCOPE;
        case 20: return LANGUAGE;
        case 21: return IP_BLOCK;
        case 22: return CONTENT_LABEL;
        case 23: return CARRIER;
        case 24: return USER_INTEREST;
        case 25: return WEBPAGE;
        case 26: return OPERATING_SYSTEM_VERSION;
        case 27: return APP_PAYMENT_MODEL;
        case 28: return MOBILE_DEVICE;
        case 29: return CUSTOM_AFFINITY;
        case 30: return CUSTOM_INTENT;
        case 31: return LOCATION_GROUP;
        case 32: return CUSTOM_AUDIENCE;
        case 33: return COMBINED_AUDIENCE;
        case 34: return KEYWORD_THEME;
        case 35: return AUDIENCE;
        case 36: return NEGATIVE_KEYWORD_LIST;
        case 37: return LOCAL_SERVICE_ID;
        case 38: return SEARCH_THEME;
        case 39: return BRAND;
        case 40: return BRAND_LIST;
        case 41: return LIFE_EVENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CriterionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CriterionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CriterionType>() {
            public CriterionType findValueByNumber(int number) {
              return CriterionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.enums.CriterionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CriterionType[] VALUES = values();

    public static CriterionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CriterionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.enums.CriterionTypeEnum.CriterionType)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v19.enums.CriterionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.enums.CriterionTypeEnum other = (com.google.ads.googleads.v19.enums.CriterionTypeEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v19.enums.CriterionTypeEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The possible types of a criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.enums.CriterionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.enums.CriterionTypeEnum)
      com.google.ads.googleads.v19.enums.CriterionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.enums.CriterionTypeProto.internal_static_google_ads_googleads_v19_enums_CriterionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.enums.CriterionTypeProto.internal_static_google_ads_googleads_v19_enums_CriterionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.enums.CriterionTypeEnum.class, com.google.ads.googleads.v19.enums.CriterionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.enums.CriterionTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.enums.CriterionTypeProto.internal_static_google_ads_googleads_v19_enums_CriterionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.CriterionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.enums.CriterionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.CriterionTypeEnum build() {
      com.google.ads.googleads.v19.enums.CriterionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.CriterionTypeEnum buildPartial() {
      com.google.ads.googleads.v19.enums.CriterionTypeEnum result = new com.google.ads.googleads.v19.enums.CriterionTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v19.enums.CriterionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v19.enums.CriterionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.enums.CriterionTypeEnum other) {
      if (other == com.google.ads.googleads.v19.enums.CriterionTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.enums.CriterionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.enums.CriterionTypeEnum)
  private static final com.google.ads.googleads.v19.enums.CriterionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.enums.CriterionTypeEnum();
  }

  public static com.google.ads.googleads.v19.enums.CriterionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CriterionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<CriterionTypeEnum>() {
    @java.lang.Override
    public CriterionTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CriterionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CriterionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.enums.CriterionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

