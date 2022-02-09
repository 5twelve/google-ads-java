// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/batch_job_service.proto

package com.google.ads.googleads.v10.services;

public final class BatchJobServiceProto {
  private BatchJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_BatchJobOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_BatchJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBatchJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBatchJobResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_RunBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_RunBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_ListBatchJobResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_ListBatchJobResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_BatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_BatchJobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/services/batc" +
      "h_job_service.proto\022!google.ads.googlead" +
      "s.v10.services\032:google/ads/googleads/v10" +
      "/enums/response_content_type.proto\0322goog" +
      "le/ads/googleads/v10/resources/batch_job" +
      ".proto\032:google/ads/googleads/v10/service" +
      "s/google_ads_service.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032#google/longrunnin" +
      "g/operations.proto\032\027google/rpc/status.pr" +
      "oto\"\177\n\025MutateBatchJobRequest\022\030\n\013customer" +
      "_id\030\001 \001(\tB\003\340A\002\022L\n\toperation\030\002 \001(\01324.goog" +
      "le.ads.googleads.v10.services.BatchJobOp" +
      "erationB\003\340A\002\"`\n\021BatchJobOperation\022>\n\006cre" +
      "ate\030\001 \001(\0132,.google.ads.googleads.v10.res" +
      "ources.BatchJobH\000B\013\n\toperation\"a\n\026Mutate" +
      "BatchJobResponse\022G\n\006result\030\001 \001(\01327.googl" +
      "e.ads.googleads.v10.services.MutateBatch" +
      "JobResult\"U\n\024MutateBatchJobResult\022=\n\rres" +
      "ource_name\030\001 \001(\tB&\372A#\n!googleads.googlea" +
      "pis.com/BatchJob\"V\n\022RunBatchJobRequest\022@" +
      "\n\rresource_name\030\001 \001(\tB)\340A\002\372A#\n!googleads" +
      ".googleapis.com/BatchJob\"\314\001\n\034AddBatchJob" +
      "OperationsRequest\022@\n\rresource_name\030\001 \001(\t" +
      "B)\340A\002\372A#\n!googleads.googleapis.com/Batch" +
      "Job\022\026\n\016sequence_token\030\002 \001(\t\022R\n\021mutate_op" +
      "erations\030\003 \003(\01322.google.ads.googleads.v1" +
      "0.services.MutateOperationB\003\340A\002\"V\n\035AddBa" +
      "tchJobOperationsResponse\022\030\n\020total_operat" +
      "ions\030\001 \001(\003\022\033\n\023next_sequence_token\030\002 \001(\t\"" +
      "\361\001\n\032ListBatchJobResultsRequest\022@\n\rresour" +
      "ce_name\030\001 \001(\tB)\340A\002\372A#\n!googleads.googlea" +
      "pis.com/BatchJob\022\022\n\npage_token\030\002 \001(\t\022\021\n\t" +
      "page_size\030\003 \001(\005\022j\n\025response_content_type" +
      "\030\004 \001(\0162K.google.ads.googleads.v10.enums." +
      "ResponseContentTypeEnum.ResponseContentT" +
      "ype\"z\n\033ListBatchJobResultsResponse\022B\n\007re" +
      "sults\030\001 \003(\01321.google.ads.googleads.v10.s" +
      "ervices.BatchJobResult\022\027\n\017next_page_toke" +
      "n\030\002 \001(\t\"\254\001\n\016BatchJobResult\022\027\n\017operation_" +
      "index\030\001 \001(\003\022]\n\031mutate_operation_response" +
      "\030\002 \001(\0132:.google.ads.googleads.v10.servic" +
      "es.MutateOperationResponse\022\"\n\006status\030\003 \001" +
      "(\0132\022.google.rpc.Status2\341\010\n\017BatchJobServi" +
      "ce\022\331\001\n\016MutateBatchJob\0228.google.ads.googl" +
      "eads.v10.services.MutateBatchJobRequest\032" +
      "9.google.ads.googleads.v10.services.Muta" +
      "teBatchJobResponse\"R\202\323\344\223\0024\"//v10/custome" +
      "rs/{customer_id=*}/batchJobs:mutate:\001*\332A" +
      "\025customer_id,operation\022\346\001\n\023ListBatchJobR" +
      "esults\022=.google.ads.googleads.v10.servic" +
      "es.ListBatchJobResultsRequest\032>.google.a" +
      "ds.googleads.v10.services.ListBatchJobRe" +
      "sultsResponse\"P\202\323\344\223\002:\0228/v10/{resource_na" +
      "me=customers/*/batchJobs/*}:listResults\332" +
      "A\rresource_name\022\211\002\n\013RunBatchJob\0225.google" +
      ".ads.googleads.v10.services.RunBatchJobR" +
      "equest\032\035.google.longrunning.Operation\"\243\001" +
      "\202\323\344\223\0025\"0/v10/{resource_name=customers/*/" +
      "batchJobs/*}:run:\001*\332A\rresource_name\312AU\n\025" +
      "google.protobuf.Empty\022<google.ads.google" +
      "ads.v10.resources.BatchJob.BatchJobMetad" +
      "ata\022\265\002\n\025AddBatchJobOperations\022?.google.a" +
      "ds.googleads.v10.services.AddBatchJobOpe" +
      "rationsRequest\032@.google.ads.googleads.v1" +
      "0.services.AddBatchJobOperationsResponse" +
      "\"\230\001\202\323\344\223\002?\":/v10/{resource_name=customers" +
      "/*/batchJobs/*}:addOperations:\001*\332A.resou" +
      "rce_name,sequence_token,mutate_operation" +
      "s\332A\037resource_name,mutate_operations\032E\312A\030" +
      "googleads.googleapis.com\322A\'https://www.g" +
      "oogleapis.com/auth/adwordsB\200\002\n%com.googl" +
      "e.ads.googleads.v10.servicesB\024BatchJobSe" +
      "rviceProtoP\001ZIgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v10/services;s" +
      "ervices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10" +
      ".Services\312\002!Google\\Ads\\GoogleAds\\V10\\Ser" +
      "vices\352\002%Google::Ads::GoogleAds::V10::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.resources.BatchJobProto.getDescriptor(),
          com.google.ads.googleads.v10.services.GoogleAdsServiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBatchJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v10_services_BatchJobOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_BatchJobOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_BatchJobOperation_descriptor,
        new java.lang.String[] { "Create", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBatchJobResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateBatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBatchJobResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v10_services_RunBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_services_RunBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_RunBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "SequenceToken", "MutateOperations", });
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_AddBatchJobOperationsResponse_descriptor,
        new java.lang.String[] { "TotalOperations", "NextSequenceToken", });
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_ListBatchJobResultsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", "ResponseContentType", });
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v10_services_ListBatchJobResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_ListBatchJobResultsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", });
    internal_static_google_ads_googleads_v10_services_BatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v10_services_BatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_BatchJobResult_descriptor,
        new java.lang.String[] { "OperationIndex", "MutateOperationResponse", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v10.resources.BatchJobProto.getDescriptor();
    com.google.ads.googleads.v10.services.GoogleAdsServiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
