// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/google_ads_field.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class GoogleAdsFieldProto {
  private GoogleAdsFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_GoogleAdsField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_GoogleAdsField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v19/resources/goo" +
      "gle_ads_field.proto\022\"google.ads.googlead" +
      "s.v19.resources\032>google/ads/googleads/v1" +
      "9/enums/google_ads_field_category.proto\032" +
      "?google/ads/googleads/v19/enums/google_a" +
      "ds_field_data_type.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\202\006\n\016GoogleAdsField\022F\n\rresource_name" +
      "\030\001 \001(\tB/\340A\003\372A)\n\'googleads.googleapis.com" +
      "/GoogleAdsField\022\026\n\004name\030\025 \001(\tB\003\340A\003H\000\210\001\001\022" +
      "h\n\010category\030\003 \001(\0162Q.google.ads.googleads" +
      ".v19.enums.GoogleAdsFieldCategoryEnum.Go" +
      "ogleAdsFieldCategoryB\003\340A\003\022\034\n\nselectable\030" +
      "\026 \001(\010B\003\340A\003H\001\210\001\001\022\034\n\nfilterable\030\027 \001(\010B\003\340A\003" +
      "H\002\210\001\001\022\032\n\010sortable\030\030 \001(\010B\003\340A\003H\003\210\001\001\022\034\n\017sel" +
      "ectable_with\030\031 \003(\tB\003\340A\003\022 \n\023attribute_res" +
      "ources\030\032 \003(\tB\003\340A\003\022\024\n\007metrics\030\033 \003(\tB\003\340A\003\022" +
      "\025\n\010segments\030\034 \003(\tB\003\340A\003\022\030\n\013enum_values\030\035 " +
      "\003(\tB\003\340A\003\022i\n\tdata_type\030\014 \001(\0162Q.google.ads" +
      ".googleads.v19.enums.GoogleAdsFieldDataT" +
      "ypeEnum.GoogleAdsFieldDataTypeB\003\340A\003\022\032\n\010t" +
      "ype_url\030\036 \001(\tB\003\340A\003H\004\210\001\001\022\035\n\013is_repeated\030\037" +
      " \001(\010B\003\340A\003H\005\210\001\001:P\352AM\n\'googleads.googleapi" +
      "s.com/GoogleAdsField\022\"googleAdsFields/{g" +
      "oogle_ads_field}B\007\n\005_nameB\r\n\013_selectable" +
      "B\r\n\013_filterableB\013\n\t_sortableB\013\n\t_type_ur" +
      "lB\016\n\014_is_repeatedB\205\002\n&com.google.ads.goo" +
      "gleads.v19.resourcesB\023GoogleAdsFieldProt" +
      "oP\001ZKgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v19/resources;resources" +
      "\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V19.Resour" +
      "ces\312\002\"Google\\Ads\\GoogleAds\\V19\\Resources" +
      "\352\002&Google::Ads::GoogleAds::V19::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.GoogleAdsFieldCategoryProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.GoogleAdsFieldDataTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_GoogleAdsField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_GoogleAdsField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_GoogleAdsField_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.GoogleAdsFieldCategoryProto.getDescriptor();
    com.google.ads.googleads.v19.enums.GoogleAdsFieldDataTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
