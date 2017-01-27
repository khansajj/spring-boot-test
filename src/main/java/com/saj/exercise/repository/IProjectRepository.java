package com.saj.exercise.repository;

import com.saj.exercise.domain.Project;

public interface IProjectRepository {
	
	void storeProject(String pName, String pUrl, String parentUrl);
	
	Project retrieveProject(String pUrl);

}
