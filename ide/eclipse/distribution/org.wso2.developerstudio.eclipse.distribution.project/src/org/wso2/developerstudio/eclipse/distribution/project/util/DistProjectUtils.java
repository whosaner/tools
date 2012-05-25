/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.distribution.project.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.maven.model.Dependency;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.utils.Constants;


public class DistProjectUtils {

	public static MavenProject getMavenProject(IProject project) throws Exception {
		IFile pomFile = project.getFile(Constants.POM_FILE_NAME + "." + Constants.POM_FILE_EXTENSION);
		return MavenUtils.getMavenProject(pomFile.getLocation().toFile());
	}
	
	
	public static String getArtifactInfoAsString(Dependency dep) {
		return getArtifactInfoAsString(dep,null);
	}
	
	//public static String get
	
	public static String getArtifactInfoAsString(Dependency dep,String parent) {
		String suffix= "";
		if(parent!=null){
			suffix =  "#" + parent + "#";
		} 
		return  suffix.concat(dep.getGroupId().concat(":").concat(dep.getArtifactId())
				.concat(":").concat(dep.getVersion()));
	}
	
	public static String getMavenInfoAsString(String info) {
		String suffix="";
		Pattern pattern = Pattern.compile("^#(.*?)#");
		Matcher matcher = pattern.matcher(info);
		 while (matcher.find()) {
			 suffix= matcher.group().toString();
	        }
		return info.replaceFirst(suffix,"");
	}
	
}
