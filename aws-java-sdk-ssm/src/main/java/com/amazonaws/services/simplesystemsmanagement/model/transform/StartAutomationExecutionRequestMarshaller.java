/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartAutomationExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAutomationExecutionRequestMarshaller {

    private static final MarshallingInfo<String> DOCUMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentName").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<String> TARGETPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetParameterName").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<List> TARGETMAPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetMaps").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<List> TARGETLOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLocations").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StartAutomationExecutionRequestMarshaller instance = new StartAutomationExecutionRequestMarshaller();

    public static StartAutomationExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAutomationExecutionRequest startAutomationExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAutomationExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAutomationExecutionRequest.getDocumentName(), DOCUMENTNAME_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getTargetParameterName(), TARGETPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getTargetMaps(), TARGETMAPS_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getTargetLocations(), TARGETLOCATIONS_BINDING);
            protocolMarshaller.marshall(startAutomationExecutionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
