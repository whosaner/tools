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

package org.wso2.carbonstudio.eclipse.greg.base.persistent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.carbonstudio.eclipse.greg.base.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class RegistryUrlStore {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private File urlListFile;
	private List<RegistryURLInfo> urlList;
	private static RegistryUrlStore INSTANCE;

	/**
	 * RegistryUrlStore constructor
	 */
	private RegistryUrlStore() {
	}

	/**
	 * 
	 */
	private void init() {
		urlList = new ArrayList<RegistryURLInfo>();
		urlListFile = new File(ResourcesPlugin.getWorkspace().getRoot()
								.getLocation().append(".metadata").append(Activator.PLUGIN_ID)
								.append("urls.txt").toOSString());
		readUrlsFromFile();
	}

	/**
	 * get the instance of the RegistryUrlStore
	 * @return
	 */
	public static RegistryUrlStore getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RegistryUrlStore();
			INSTANCE.init();
		}
		return INSTANCE;
	}

	/**
	 * read added regisrty urls from the temperary file which contains urls of added registries
	 */
	private void readUrlsFromFile() {
		urlList.clear();
		synchronized (urlList) {
			if (!urlListFile.exists()){
				return;
			}
			StringBuilder contents = new StringBuilder();

			try {
				BufferedReader input = new BufferedReader(new FileReader(urlListFile));
				try {
					String line = null; // not declared within while loop
					while ((line = input.readLine()) != null) {
						int i = line.indexOf(" ");
						if (i > 0) {
							String url = line.substring(0, i).trim();
							String state_uname_path = line.substring(i).trim();
							i = state_uname_path.indexOf(" ");
							if (i > 0) {
								String state = state_uname_path.substring(0, i).trim();
								String uname_path = state_uname_path.substring(i).trim();
								i = uname_path.indexOf(" ");
								if (i > 0) {
									String uname = uname_path.substring(0, i).trim();
									String path = uname_path.substring(i).trim();
									RegistryURLInfo registryURLInfo = new RegistryURLInfo();
									registryURLInfo.setPersist(false);
									registryURLInfo.setUrl(new URL(url));
									registryURLInfo.setPath(path);
									registryURLInfo.setUsername(uname);
									registryURLInfo.setEnabled(state.equalsIgnoreCase("true"));
									urlList.add(registryURLInfo);
									registryURLInfo.setPersist(true);
								}
							}
						}
						contents.append(line);
						contents.append(System.getProperty("line.separator"));
					}
				} finally {
					input.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * save newly added registry url to the url file
	 */
	private void saveUrlsToFile() {
		if (urlListFile.exists()){
			urlListFile.delete();
		}
		if (!urlListFile.getParentFile().exists()){
			urlListFile.getParentFile().mkdirs();
		}
		Writer output = null;
		try {
			output = new BufferedWriter(new FileWriter(urlListFile));
			for (RegistryURLInfo registryURLInfo : urlList) {
				try {
					output.write(registryURLInfo.getUrl().toString() +
								" " +
								Boolean.toString(registryURLInfo.isEnabled())+
								" " +
								registryURLInfo.getUsername() + 
								" " +
								registryURLInfo.getPath() + 
								"\n");
				} catch (IOException e) {
					log.error(e);
				}
			}
		} catch (IOException e) {
			log.error(e);
		} finally {
			if (output != null)
				try {
					output.close();
				} catch (IOException e) {
					log.error(e);
				}
		}

	}

	/**
	 * get all registryUrls
	 * @return
	 */
	public List<RegistryURLInfo> getAllRegistryUrls() {
		return urlList;
	}

	/**
	 * add Registry url to url list and save it to the file
	 * @param registryUrl
	 * @param username
	 * @param path
	 * @return
	 */
	public RegistryURLInfo addRegistryUrl(URL registryUrl, 
										  String username,
										  String path) {
		RegistryURLInfo info = new RegistryURLInfo();
		info.setUrl(registryUrl);
		info.setPath(path);
		info.setUsername(username);
		urlList.add(info);
		saveUrlsToFile();
		return info;
	}

	/**
	 * remove Registry url to url list and update the file
	 * @param info
	 */
	public void removeRegistryUrl(RegistryURLInfo info) {
		if (urlList.contains(info)) {
			urlList.remove(info);
			saveUrlsToFile();
		}
	}

	/**
	 * keep track of previously added registries
	 */
	public void persist() {
		saveUrlsToFile();
	}
}
