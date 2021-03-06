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

package org.wso2.carbonstudio.eclipse.platform.ui.manager;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.utils.Validator;
import org.wso2.carbonstudio.eclipse.platform.ui.Activator;
import org.wso2.carbonstudio.eclipse.platform.ui.dialogs.TrustCertificateDialog;

public class EclipseSWTTrustManager implements X509TrustManager {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Shell shell;
	private static boolean initiated=false;
	public EclipseSWTTrustManager(Shell shell){
		setShell(shell);
	}
	
	public static void initiate(Shell shell){
//		if (initiated) return;
		SSLContext sc;
		try {
			TrustManager[] trustAllCerts = new TrustManager[]{new EclipseSWTTrustManager(shell)};
			sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (Exception e) {
			log.error(e);
		}
		initiated=true;
	}
	
	public void checkClientTrusted(X509Certificate[] certs, String authType)	throws CertificateException {

	}

	public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
        if (!Validator.isCertChainValid(certs)){
        	TrustCertificateDialog trustCertificateDialog = new TrustCertificateDialog(Display.getDefault().getActiveShell(),certs[0].toString());
        	if (trustCertificateDialog.open()==IDialogConstants.NO_ID)
        		throw new CertificateException("Untrusted certificate");
        }
	}

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
	public void setShell(Shell shell) {
		this.shell = shell;
	}
	public Shell getShell() {
		if (shell==null){
			shell=Display.getDefault().getActiveShell();
		}
		return shell;
	}

}
