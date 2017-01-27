package com.saj.exercise.repository;

import com.saj.exercise.domain.Project;
import com.saj.exercise.domainprovider.DomainProvider;

public class ProjectRepository {

	private DomainProvider domainProvider = new DomainProvider();

	public void storeProject(String pName, String pUrl, String parentUrl) {

		Project project = new Project(pName, pUrl);

		if(parentUrl != null && !parentUrl.equals("")){
			Project parentProject = this.domainProvider.retrieve(parentUrl);
			parentProject.addFile(project);
			this.domainProvider.save(parentProject);

		}
		
		this.domainProvider.save(project);

	}

	/**
	 * 
	 * @param pName
	 * @return
	 */
	public Project retrieveProject(String pUrl){
		
		return this.domainProvider.retrieve(pUrl);
		
	}
	
	public DomainProvider getDomainProvider(){
		return this.domainProvider;
	}

}
