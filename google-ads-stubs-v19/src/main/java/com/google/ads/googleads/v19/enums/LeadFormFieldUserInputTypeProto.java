// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/enums/lead_form_field_user_input_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.enums;

public final class LeadFormFieldUserInputTypeProto {
  private LeadFormFieldUserInputTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_enums_LeadFormFieldUserInputTypeEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_enums_LeadFormFieldUserInputTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v19/enums/lead_fo" +
      "rm_field_user_input_type.proto\022\036google.a" +
      "ds.googleads.v19.enums\"\310\023\n\036LeadFormField" +
      "UserInputTypeEnum\"\245\023\n\032LeadFormFieldUserI" +
      "nputType\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\r" +
      "\n\tFULL_NAME\020\002\022\t\n\005EMAIL\020\003\022\020\n\014PHONE_NUMBER" +
      "\020\004\022\017\n\013POSTAL_CODE\020\005\022\022\n\016STREET_ADDRESS\020\010\022" +
      "\010\n\004CITY\020\t\022\n\n\006REGION\020\n\022\013\n\007COUNTRY\020\013\022\016\n\nWO" +
      "RK_EMAIL\020\014\022\020\n\014COMPANY_NAME\020\r\022\016\n\nWORK_PHO" +
      "NE\020\016\022\r\n\tJOB_TITLE\020\017\022\037\n\033GOVERNMENT_ISSUED" +
      "_ID_CPF_BR\020\020\022\037\n\033GOVERNMENT_ISSUED_ID_DNI" +
      "_AR\020\021\022\037\n\033GOVERNMENT_ISSUED_ID_DNI_PE\020\022\022\037" +
      "\n\033GOVERNMENT_ISSUED_ID_RUT_CL\020\023\022\036\n\032GOVER" +
      "NMENT_ISSUED_ID_CC_CO\020\024\022\036\n\032GOVERNMENT_IS" +
      "SUED_ID_CI_EC\020\025\022\037\n\033GOVERNMENT_ISSUED_ID_" +
      "RFC_MX\020\026\022\016\n\nFIRST_NAME\020\027\022\r\n\tLAST_NAME\020\030\022" +
      "\022\n\rVEHICLE_MODEL\020\351\007\022\021\n\014VEHICLE_TYPE\020\352\007\022\031" +
      "\n\024PREFERRED_DEALERSHIP\020\353\007\022\036\n\031VEHICLE_PUR" +
      "CHASE_TIMELINE\020\354\007\022\026\n\021VEHICLE_OWNERSHIP\020\355" +
      "\007\022\031\n\024VEHICLE_PAYMENT_TYPE\020\361\007\022\026\n\021VEHICLE_" +
      "CONDITION\020\362\007\022\021\n\014COMPANY_SIZE\020\356\007\022\021\n\014ANNUA" +
      "L_SALES\020\357\007\022\026\n\021YEARS_IN_BUSINESS\020\360\007\022\023\n\016JO" +
      "B_DEPARTMENT\020\363\007\022\r\n\010JOB_ROLE\020\364\007\022\020\n\013OVER_1" +
      "8_AGE\020\266\010\022\020\n\013OVER_19_AGE\020\267\010\022\020\n\013OVER_20_AG" +
      "E\020\270\010\022\020\n\013OVER_21_AGE\020\271\010\022\020\n\013OVER_22_AGE\020\272\010" +
      "\022\020\n\013OVER_23_AGE\020\273\010\022\020\n\013OVER_24_AGE\020\274\010\022\020\n\013" +
      "OVER_25_AGE\020\275\010\022\020\n\013OVER_26_AGE\020\276\010\022\020\n\013OVER" +
      "_27_AGE\020\277\010\022\020\n\013OVER_28_AGE\020\300\010\022\020\n\013OVER_29_" +
      "AGE\020\301\010\022\020\n\013OVER_30_AGE\020\302\010\022\020\n\013OVER_31_AGE\020" +
      "\303\010\022\020\n\013OVER_32_AGE\020\304\010\022\020\n\013OVER_33_AGE\020\305\010\022\020" +
      "\n\013OVER_34_AGE\020\306\010\022\020\n\013OVER_35_AGE\020\307\010\022\020\n\013OV" +
      "ER_36_AGE\020\310\010\022\020\n\013OVER_37_AGE\020\311\010\022\020\n\013OVER_3" +
      "8_AGE\020\312\010\022\020\n\013OVER_39_AGE\020\313\010\022\020\n\013OVER_40_AG" +
      "E\020\314\010\022\020\n\013OVER_41_AGE\020\315\010\022\020\n\013OVER_42_AGE\020\316\010" +
      "\022\020\n\013OVER_43_AGE\020\317\010\022\020\n\013OVER_44_AGE\020\320\010\022\020\n\013" +
      "OVER_45_AGE\020\321\010\022\020\n\013OVER_46_AGE\020\322\010\022\020\n\013OVER" +
      "_47_AGE\020\323\010\022\020\n\013OVER_48_AGE\020\324\010\022\020\n\013OVER_49_" +
      "AGE\020\325\010\022\020\n\013OVER_50_AGE\020\326\010\022\020\n\013OVER_51_AGE\020" +
      "\327\010\022\020\n\013OVER_52_AGE\020\330\010\022\020\n\013OVER_53_AGE\020\331\010\022\020" +
      "\n\013OVER_54_AGE\020\332\010\022\020\n\013OVER_55_AGE\020\333\010\022\020\n\013OV" +
      "ER_56_AGE\020\334\010\022\020\n\013OVER_57_AGE\020\335\010\022\020\n\013OVER_5" +
      "8_AGE\020\336\010\022\020\n\013OVER_59_AGE\020\337\010\022\020\n\013OVER_60_AG" +
      "E\020\340\010\022\020\n\013OVER_61_AGE\020\341\010\022\020\n\013OVER_62_AGE\020\342\010" +
      "\022\020\n\013OVER_63_AGE\020\343\010\022\020\n\013OVER_64_AGE\020\344\010\022\020\n\013" +
      "OVER_65_AGE\020\345\010\022\026\n\021EDUCATION_PROGRAM\020\365\007\022\025" +
      "\n\020EDUCATION_COURSE\020\366\007\022\014\n\007PRODUCT\020\370\007\022\014\n\007S" +
      "ERVICE\020\371\007\022\n\n\005OFFER\020\372\007\022\r\n\010CATEGORY\020\373\007\022\035\n\030" +
      "PREFERRED_CONTACT_METHOD\020\374\007\022\027\n\022PREFERRED" +
      "_LOCATION\020\375\007\022\033\n\026PREFERRED_CONTACT_TIME\020\376" +
      "\007\022\026\n\021PURCHASE_TIMELINE\020\377\007\022\030\n\023YEARS_OF_EX" +
      "PERIENCE\020\230\010\022\021\n\014JOB_INDUSTRY\020\231\010\022\027\n\022LEVEL_" +
      "OF_EDUCATION\020\232\010\022\022\n\rPROPERTY_TYPE\020\200\010\022\026\n\021R" +
      "EALTOR_HELP_GOAL\020\201\010\022\027\n\022PROPERTY_COMMUNIT" +
      "Y\020\202\010\022\020\n\013PRICE_RANGE\020\203\010\022\027\n\022NUMBER_OF_BEDR" +
      "OOMS\020\204\010\022\027\n\022FURNISHED_PROPERTY\020\205\010\022\032\n\025PETS" +
      "_ALLOWED_PROPERTY\020\206\010\022\032\n\025NEXT_PLANNED_PUR" +
      "CHASE\020\207\010\022\032\n\025EVENT_SIGNUP_INTEREST\020\211\010\022\036\n\031" +
      "PREFERRED_SHOPPING_PLACES\020\212\010\022\023\n\016FAVORITE" +
      "_BRAND\020\213\010\022+\n&TRANSPORTATION_COMMERCIAL_L" +
      "ICENSE_TYPE\020\214\010\022\033\n\026EVENT_BOOKING_INTEREST" +
      "\020\216\010\022\030\n\023DESTINATION_COUNTRY\020\217\010\022\025\n\020DESTINA" +
      "TION_CITY\020\220\010\022\026\n\021DEPARTURE_COUNTRY\020\221\010\022\023\n\016" +
      "DEPARTURE_CITY\020\222\010\022\023\n\016DEPARTURE_DATE\020\223\010\022\020" +
      "\n\013RETURN_DATE\020\224\010\022\030\n\023NUMBER_OF_TRAVELERS\020" +
      "\225\010\022\022\n\rTRAVEL_BUDGET\020\226\010\022\031\n\024TRAVEL_ACCOMMO" +
      "DATION\020\227\010B\371\001\n\"com.google.ads.googleads.v" +
      "19.enumsB\037LeadFormFieldUserInputTypeProt" +
      "oP\001ZCgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v19/enums;enums\242\002\003GAA\252\002" +
      "\036Google.Ads.GoogleAds.V19.Enums\312\002\036Google" +
      "\\Ads\\GoogleAds\\V19\\Enums\352\002\"Google::Ads::" +
      "GoogleAds::V19::Enumsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v19_enums_LeadFormFieldUserInputTypeEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_enums_LeadFormFieldUserInputTypeEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_enums_LeadFormFieldUserInputTypeEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
