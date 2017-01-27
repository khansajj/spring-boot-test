/**
 * 
 */
package com.saj.exercise.domain;

/**
 * @author saj
 *
 */
public class Document implements IFile {
	
	private String documentName;
	
	private String documentUrl;
	
	private Extension documentExtension;
	
	
	public Document(String dName, String parentUrl, Extension dExtension){
		this.documentName = dName;
		this.documentExtension = dExtension;
		this.documentUrl = parentUrl +"/"+dName+"."+dExtension.name();
		
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return this.documentName;
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getUrl()
	 */
	public String getUrl() {
		// TODO Auto-generated method stub
		return this.documentUrl;
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getInformation()
	 */
	public void displayInformation() {
		System.out.println(
				"Document: " + getName() + " - Extension: ." 
		+ getExtension().name() + " - URL: " +getUrl());
	}
	
	public Extension getExtension(){
		return this.documentExtension;
	}

}
