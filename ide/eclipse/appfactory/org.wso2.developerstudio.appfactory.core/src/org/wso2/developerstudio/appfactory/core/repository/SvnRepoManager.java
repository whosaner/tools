/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.developerstudio.appfactory.core.repository;

import java.io.File;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;

public class SvnRepoManager {

 private static SVNClientManager ourClientManager;
 
	public static long checkout(SVNURL url, SVNRevision revision,
			File destPath, boolean isRecursive) throws SVNException {
		SVNUpdateClient updateClient = ourClientManager.getUpdateClient();
		updateClient.setIgnoreExternals(false);
		return updateClient.doCheckout(url, destPath, revision, revision,
				isRecursive);
	}
	
	public static long update( File wcPath , SVNRevision updateToRevision , boolean isRecursive ) throws SVNException {

        SVNUpdateClient updateClient = ourClientManager.getUpdateClient( );
        updateClient.setIgnoreExternals( false );
        return updateClient.doUpdate( wcPath , updateToRevision , isRecursive );
    }
 
}
