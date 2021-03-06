/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.esb.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.esb.ProxyFaultSequenceConfiguration;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Fault Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProxyFaultSequenceConfigurationImpl extends AbstractProxySequenceConfigurationImpl implements ProxyFaultSequenceConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ProxyFaultSequenceConfigurationImpl() {
		super();
		
		// Sequence key.
		RegistryKeyProperty sequenceKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only sequences
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)sequenceKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);
		sequenceKey.setPrettyName("Fault Sequence");
		sequenceKey.setKeyName("faultSequence");
		sequenceKey.setKeyValue(DEFAULT_SEQUENCE_REFERENCE_REGISTRY_KEY);
		setSequenceKey(sequenceKey);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean hasSourceRepresentation() {
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		loadContent(self, "faultSequence");
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		return saveContent(parent, "faultSequence");		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.PROXY_FAULT_SEQUENCE_CONFIGURATION;
	}

} //ProxyFaultSequenceImpl
