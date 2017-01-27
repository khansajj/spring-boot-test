package com.saj.test.sample_project.info;

public class Properties {
	
	String fileName;
	
	String url;
	
	/**
	 * 
	 * @param pName
	 * @param pUrl
	 */
	public Properties(String pName, String pUrl){
		this.fileName = pName;
		this.url = pUrl;
	}

	public String getName() {
		return fileName;
	}


	public String getUrl() {
		return url;
	}


}
