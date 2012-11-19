/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Arrays;
import java.util.List;

import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.rest.API;
import org.apache.synapse.rest.Resource;
import org.apache.synapse.rest.dispatch.DispatcherHelper;
import org.apache.synapse.rest.dispatch.URITemplateHelper;
import org.apache.synapse.rest.dispatch.URLMappingHelper;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResource;
import org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

/**
 * Synapse API deserializer
 */
public class APIDeserializer extends AbstractEsbNodeDeserializer<API, SynapseAPI> {

	@Override
	public SynapseAPI createNode(IGraphicalEditPart part,API api) {
		SynapseAPI synapseAPI = (SynapseAPI) DeserializerUtils.createNode(part, EsbElementTypes.SynapseAPI_3668);
		setElementToEdit(synapseAPI);
		refreshEditPartMap();
		
		executeSetValueCommand(SYNAPSE_API__API_NAME, api.getAPIName());
		executeSetValueCommand(SYNAPSE_API__CONTEXT, api.getContext());
		if (api.getHost() != null) {
			executeSetValueCommand(SYNAPSE_API__HOST_NAME, api.getHost());
		}
		if (api.getPort() > 0) {
			executeSetValueCommand(SYNAPSE_API__PORT, api.getPort());
		}
		GraphicalEditPart apiCompartment = (GraphicalEditPart) getEditpart(synapseAPI).getChildren().get(0);
		Resource[] resources = api.getResources();
		for (int i = 0; i < resources.length; i++) {
			
			APIResource resource = (APIResource) DeserializerUtils.createNode(apiCompartment, EsbElementTypes.APIResource_3669);
			
			refreshEditPartMap();
			
			List<String> methodList = Arrays.asList(resources[i].getMethods());
			executeSetValueCommand(API_RESOURCE__ALLOW_GET, methodList.contains("GET"));
			executeSetValueCommand(API_RESOURCE__ALLOW_POST, methodList.contains("POST"));
			executeSetValueCommand(API_RESOURCE__ALLOW_OPTIONS, methodList.contains("OPTIONS"));
			executeSetValueCommand(API_RESOURCE__ALLOW_DELETE, methodList.contains("DELETE"));
			executeSetValueCommand(API_RESOURCE__ALLOW_PUT, methodList.contains("PUT"));
			
			DispatcherHelper dispatcherHelper = resources[i].getDispatcherHelper();
			if(dispatcherHelper instanceof URITemplateHelper){
				URITemplateHelper helper = (URITemplateHelper) dispatcherHelper;
				executeSetValueCommand(API_RESOURCE__URL_STYLE, ApiResourceUrlStyle.URI_TEMPLATE);
				executeSetValueCommand(API_RESOURCE__URI_TEMPLATE, helper.getUriTemplate().toString());
			} else if(dispatcherHelper instanceof URLMappingHelper){
				URLMappingHelper helper = (URLMappingHelper) dispatcherHelper; 
				executeSetValueCommand(API_RESOURCE__URL_STYLE,ApiResourceUrlStyle.URL_MAPPING);
				executeSetValueCommand(API_RESOURCE__URL_MAPPING, helper.toString());
			} else{
				executeSetValueCommand(API_RESOURCE__URL_STYLE,ApiResourceUrlStyle.NONE);
			}
			
			setRootInputConnector(resource.getInputConnector());
			MediatorFlow mediatorFlow = resource.getContainer().getSequenceAndEndpointContainer().getMediatorFlow();
			GraphicalEditPart compartment = (GraphicalEditPart)((getEditpart(mediatorFlow)).getChildren().get(0));
			
			SequenceMediator inSequence = resources[i].getInSequence();
			if(inSequence!=null){	
				setRootCompartment(compartment);
				deserializeSequence(compartment, inSequence, resource.getOutputConnector());
				setRootCompartment(null);
			} else{
				String inSequenceName = resources[i].getInSequenceKey();
				if(inSequenceName!=null){
					if(inSequenceName.startsWith("/") || inSequenceName.startsWith("conf:") || inSequenceName.startsWith("gov:")){
						resource.setInSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(inSequenceName);
						executeSetValueCommand(API_RESOURCE__IN_SEQUENCE_KEY, keyProperty);
					} else{
						executeSetValueCommand(API_RESOURCE__IN_SEQUENCE_TYPE, SequenceType.NAMED_REFERENCE);
						executeSetValueCommand(API_RESOURCE__IN_SEQUENCE_NAME, inSequenceName);
					}
				}
			}
			
			SequenceMediator outSequence = resources[i].getOutSequence();
			if(outSequence!=null){
				setRootCompartment(compartment);
				deserializeSequence(compartment, outSequence, resource.getInputConnector());
				setRootCompartment(null);
			} else{
				String outSequenceName = resources[i].getOutSequenceKey();
				if(outSequenceName!=null){
					if(outSequenceName.startsWith("/") || outSequenceName.startsWith("conf:") || outSequenceName.startsWith("gov:")){
						resource.setOutSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(outSequenceName);
						executeSetValueCommand(API_RESOURCE__OUT_SEQUENCE_KEY, keyProperty);
					} else{
						executeSetValueCommand(API_RESOURCE__OUT_SEQUENCE_TYPE, SequenceType.NAMED_REFERENCE);
						executeSetValueCommand(API_RESOURCE__OUT_SEQUENCE_NAME, outSequenceName);
					}
				}
			}
			
			SequenceMediator faultSequence = resources[i].getFaultSequence();
			if(faultSequence!=null){
				MediatorFlow faultMediatorFlow = resource.getContainer().getFaultContainer().getMediatorFlow();
				GraphicalEditPart faultCompartment = (GraphicalEditPart)((getEditpart(faultMediatorFlow)).getChildren().get(0));
				setRootCompartment(faultCompartment);
				deserializeSequence(faultCompartment, faultSequence, resource.getFaultInputConnector());
				setRootCompartment(null);
			} else{
				String faultSequenceName = resources[i].getFaultSequenceKey();
				if(faultSequenceName!=null){
					if(faultSequenceName.startsWith("/") || faultSequenceName.startsWith("conf:") || faultSequenceName.startsWith("gov:")){
						resource.setFaultSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(faultSequenceName);
						executeSetValueCommand(API_RESOURCE__FAULT_SEQUENCE_KEY, keyProperty);
					} else{
						executeSetValueCommand(API_RESOURCE__FAULT_SEQUENCE_TYPE, SequenceType.NAMED_REFERENCE);
						executeSetValueCommand(API_RESOURCE__FAULT_SEQUENCE_NAME, faultSequenceName);
					}
				}
			}
			
			addPairMediatorFlow(resource.getOutputConnector(),resource.getInputConnector());

		}
		
		return synapseAPI;
	}

}
