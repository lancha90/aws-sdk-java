/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchWriteOperationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchWriteOperationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CREATEOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateObject").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachObject").build();
    private static final MarshallingInfo<StructuredPojo> DETACHOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetachObject").build();
    private static final MarshallingInfo<StructuredPojo> UPDATEOBJECTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateObjectAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DELETEOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteObject").build();
    private static final MarshallingInfo<StructuredPojo> ADDFACETTOOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddFacetToObject").build();
    private static final MarshallingInfo<StructuredPojo> REMOVEFACETFROMOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveFacetFromObject").build();

    private static final BatchWriteOperationMarshaller instance = new BatchWriteOperationMarshaller();

    public static BatchWriteOperationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchWriteOperation batchWriteOperation, ProtocolMarshaller protocolMarshaller) {

        if (batchWriteOperation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchWriteOperation.getCreateObject(), CREATEOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getAttachObject(), ATTACHOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getDetachObject(), DETACHOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getUpdateObjectAttributes(), UPDATEOBJECTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getDeleteObject(), DELETEOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getAddFacetToObject(), ADDFACETTOOBJECT_BINDING);
            protocolMarshaller.marshall(batchWriteOperation.getRemoveFacetFromObject(), REMOVEFACETFROMOBJECT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
