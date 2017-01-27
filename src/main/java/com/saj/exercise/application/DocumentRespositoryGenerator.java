package com.saj.exercise.application;

import com.saj.exercise.domain.Extension;
import com.saj.exercise.domain.Project;
import com.saj.exercise.repository.DocumentRepository;
import com.saj.exercise.repository.ProjectRepository;

public class DocumentRespositoryGenerator {

	public static void main(String[] args) {
		
		// preparing data 

		// user providing Main Project info
		String mainProject_name = "Main Project";
		String mainProject_Url = "Main Project";
		// user providing Project 1 info
		String project1_name = "Project 1";
		String project1_Url = mainProject_Url + "/" + project1_name;
		// user providing Project 2 info
		String project2_name = "Project 2";
		String project2_Url = mainProject_Url + "/" + project2_name;
		// user providing Project 3 info
		String project3_name = "Project 3";
		String project3_Url = mainProject_Url + "/" + project3_name;
		// user providing Project A info
		String projectA_name = "Project A";
		String projectA_Url = project1_Url + "/" + projectA_name;
		
		// user providing doc information
		String wordFile1_name = "WordFile1";
		String wordFile1_parentUrl = project1_Url;
		
		String excelFile1_name = "ExcelFile1";
		String excelFile1_parentUrl = project1_Url;
		
		String pptFile1_name = "PPTFile1";
		String pptFile1_parentUrl = projectA_Url;
		
		String wordFile2_name = "WordFile2";
		String wordFile2_parentUrl = project2_Url;
		
		String excelFile2_name = "ExcelFile2";
		String excelFile2_parentUrl = project2_Url;
	
		// data preparation finished 
		
		// storing data into the system 
		
		// system storing projects data
		
		ProjectRepository projectRepository = new ProjectRepository();

		projectRepository.storeProject(mainProject_name, mainProject_Url, "");

		projectRepository.storeProject(project1_name, project1_Url, mainProject_Url);

		projectRepository.storeProject(project2_name, project2_Url, mainProject_Url);

		projectRepository.storeProject(project3_name, project3_Url, mainProject_Url);

		projectRepository.storeProject(projectA_name, projectA_Url, project1_Url);
		
		// system storing documents data
		DocumentRepository documentRepository = new DocumentRepository(projectRepository.getDomainProvider());
		
		documentRepository.storeDocument(wordFile1_name, wordFile1_parentUrl, Extension.doc);
		
		documentRepository.storeDocument(excelFile1_name, excelFile1_parentUrl, Extension.xls);
		
		documentRepository.storeDocument(pptFile1_name, pptFile1_parentUrl, Extension.ppt);
		
		documentRepository.storeDocument(wordFile2_name, wordFile2_parentUrl, Extension.doc);
		
		documentRepository.storeDocument(excelFile2_name, excelFile2_parentUrl, Extension.xls);
		
		// data stored into the system
		
		// retrieving data
		
		// only retrieving main project. It should have all the content to display
		
		Project mainProject = projectRepository.retrieveProject(mainProject_Url);
		
		mainProject.displayInformation();
		
		

			}

}
