/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/finding.proto

package com.google.cloud.securitycenter.v1;

public final class FindingOuterClass {
  private FindingOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v1/finding"
          + ".proto\022\036google.cloud.securitycenter.v1\032\034"
          + "google/api/annotations.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/securitycenter/v1"
          + "/security_marks.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\244\005\n\007Finding\022\014\n\004name\030\001 \001(\t\022\016\n\006parent"
          + "\030\002 \001(\t\022\025\n\rresource_name\030\003 \001(\t\022<\n\005state\030\004"
          + " \001(\0162-.google.cloud.securitycenter.v1.Fi"
          + "nding.State\022\020\n\010category\030\005 \001(\t\022\024\n\014externa"
          + "l_uri\030\006 \001(\t\022X\n\021source_properties\030\007 \003(\0132="
          + ".google.cloud.securitycenter.v1.Finding."
          + "SourcePropertiesEntry\022J\n\016security_marks\030"
          + "\010 \001(\0132-.google.cloud.securitycenter.v1.S"
          + "ecurityMarksB\003\340A\003\022.\n\nevent_time\030\t \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013create_time"
          + "\030\n \001(\0132\032.google.protobuf.Timestamp\032O\n\025So"
          + "urcePropertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005valu"
          + "e\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\"8\n\005S"
          + "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022"
          + "\014\n\010INACTIVE\020\002:l\352Ai\n%securitycenter.googl"
          + "eapis.com/Finding\022@organizations/{organi"
          + "zation}/sources/{source}/findings/{findi"
          + "ng}B\332\001\n\"com.google.cloud.securitycenter."
          + "v1P\001ZLgoogle.golang.org/genproto/googlea"
          + "pis/cloud/securitycenter/v1;securitycent"
          + "er\252\002\036Google.Cloud.SecurityCenter.V1\312\002\036Go"
          + "ogle\\Cloud\\SecurityCenter\\V1\352\002!Google::C"
          + "loud::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ResourceName",
              "State",
              "Category",
              "ExternalUri",
              "SourceProperties",
              "SecurityMarks",
              "EventTime",
              "CreateTime",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
