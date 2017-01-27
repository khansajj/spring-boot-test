package com.saj.test.sample_project.controller;

import com.saj.test.sample_project.info.Extension;
import com.saj.test.sample_project.info.Properties;
import com.saj.test.sample_project.project.Projects;
import com.saj.test.sample_project.document.Documents;

public class Demo {

	public static void main(String[] args) {
		 Projects mainProject = new Projects(new Properties("Main Project", "Main Project")), 
				 project1 = new Projects(new Properties("Project 1", "Main Project/Project 1")),
		         project2 = new Projects(new Properties("Project 2", "Main Project/Project 2")),
		         project3 = new Projects(new Properties("Project 3", "Main Project/Project 3")),
		 		 projectA = new Projects(new Properties("Project A", "Main Project/Project 1/Project A"));
		 
		        Documents wordFile1 = new Documents(new Properties("WordFile1", "Main Project/Project 1/WordFile1.doc"), Extension.doc); 
		        Documents excelFile1 = new Documents(new Properties("ExcelFile1", "Main Project/Project 1/ExcelFile1.xls"), Extension.xls); 
		        Documents PPTFile1 = new Documents(new Properties("PPTFile1", "Main Project/Project 1/Project A/PPTFile1.xls"), Extension.ppt); 
		        Documents wordFile2 = new Documents(new Properties("WordFile2", "Main Project/Project 2/WordFile2.doc"), Extension.doc); 
				Documents excelFile2 = new Documents(new Properties("ExcelFile2", "Main Project/Project 2/ExcelFile2.xls"), Extension.xls); 
				
			     
				mainProject.add(project1);
				mainProject.add(project2);
				mainProject.add(project3);
				
		        project1.add(wordFile1);
		        project1.add(excelFile1);
		        project1.add(projectA);
		        projectA.add(PPTFile1);
		        project2.add(wordFile2);
		        project2.add(excelFile2);
		        mainProject.print();
	}

}
