/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.capp.project.nature;

import org.eclipse.osgi.util.NLS;

public class DataConstants extends NLS {
	private static final String BUNDLE_NAME = "org.wso2.carbonstudio.eclipse.capp.project.nature.messages"; //$NON-NLS-1$
	public static String SUPER_ARTIFACT_DEFAULT_VERSION;
	public static String SUPER_ARTIFACT_TYPE;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, DataConstants.class);
	}

	private DataConstants() {
	}
}
