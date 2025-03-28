// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/segments.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_Keyword_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_BudgetCampaignAssociationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_BudgetCampaignAssociationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_AssetInteractionTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_AssetInteractionTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_SkAdNetworkSourceApp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_SkAdNetworkSourceApp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v19/common/segmen" +
      "ts.proto\022\037google.ads.googleads.v19.commo" +
      "n\032.google/ads/googleads/v19/common/crite" +
      "ria.proto\0328google/ads/googleads/v19/enum" +
      "s/ad_destination_type.proto\0323google/ads/" +
      "googleads/v19/enums/ad_format_type.proto" +
      "\0324google/ads/googleads/v19/enums/ad_netw" +
      "ork_type.proto\032Ggoogle/ads/googleads/v19" +
      "/enums/budget_campaign_association_statu" +
      "s.proto\032/google/ads/googleads/v19/enums/" +
      "click_type.proto\032?google/ads/googleads/v" +
      "19/enums/conversion_action_category.prot" +
      "o\032Fgoogle/ads/googleads/v19/enums/conver" +
      "sion_attribution_event_type.proto\032:googl" +
      "e/ads/googleads/v19/enums/conversion_lag" +
      "_bucket.proto\032Hgoogle/ads/googleads/v19/" +
      "enums/conversion_or_adjustment_lag_bucke" +
      "t.proto\032Lgoogle/ads/googleads/v19/enums/" +
      "conversion_value_rule_primary_dimension." +
      "proto\032Ygoogle/ads/googleads/v19/enums/co" +
      "nverting_user_prior_engagement_type_and_" +
      "ltv_bucket.proto\0320google/ads/googleads/v" +
      "19/enums/day_of_week.proto\032+google/ads/g" +
      "oogleads/v19/enums/device.proto\032?google/" +
      "ads/googleads/v19/enums/external_convers" +
      "ion_source.proto\032>google/ads/googleads/v" +
      "19/enums/hotel_date_selection_type.proto" +
      "\0327google/ads/googleads/v19/enums/hotel_p" +
      "rice_bucket.proto\0324google/ads/googleads/" +
      "v19/enums/hotel_rate_type.proto\0322google/" +
      "ads/googleads/v19/enums/month_of_year.pr" +
      "oto\0324google/ads/googleads/v19/enums/prod" +
      "uct_channel.proto\032@google/ads/googleads/" +
      "v19/enums/product_channel_exclusivity.pr" +
      "oto\0326google/ads/googleads/v19/enums/prod" +
      "uct_condition.proto\0328google/ads/googlead" +
      "s/v19/enums/recommendation_type.proto\032Dg" +
      "oogle/ads/googleads/v19/enums/search_eng" +
      "ine_results_page_type.proto\032;google/ads/" +
      "googleads/v19/enums/search_term_match_ty" +
      "pe.proto\032@google/ads/googleads/v19/enums" +
      "/sk_ad_network_ad_event_type.proto\032Egoog" +
      "le/ads/googleads/v19/enums/sk_ad_network" +
      "_attribution_credit.proto\032Jgoogle/ads/go" +
      "ogleads/v19/enums/sk_ad_network_coarse_c" +
      "onversion_value.proto\032>google/ads/google" +
      "ads/v19/enums/sk_ad_network_source_type." +
      "proto\032<google/ads/googleads/v19/enums/sk" +
      "_ad_network_user_type.proto\032)google/ads/" +
      "googleads/v19/enums/slot.proto\032\031google/a" +
      "pi/resource.proto\"\333?\n\010Segments\022!\n\023activi" +
      "ty_account_id\030\224\001 \001(\003H\000\210\001\001\022\033\n\ractivity_ci" +
      "ty\030\271\001 \001(\tH\001\210\001\001\022\036\n\020activity_country\030\272\001 \001(" +
      "\tH\002\210\001\001\022\035\n\017activity_rating\030\225\001 \001(\003H\003\210\001\001\022\034\n" +
      "\016activity_state\030\273\001 \001(\tH\004\210\001\001\022\"\n\024external_" +
      "activity_id\030\226\001 \001(\tH\005\210\001\001\022e\n\023ad_destinatio" +
      "n_type\030\210\001 \001(\0162G.google.ads.googleads.v19" +
      ".enums.AdDestinationTypeEnum.AdDestinati" +
      "onType\022V\n\016ad_format_type\030\277\001 \001(\0162=.google" +
      ".ads.googleads.v19.enums.AdFormatTypeEnu" +
      "m.AdFormatType\022X\n\017ad_network_type\030\003 \001(\0162" +
      "?.google.ads.googleads.v19.enums.AdNetwo" +
      "rkTypeEnum.AdNetworkType\022\026\n\010ad_group\030\236\001 " +
      "\001(\tH\006\210\001\001\022\031\n\013asset_group\030\237\001 \001(\tH\007\210\001\001\022$\n\026a" +
      "uction_insight_domain\030\221\001 \001(\tH\010\210\001\001\022m\n\"bud" +
      "get_campaign_association_status\030\206\001 \001(\0132@" +
      ".google.ads.googleads.v19.common.BudgetC" +
      "ampaignAssociationStatus\022\026\n\010campaign\030\235\001 " +
      "\001(\tH\t\210\001\001\022K\n\nclick_type\030\032 \001(\01627.google.ad" +
      "s.googleads.v19.enums.ClickTypeEnum.Clic" +
      "kType\022N\n\021conversion_action\030q \001(\tB.\372A+\n)g" +
      "oogleads.googleapis.com/ConversionAction" +
      "H\n\210\001\001\022y\n\032conversion_action_category\0305 \001(" +
      "\0162U.google.ads.googleads.v19.enums.Conve" +
      "rsionActionCategoryEnum.ConversionAction" +
      "Category\022#\n\026conversion_action_name\030r \001(\t" +
      "H\013\210\001\001\022\"\n\025conversion_adjustment\030s \001(\010H\014\210\001" +
      "\001\022\214\001\n!conversion_attribution_event_type\030" +
      "\002 \001(\0162a.google.ads.googleads.v19.enums.C" +
      "onversionAttributionEventTypeEnum.Conver" +
      "sionAttributionEventType\022j\n\025conversion_l" +
      "ag_bucket\0302 \001(\0162K.google.ads.googleads.v" +
      "19.enums.ConversionLagBucketEnum.Convers" +
      "ionLagBucket\022\220\001\n#conversion_or_adjustmen" +
      "t_lag_bucket\0303 \001(\0162c.google.ads.googlead" +
      "s.v19.enums.ConversionOrAdjustmentLagBuc" +
      "ketEnum.ConversionOrAdjustmentLagBucket\022" +
      "\021\n\004date\030O \001(\tH\r\210\001\001\022L\n\013day_of_week\030\005 \001(\0162" +
      "7.google.ads.googleads.v19.enums.DayOfWe" +
      "ekEnum.DayOfWeek\022A\n\006device\030\001 \001(\01621.googl" +
      "e.ads.googleads.v19.enums.DeviceEnum.Dev" +
      "ice\022y\n\032external_conversion_source\0307 \001(\0162" +
      "U.google.ads.googleads.v19.enums.Externa" +
      "lConversionSourceEnum.ExternalConversion" +
      "Source\022\037\n\022geo_target_airport\030t \001(\tH\016\210\001\001\022" +
      "\036\n\021geo_target_canton\030u \001(\tH\017\210\001\001\022\034\n\017geo_t" +
      "arget_city\030v \001(\tH\020\210\001\001\022\037\n\022geo_target_coun" +
      "try\030w \001(\tH\021\210\001\001\022\036\n\021geo_target_county\030x \001(" +
      "\tH\022\210\001\001\022 \n\023geo_target_district\030y \001(\tH\023\210\001\001" +
      "\022\035\n\020geo_target_metro\030z \001(\tH\024\210\001\001\022.\n!geo_t" +
      "arget_most_specific_location\030{ \001(\tH\025\210\001\001\022" +
      "#\n\026geo_target_postal_code\030| \001(\tH\026\210\001\001\022 \n\023" +
      "geo_target_province\030} \001(\tH\027\210\001\001\022\036\n\021geo_ta" +
      "rget_region\030~ \001(\tH\030\210\001\001\022\035\n\020geo_target_sta" +
      "te\030\177 \001(\tH\031\210\001\001\022\'\n\031hotel_booking_window_da" +
      "ys\030\207\001 \001(\003H\032\210\001\001\022\034\n\017hotel_center_id\030P \001(\003H" +
      "\033\210\001\001\022 \n\023hotel_check_in_date\030Q \001(\tH\034\210\001\001\022[" +
      "\n\032hotel_check_in_day_of_week\030\t \001(\01627.goo" +
      "gle.ads.googleads.v19.enums.DayOfWeekEnu" +
      "m.DayOfWeek\022\027\n\nhotel_city\030R \001(\tH\035\210\001\001\022\030\n\013" +
      "hotel_class\030S \001(\005H\036\210\001\001\022\032\n\rhotel_country\030" +
      "T \001(\tH\037\210\001\001\022t\n\031hotel_date_selection_type\030" +
      "\r \001(\0162Q.google.ads.googleads.v19.enums.H" +
      "otelDateSelectionTypeEnum.HotelDateSelec" +
      "tionType\022!\n\024hotel_length_of_stay\030U \001(\005H " +
      "\210\001\001\022\037\n\022hotel_rate_rule_id\030V \001(\tH!\210\001\001\022X\n\017" +
      "hotel_rate_type\030J \001(\0162?.google.ads.googl" +
      "eads.v19.enums.HotelRateTypeEnum.HotelRa" +
      "teType\022a\n\022hotel_price_bucket\030N \001(\0162E.goo" +
      "gle.ads.googleads.v19.enums.HotelPriceBu" +
      "cketEnum.HotelPriceBucket\022\030\n\013hotel_state" +
      "\030W \001(\tH\"\210\001\001\022\021\n\004hour\030X \001(\005H#\210\001\001\022*\n\035intera" +
      "ction_on_this_extension\030Y \001(\010H$\210\001\001\0229\n\007ke" +
      "yword\030= \001(\0132(.google.ads.googleads.v19.c" +
      "ommon.Keyword\022\022\n\005month\030Z \001(\tH%\210\001\001\022R\n\rmon" +
      "th_of_year\030\022 \001(\0162;.google.ads.googleads." +
      "v19.enums.MonthOfYearEnum.MonthOfYear\022\035\n" +
      "\020partner_hotel_id\030[ \001(\tH&\210\001\001\022#\n\025product_" +
      "aggregator_id\030\204\001 \001(\003H\'\210\001\001\022%\n\027product_cat" +
      "egory_level1\030\241\001 \001(\tH(\210\001\001\022%\n\027product_cate" +
      "gory_level2\030\242\001 \001(\tH)\210\001\001\022%\n\027product_categ" +
      "ory_level3\030\243\001 \001(\tH*\210\001\001\022%\n\027product_catego" +
      "ry_level4\030\244\001 \001(\tH+\210\001\001\022%\n\027product_categor" +
      "y_level5\030\245\001 \001(\tH,\210\001\001\022\032\n\rproduct_brand\030a " +
      "\001(\tH-\210\001\001\022Z\n\017product_channel\030\036 \001(\0162A.goog" +
      "le.ads.googleads.v19.enums.ProductChanne" +
      "lEnum.ProductChannel\022|\n\033product_channel_" +
      "exclusivity\030\037 \001(\0162W.google.ads.googleads" +
      ".v19.enums.ProductChannelExclusivityEnum" +
      ".ProductChannelExclusivity\022`\n\021product_co" +
      "ndition\030  \001(\0162E.google.ads.googleads.v19" +
      ".enums.ProductConditionEnum.ProductCondi" +
      "tion\022\034\n\017product_country\030b \001(\tH.\210\001\001\022&\n\031pr" +
      "oduct_custom_attribute0\030c \001(\tH/\210\001\001\022&\n\031pr" +
      "oduct_custom_attribute1\030d \001(\tH0\210\001\001\022&\n\031pr" +
      "oduct_custom_attribute2\030e \001(\tH1\210\001\001\022&\n\031pr" +
      "oduct_custom_attribute3\030f \001(\tH2\210\001\001\022&\n\031pr" +
      "oduct_custom_attribute4\030g \001(\tH3\210\001\001\022 \n\022pr" +
      "oduct_feed_label\030\223\001 \001(\tH4\210\001\001\022\034\n\017product_" +
      "item_id\030h \001(\tH5\210\001\001\022\035\n\020product_language\030i" +
      " \001(\tH6\210\001\001\022!\n\023product_merchant_id\030\205\001 \001(\003H" +
      "7\210\001\001\022\035\n\020product_store_id\030j \001(\tH8\210\001\001\022\032\n\rp" +
      "roduct_title\030k \001(\tH9\210\001\001\022\034\n\017product_type_" +
      "l1\030l \001(\tH:\210\001\001\022\034\n\017product_type_l2\030m \001(\tH;" +
      "\210\001\001\022\034\n\017product_type_l3\030n \001(\tH<\210\001\001\022\034\n\017pro" +
      "duct_type_l4\030o \001(\tH=\210\001\001\022\034\n\017product_type_" +
      "l5\030p \001(\tH>\210\001\001\022\025\n\007quarter\030\200\001 \001(\tH?\210\001\001\022%\n\027" +
      "travel_destination_city\030\301\001 \001(\tH@\210\001\001\022(\n\032t" +
      "ravel_destination_country\030\302\001 \001(\tHA\210\001\001\022\'\n" +
      "\031travel_destination_region\030\303\001 \001(\tHB\210\001\001\022g" +
      "\n\023recommendation_type\030\214\001 \001(\0162I.google.ad" +
      "s.googleads.v19.enums.RecommendationType" +
      "Enum.RecommendationType\022\204\001\n\037search_engin" +
      "e_results_page_type\030F \001(\0162[.google.ads.g" +
      "oogleads.v19.enums.SearchEngineResultsPa" +
      "geTypeEnum.SearchEngineResultsPageType\022 " +
      "\n\022search_subcategory\030\233\001 \001(\tHC\210\001\001\022\031\n\013sear" +
      "ch_term\030\234\001 \001(\tHD\210\001\001\022k\n\026search_term_match" +
      "_type\030\026 \001(\0162K.google.ads.googleads.v19.e" +
      "nums.SearchTermMatchTypeEnum.SearchTermM" +
      "atchType\022;\n\004slot\030\027 \001(\0162-.google.ads.goog" +
      "leads.v19.enums.SlotEnum.Slot\022\235\001\n\'conver" +
      "sion_value_rule_primary_dimension\030\212\001 \001(\016" +
      "2k.google.ads.googleads.v19.enums.Conver" +
      "sionValueRulePrimaryDimensionEnum.Conver" +
      "sionValueRulePrimaryDimension\022\025\n\007webpage" +
      "\030\201\001 \001(\tHE\210\001\001\022\022\n\004week\030\202\001 \001(\tHF\210\001\001\022\022\n\004year" +
      "\030\203\001 \001(\005HG\210\001\001\0221\n#sk_ad_network_fine_conve" +
      "rsion_value\030\211\001 \001(\003HH\210\001\001\022?\n1sk_ad_network" +
      "_redistributed_fine_conversion_value\030\276\001 " +
      "\001(\003HI\210\001\001\022m\n\027sk_ad_network_user_type\030\215\001 \001" +
      "(\0162K.google.ads.googleads.v19.enums.SkAd" +
      "NetworkUserTypeEnum.SkAdNetworkUserType\022" +
      "w\n\033sk_ad_network_ad_event_type\030\216\001 \001(\0162Q." +
      "google.ads.googleads.v19.enums.SkAdNetwo" +
      "rkAdEventTypeEnum.SkAdNetworkAdEventType" +
      "\022]\n\030sk_ad_network_source_app\030\217\001 \001(\01325.go" +
      "ogle.ads.googleads.v19.common.SkAdNetwor" +
      "kSourceAppHJ\210\001\001\022\210\001\n sk_ad_network_attrib" +
      "ution_credit\030\220\001 \001(\0162].google.ads.googlea" +
      "ds.v19.enums.SkAdNetworkAttributionCredi" +
      "tEnum.SkAdNetworkAttributionCredit\022\225\001\n%s" +
      "k_ad_network_coarse_conversion_value\030\227\001 " +
      "\001(\0162e.google.ads.googleads.v19.enums.SkA" +
      "dNetworkCoarseConversionValueEnum.SkAdNe" +
      "tworkCoarseConversionValue\022)\n\033sk_ad_netw" +
      "ork_source_domain\030\230\001 \001(\tHK\210\001\001\022s\n\031sk_ad_n" +
      "etwork_source_type\030\231\001 \001(\0162O.google.ads.g" +
      "oogleads.v19.enums.SkAdNetworkSourceType" +
      "Enum.SkAdNetworkSourceType\0223\n%sk_ad_netw" +
      "ork_postback_sequence_index\030\232\001 \001(\003HL\210\001\001\022" +
      "#\n\025sk_ad_network_version\030\300\001 \001(\tHM\210\001\001\022_\n\030" +
      "asset_interaction_target\030\213\001 \001(\01327.google" +
      ".ads.googleads.v19.common.AssetInteracti" +
      "onTargetHN\210\001\001\022\250\001\n\036new_versus_returning_c" +
      "ustomers\030\240\001 \001(\0162\177.google.ads.googleads.v" +
      "19.enums.ConvertingUserPriorEngagementTy" +
      "peAndLtvBucketEnum.ConvertingUserPriorEn" +
      "gagementTypeAndLtvBucketB\026\n\024_activity_ac" +
      "count_idB\020\n\016_activity_cityB\023\n\021_activity_" +
      "countryB\022\n\020_activity_ratingB\021\n\017_activity" +
      "_stateB\027\n\025_external_activity_idB\013\n\t_ad_g" +
      "roupB\016\n\014_asset_groupB\031\n\027_auction_insight" +
      "_domainB\013\n\t_campaignB\024\n\022_conversion_acti" +
      "onB\031\n\027_conversion_action_nameB\030\n\026_conver" +
      "sion_adjustmentB\007\n\005_dateB\025\n\023_geo_target_" +
      "airportB\024\n\022_geo_target_cantonB\022\n\020_geo_ta" +
      "rget_cityB\025\n\023_geo_target_countryB\024\n\022_geo" +
      "_target_countyB\026\n\024_geo_target_districtB\023" +
      "\n\021_geo_target_metroB$\n\"_geo_target_most_" +
      "specific_locationB\031\n\027_geo_target_postal_" +
      "codeB\026\n\024_geo_target_provinceB\024\n\022_geo_tar" +
      "get_regionB\023\n\021_geo_target_stateB\034\n\032_hote" +
      "l_booking_window_daysB\022\n\020_hotel_center_i" +
      "dB\026\n\024_hotel_check_in_dateB\r\n\013_hotel_city" +
      "B\016\n\014_hotel_classB\020\n\016_hotel_countryB\027\n\025_h" +
      "otel_length_of_stayB\025\n\023_hotel_rate_rule_" +
      "idB\016\n\014_hotel_stateB\007\n\005_hourB \n\036_interact" +
      "ion_on_this_extensionB\010\n\006_monthB\023\n\021_part" +
      "ner_hotel_idB\030\n\026_product_aggregator_idB\032" +
      "\n\030_product_category_level1B\032\n\030_product_c" +
      "ategory_level2B\032\n\030_product_category_leve" +
      "l3B\032\n\030_product_category_level4B\032\n\030_produ" +
      "ct_category_level5B\020\n\016_product_brandB\022\n\020" +
      "_product_countryB\034\n\032_product_custom_attr" +
      "ibute0B\034\n\032_product_custom_attribute1B\034\n\032" +
      "_product_custom_attribute2B\034\n\032_product_c" +
      "ustom_attribute3B\034\n\032_product_custom_attr" +
      "ibute4B\025\n\023_product_feed_labelB\022\n\020_produc" +
      "t_item_idB\023\n\021_product_languageB\026\n\024_produ" +
      "ct_merchant_idB\023\n\021_product_store_idB\020\n\016_" +
      "product_titleB\022\n\020_product_type_l1B\022\n\020_pr" +
      "oduct_type_l2B\022\n\020_product_type_l3B\022\n\020_pr" +
      "oduct_type_l4B\022\n\020_product_type_l5B\n\n\010_qu" +
      "arterB\032\n\030_travel_destination_cityB\035\n\033_tr" +
      "avel_destination_countryB\034\n\032_travel_dest" +
      "ination_regionB\025\n\023_search_subcategoryB\016\n" +
      "\014_search_termB\n\n\010_webpageB\007\n\005_weekB\007\n\005_y" +
      "earB&\n$_sk_ad_network_fine_conversion_va" +
      "lueB4\n2_sk_ad_network_redistributed_fine" +
      "_conversion_valueB\033\n\031_sk_ad_network_sour" +
      "ce_appB\036\n\034_sk_ad_network_source_domainB(" +
      "\n&_sk_ad_network_postback_sequence_index" +
      "B\030\n\026_sk_ad_network_versionB\033\n\031_asset_int" +
      "eraction_target\"}\n\007Keyword\022\037\n\022ad_group_c" +
      "riterion\030\003 \001(\tH\000\210\001\001\022:\n\004info\030\002 \001(\0132,.goog" +
      "le.ads.googleads.v19.common.KeywordInfoB" +
      "\025\n\023_ad_group_criterion\"\272\001\n\037BudgetCampaig" +
      "nAssociationStatus\022\025\n\010campaign\030\001 \001(\tH\000\210\001" +
      "\001\022s\n\006status\030\002 \001(\0162c.google.ads.googleads" +
      ".v19.enums.BudgetCampaignAssociationStat" +
      "usEnum.BudgetCampaignAssociationStatusB\013" +
      "\n\t_campaign\"J\n\026AssetInteractionTarget\022\r\n" +
      "\005asset\030\001 \001(\t\022!\n\031interaction_on_this_asse" +
      "t\030\002 \001(\010\"`\n\024SkAdNetworkSourceApp\022(\n\033sk_ad" +
      "_network_source_app_id\030\001 \001(\tH\000\210\001\001B\036\n\034_sk" +
      "_ad_network_source_app_idB\355\001\n#com.google" +
      ".ads.googleads.v19.commonB\rSegmentsProto" +
      "P\001ZEgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v19/common;common\242\002\003GAA\252" +
      "\002\037Google.Ads.GoogleAds.V19.Common\312\002\037Goog" +
      "le\\Ads\\GoogleAds\\V19\\Common\352\002#Google::Ad" +
      "s::GoogleAds::V19::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AdDestinationTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AdFormatTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.BudgetCampaignAssociationStatusProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ConvertingUserPriorEngagementTypeAndLtvBucketProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.HotelPriceBucketProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.RecommendationTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SkAdNetworkAdEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SkAdNetworkAttributionCreditProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SkAdNetworkCoarseConversionValueProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SkAdNetworkSourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SkAdNetworkUserTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SlotProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_Segments_descriptor,
        new java.lang.String[] { "ActivityAccountId", "ActivityCity", "ActivityCountry", "ActivityRating", "ActivityState", "ExternalActivityId", "AdDestinationType", "AdFormatType", "AdNetworkType", "AdGroup", "AssetGroup", "AuctionInsightDomain", "BudgetCampaignAssociationStatus", "Campaign", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelPriceBucket", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "ProductAggregatorId", "ProductCategoryLevel1", "ProductCategoryLevel2", "ProductCategoryLevel3", "ProductCategoryLevel4", "ProductCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductFeedLabel", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "TravelDestinationCity", "TravelDestinationCountry", "TravelDestinationRegion", "RecommendationType", "SearchEngineResultsPageType", "SearchSubcategory", "SearchTerm", "SearchTermMatchType", "Slot", "ConversionValueRulePrimaryDimension", "Webpage", "Week", "Year", "SkAdNetworkFineConversionValue", "SkAdNetworkRedistributedFineConversionValue", "SkAdNetworkUserType", "SkAdNetworkAdEventType", "SkAdNetworkSourceApp", "SkAdNetworkAttributionCredit", "SkAdNetworkCoarseConversionValue", "SkAdNetworkSourceDomain", "SkAdNetworkSourceType", "SkAdNetworkPostbackSequenceIndex", "SkAdNetworkVersion", "AssetInteractionTarget", "NewVersusReturningCustomers", });
    internal_static_google_ads_googleads_v19_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", });
    internal_static_google_ads_googleads_v19_common_BudgetCampaignAssociationStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_common_BudgetCampaignAssociationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_BudgetCampaignAssociationStatus_descriptor,
        new java.lang.String[] { "Campaign", "Status", });
    internal_static_google_ads_googleads_v19_common_AssetInteractionTarget_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_common_AssetInteractionTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_AssetInteractionTarget_descriptor,
        new java.lang.String[] { "Asset", "InteractionOnThisAsset", });
    internal_static_google_ads_googleads_v19_common_SkAdNetworkSourceApp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v19_common_SkAdNetworkSourceApp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_SkAdNetworkSourceApp_descriptor,
        new java.lang.String[] { "SkAdNetworkSourceAppId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AdDestinationTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AdFormatTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.BudgetCampaignAssociationStatusProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ConvertingUserPriorEngagementTypeAndLtvBucketProto.getDescriptor();
    com.google.ads.googleads.v19.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v19.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v19.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.HotelPriceBucketProto.getDescriptor();
    com.google.ads.googleads.v19.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v19.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v19.enums.RecommendationTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SkAdNetworkAdEventTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SkAdNetworkAttributionCreditProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SkAdNetworkCoarseConversionValueProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SkAdNetworkSourceTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SkAdNetworkUserTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SlotProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
