// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/enums/promotion_extension_occasion.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.enums;

/**
 * <pre>
 * Container for enum describing a promotion extension occasion.
 * For more information about the occasions  check:
 * https://support.google.com/google-ads/answer/7367521
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum}
 */
public final class PromotionExtensionOccasionEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)
    PromotionExtensionOccasionEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromotionExtensionOccasionEnum.newBuilder() to construct.
  private PromotionExtensionOccasionEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromotionExtensionOccasionEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromotionExtensionOccasionEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionProto.internal_static_google_ads_googleads_v19_enums_PromotionExtensionOccasionEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionProto.internal_static_google_ads_googleads_v19_enums_PromotionExtensionOccasionEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.class, com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.Builder.class);
  }

  /**
   * <pre>
   * A promotion extension occasion.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion}
   */
  public enum PromotionExtensionOccasion
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
     * New Year's.
     * </pre>
     *
     * <code>NEW_YEARS = 2;</code>
     */
    NEW_YEARS(2),
    /**
     * <pre>
     * Chinese New Year.
     * </pre>
     *
     * <code>CHINESE_NEW_YEAR = 3;</code>
     */
    CHINESE_NEW_YEAR(3),
    /**
     * <pre>
     * Valentine's Day.
     * </pre>
     *
     * <code>VALENTINES_DAY = 4;</code>
     */
    VALENTINES_DAY(4),
    /**
     * <pre>
     * Easter.
     * </pre>
     *
     * <code>EASTER = 5;</code>
     */
    EASTER(5),
    /**
     * <pre>
     * Mother's Day.
     * </pre>
     *
     * <code>MOTHERS_DAY = 6;</code>
     */
    MOTHERS_DAY(6),
    /**
     * <pre>
     * Father's Day.
     * </pre>
     *
     * <code>FATHERS_DAY = 7;</code>
     */
    FATHERS_DAY(7),
    /**
     * <pre>
     * Labor Day.
     * </pre>
     *
     * <code>LABOR_DAY = 8;</code>
     */
    LABOR_DAY(8),
    /**
     * <pre>
     * Back To School.
     * </pre>
     *
     * <code>BACK_TO_SCHOOL = 9;</code>
     */
    BACK_TO_SCHOOL(9),
    /**
     * <pre>
     * Halloween.
     * </pre>
     *
     * <code>HALLOWEEN = 10;</code>
     */
    HALLOWEEN(10),
    /**
     * <pre>
     * Black Friday.
     * </pre>
     *
     * <code>BLACK_FRIDAY = 11;</code>
     */
    BLACK_FRIDAY(11),
    /**
     * <pre>
     * Cyber Monday.
     * </pre>
     *
     * <code>CYBER_MONDAY = 12;</code>
     */
    CYBER_MONDAY(12),
    /**
     * <pre>
     * Christmas.
     * </pre>
     *
     * <code>CHRISTMAS = 13;</code>
     */
    CHRISTMAS(13),
    /**
     * <pre>
     * Boxing Day.
     * </pre>
     *
     * <code>BOXING_DAY = 14;</code>
     */
    BOXING_DAY(14),
    /**
     * <pre>
     * Independence Day in any country.
     * </pre>
     *
     * <code>INDEPENDENCE_DAY = 15;</code>
     */
    INDEPENDENCE_DAY(15),
    /**
     * <pre>
     * National Day in any country.
     * </pre>
     *
     * <code>NATIONAL_DAY = 16;</code>
     */
    NATIONAL_DAY(16),
    /**
     * <pre>
     * End of any season.
     * </pre>
     *
     * <code>END_OF_SEASON = 17;</code>
     */
    END_OF_SEASON(17),
    /**
     * <pre>
     * Winter Sale.
     * </pre>
     *
     * <code>WINTER_SALE = 18;</code>
     */
    WINTER_SALE(18),
    /**
     * <pre>
     * Summer sale.
     * </pre>
     *
     * <code>SUMMER_SALE = 19;</code>
     */
    SUMMER_SALE(19),
    /**
     * <pre>
     * Fall Sale.
     * </pre>
     *
     * <code>FALL_SALE = 20;</code>
     */
    FALL_SALE(20),
    /**
     * <pre>
     * Spring Sale.
     * </pre>
     *
     * <code>SPRING_SALE = 21;</code>
     */
    SPRING_SALE(21),
    /**
     * <pre>
     * Ramadan.
     * </pre>
     *
     * <code>RAMADAN = 22;</code>
     */
    RAMADAN(22),
    /**
     * <pre>
     * Eid al-Fitr.
     * </pre>
     *
     * <code>EID_AL_FITR = 23;</code>
     */
    EID_AL_FITR(23),
    /**
     * <pre>
     * Eid al-Adha.
     * </pre>
     *
     * <code>EID_AL_ADHA = 24;</code>
     */
    EID_AL_ADHA(24),
    /**
     * <pre>
     * Singles Day.
     * </pre>
     *
     * <code>SINGLES_DAY = 25;</code>
     */
    SINGLES_DAY(25),
    /**
     * <pre>
     * Women's Day.
     * </pre>
     *
     * <code>WOMENS_DAY = 26;</code>
     */
    WOMENS_DAY(26),
    /**
     * <pre>
     * Holi.
     * </pre>
     *
     * <code>HOLI = 27;</code>
     */
    HOLI(27),
    /**
     * <pre>
     * Parent's Day.
     * </pre>
     *
     * <code>PARENTS_DAY = 28;</code>
     */
    PARENTS_DAY(28),
    /**
     * <pre>
     * St. Nicholas Day.
     * </pre>
     *
     * <code>ST_NICHOLAS_DAY = 29;</code>
     */
    ST_NICHOLAS_DAY(29),
    /**
     * <pre>
     * Carnival.
     * </pre>
     *
     * <code>CARNIVAL = 30;</code>
     */
    CARNIVAL(30),
    /**
     * <pre>
     * Epiphany, also known as Three Kings' Day.
     * </pre>
     *
     * <code>EPIPHANY = 31;</code>
     */
    EPIPHANY(31),
    /**
     * <pre>
     * Rosh Hashanah.
     * </pre>
     *
     * <code>ROSH_HASHANAH = 32;</code>
     */
    ROSH_HASHANAH(32),
    /**
     * <pre>
     * Passover.
     * </pre>
     *
     * <code>PASSOVER = 33;</code>
     */
    PASSOVER(33),
    /**
     * <pre>
     * Hanukkah.
     * </pre>
     *
     * <code>HANUKKAH = 34;</code>
     */
    HANUKKAH(34),
    /**
     * <pre>
     * Diwali.
     * </pre>
     *
     * <code>DIWALI = 35;</code>
     */
    DIWALI(35),
    /**
     * <pre>
     * Navratri.
     * </pre>
     *
     * <code>NAVRATRI = 36;</code>
     */
    NAVRATRI(36),
    /**
     * <pre>
     * Available in Thai: Songkran.
     * </pre>
     *
     * <code>SONGKRAN = 37;</code>
     */
    SONGKRAN(37),
    /**
     * <pre>
     * Available in Japanese: Year-end Gift.
     * </pre>
     *
     * <code>YEAR_END_GIFT = 38;</code>
     */
    YEAR_END_GIFT(38),
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
     * New Year's.
     * </pre>
     *
     * <code>NEW_YEARS = 2;</code>
     */
    public static final int NEW_YEARS_VALUE = 2;
    /**
     * <pre>
     * Chinese New Year.
     * </pre>
     *
     * <code>CHINESE_NEW_YEAR = 3;</code>
     */
    public static final int CHINESE_NEW_YEAR_VALUE = 3;
    /**
     * <pre>
     * Valentine's Day.
     * </pre>
     *
     * <code>VALENTINES_DAY = 4;</code>
     */
    public static final int VALENTINES_DAY_VALUE = 4;
    /**
     * <pre>
     * Easter.
     * </pre>
     *
     * <code>EASTER = 5;</code>
     */
    public static final int EASTER_VALUE = 5;
    /**
     * <pre>
     * Mother's Day.
     * </pre>
     *
     * <code>MOTHERS_DAY = 6;</code>
     */
    public static final int MOTHERS_DAY_VALUE = 6;
    /**
     * <pre>
     * Father's Day.
     * </pre>
     *
     * <code>FATHERS_DAY = 7;</code>
     */
    public static final int FATHERS_DAY_VALUE = 7;
    /**
     * <pre>
     * Labor Day.
     * </pre>
     *
     * <code>LABOR_DAY = 8;</code>
     */
    public static final int LABOR_DAY_VALUE = 8;
    /**
     * <pre>
     * Back To School.
     * </pre>
     *
     * <code>BACK_TO_SCHOOL = 9;</code>
     */
    public static final int BACK_TO_SCHOOL_VALUE = 9;
    /**
     * <pre>
     * Halloween.
     * </pre>
     *
     * <code>HALLOWEEN = 10;</code>
     */
    public static final int HALLOWEEN_VALUE = 10;
    /**
     * <pre>
     * Black Friday.
     * </pre>
     *
     * <code>BLACK_FRIDAY = 11;</code>
     */
    public static final int BLACK_FRIDAY_VALUE = 11;
    /**
     * <pre>
     * Cyber Monday.
     * </pre>
     *
     * <code>CYBER_MONDAY = 12;</code>
     */
    public static final int CYBER_MONDAY_VALUE = 12;
    /**
     * <pre>
     * Christmas.
     * </pre>
     *
     * <code>CHRISTMAS = 13;</code>
     */
    public static final int CHRISTMAS_VALUE = 13;
    /**
     * <pre>
     * Boxing Day.
     * </pre>
     *
     * <code>BOXING_DAY = 14;</code>
     */
    public static final int BOXING_DAY_VALUE = 14;
    /**
     * <pre>
     * Independence Day in any country.
     * </pre>
     *
     * <code>INDEPENDENCE_DAY = 15;</code>
     */
    public static final int INDEPENDENCE_DAY_VALUE = 15;
    /**
     * <pre>
     * National Day in any country.
     * </pre>
     *
     * <code>NATIONAL_DAY = 16;</code>
     */
    public static final int NATIONAL_DAY_VALUE = 16;
    /**
     * <pre>
     * End of any season.
     * </pre>
     *
     * <code>END_OF_SEASON = 17;</code>
     */
    public static final int END_OF_SEASON_VALUE = 17;
    /**
     * <pre>
     * Winter Sale.
     * </pre>
     *
     * <code>WINTER_SALE = 18;</code>
     */
    public static final int WINTER_SALE_VALUE = 18;
    /**
     * <pre>
     * Summer sale.
     * </pre>
     *
     * <code>SUMMER_SALE = 19;</code>
     */
    public static final int SUMMER_SALE_VALUE = 19;
    /**
     * <pre>
     * Fall Sale.
     * </pre>
     *
     * <code>FALL_SALE = 20;</code>
     */
    public static final int FALL_SALE_VALUE = 20;
    /**
     * <pre>
     * Spring Sale.
     * </pre>
     *
     * <code>SPRING_SALE = 21;</code>
     */
    public static final int SPRING_SALE_VALUE = 21;
    /**
     * <pre>
     * Ramadan.
     * </pre>
     *
     * <code>RAMADAN = 22;</code>
     */
    public static final int RAMADAN_VALUE = 22;
    /**
     * <pre>
     * Eid al-Fitr.
     * </pre>
     *
     * <code>EID_AL_FITR = 23;</code>
     */
    public static final int EID_AL_FITR_VALUE = 23;
    /**
     * <pre>
     * Eid al-Adha.
     * </pre>
     *
     * <code>EID_AL_ADHA = 24;</code>
     */
    public static final int EID_AL_ADHA_VALUE = 24;
    /**
     * <pre>
     * Singles Day.
     * </pre>
     *
     * <code>SINGLES_DAY = 25;</code>
     */
    public static final int SINGLES_DAY_VALUE = 25;
    /**
     * <pre>
     * Women's Day.
     * </pre>
     *
     * <code>WOMENS_DAY = 26;</code>
     */
    public static final int WOMENS_DAY_VALUE = 26;
    /**
     * <pre>
     * Holi.
     * </pre>
     *
     * <code>HOLI = 27;</code>
     */
    public static final int HOLI_VALUE = 27;
    /**
     * <pre>
     * Parent's Day.
     * </pre>
     *
     * <code>PARENTS_DAY = 28;</code>
     */
    public static final int PARENTS_DAY_VALUE = 28;
    /**
     * <pre>
     * St. Nicholas Day.
     * </pre>
     *
     * <code>ST_NICHOLAS_DAY = 29;</code>
     */
    public static final int ST_NICHOLAS_DAY_VALUE = 29;
    /**
     * <pre>
     * Carnival.
     * </pre>
     *
     * <code>CARNIVAL = 30;</code>
     */
    public static final int CARNIVAL_VALUE = 30;
    /**
     * <pre>
     * Epiphany, also known as Three Kings' Day.
     * </pre>
     *
     * <code>EPIPHANY = 31;</code>
     */
    public static final int EPIPHANY_VALUE = 31;
    /**
     * <pre>
     * Rosh Hashanah.
     * </pre>
     *
     * <code>ROSH_HASHANAH = 32;</code>
     */
    public static final int ROSH_HASHANAH_VALUE = 32;
    /**
     * <pre>
     * Passover.
     * </pre>
     *
     * <code>PASSOVER = 33;</code>
     */
    public static final int PASSOVER_VALUE = 33;
    /**
     * <pre>
     * Hanukkah.
     * </pre>
     *
     * <code>HANUKKAH = 34;</code>
     */
    public static final int HANUKKAH_VALUE = 34;
    /**
     * <pre>
     * Diwali.
     * </pre>
     *
     * <code>DIWALI = 35;</code>
     */
    public static final int DIWALI_VALUE = 35;
    /**
     * <pre>
     * Navratri.
     * </pre>
     *
     * <code>NAVRATRI = 36;</code>
     */
    public static final int NAVRATRI_VALUE = 36;
    /**
     * <pre>
     * Available in Thai: Songkran.
     * </pre>
     *
     * <code>SONGKRAN = 37;</code>
     */
    public static final int SONGKRAN_VALUE = 37;
    /**
     * <pre>
     * Available in Japanese: Year-end Gift.
     * </pre>
     *
     * <code>YEAR_END_GIFT = 38;</code>
     */
    public static final int YEAR_END_GIFT_VALUE = 38;


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
    public static PromotionExtensionOccasion valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PromotionExtensionOccasion forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NEW_YEARS;
        case 3: return CHINESE_NEW_YEAR;
        case 4: return VALENTINES_DAY;
        case 5: return EASTER;
        case 6: return MOTHERS_DAY;
        case 7: return FATHERS_DAY;
        case 8: return LABOR_DAY;
        case 9: return BACK_TO_SCHOOL;
        case 10: return HALLOWEEN;
        case 11: return BLACK_FRIDAY;
        case 12: return CYBER_MONDAY;
        case 13: return CHRISTMAS;
        case 14: return BOXING_DAY;
        case 15: return INDEPENDENCE_DAY;
        case 16: return NATIONAL_DAY;
        case 17: return END_OF_SEASON;
        case 18: return WINTER_SALE;
        case 19: return SUMMER_SALE;
        case 20: return FALL_SALE;
        case 21: return SPRING_SALE;
        case 22: return RAMADAN;
        case 23: return EID_AL_FITR;
        case 24: return EID_AL_ADHA;
        case 25: return SINGLES_DAY;
        case 26: return WOMENS_DAY;
        case 27: return HOLI;
        case 28: return PARENTS_DAY;
        case 29: return ST_NICHOLAS_DAY;
        case 30: return CARNIVAL;
        case 31: return EPIPHANY;
        case 32: return ROSH_HASHANAH;
        case 33: return PASSOVER;
        case 34: return HANUKKAH;
        case 35: return DIWALI;
        case 36: return NAVRATRI;
        case 37: return SONGKRAN;
        case 38: return YEAR_END_GIFT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PromotionExtensionOccasion>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PromotionExtensionOccasion> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PromotionExtensionOccasion>() {
            public PromotionExtensionOccasion findValueByNumber(int number) {
              return PromotionExtensionOccasion.forNumber(number);
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
      return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PromotionExtensionOccasion[] VALUES = values();

    public static PromotionExtensionOccasion valueOf(
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

    private PromotionExtensionOccasion(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion)
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
    if (!(obj instanceof com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum other = (com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum) obj;

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

  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum prototype) {
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
   * Container for enum describing a promotion extension occasion.
   * For more information about the occasions  check:
   * https://support.google.com/google-ads/answer/7367521
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)
      com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionProto.internal_static_google_ads_googleads_v19_enums_PromotionExtensionOccasionEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionProto.internal_static_google_ads_googleads_v19_enums_PromotionExtensionOccasionEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.class, com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.newBuilder()
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
      return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionProto.internal_static_google_ads_googleads_v19_enums_PromotionExtensionOccasionEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum build() {
      com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum buildPartial() {
      com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum result = new com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum) {
        return mergeFrom((com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum other) {
      if (other == com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum)
  private static final com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum();
  }

  public static com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromotionExtensionOccasionEnum>
      PARSER = new com.google.protobuf.AbstractParser<PromotionExtensionOccasionEnum>() {
    @java.lang.Override
    public PromotionExtensionOccasionEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<PromotionExtensionOccasionEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromotionExtensionOccasionEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.enums.PromotionExtensionOccasionEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

