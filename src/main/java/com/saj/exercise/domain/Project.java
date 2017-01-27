/**
 * 
 */
package com.saj.exercise.domain;

import java.util.ArrayList;

/**
 * @author saj
 *
 */
public class Project implements IFile {
	
	private ArrayList<IFile> files = new ArrayList<IFile>();
	
	private String projectName;
	
	private String projectUrl;
	
	public Project(String pName, String pUrl){
		this.projectName = pName;
		this.projectUrl = pUrl;
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getName()
	 */
	public String getName() {
		return projectName;
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getUrl()
	 */
	public String getUrl() {
		return projectUrl;
	}

	/* (non-Javadoc)
	 * @see com.saj.exercise.domain.IFile#getInformation()
	 */
	public void displayInformation() {
		System.out.println(
				"Project: " + getName() + " - URL:"+getUrl());
		for (IFile file: files) {
			// Leverage the "lowest common denominator"
			file.displayInformation();
		}
	}
	
	/**
	 * 
	 * @param obj
	 */
	public void addFile(IFile file) {
		files.add(file);
	}
	
	public ArrayList<IFile> retrieveAllFiles(){
		return files;
	}

}
