package com.saj.exercise.domainprovider;

import java.util.HashMap;

import com.saj.exercise.domain.Project;

/**
 * In real system this class should retrieve the data from the backend/database 
 * @author saj
 *
 */
public class DomainProvider {
	
	// using map to store and retrieve data instead of map
	private HashMap<String, Project> projects = new HashMap<String, Project>();
	
	public void save(Project project){
		projects.put(project.getUrl(), project);
	}
	
	public Project retrieve(String pUrl){
		return projects.get(pUrl);
	}


}
