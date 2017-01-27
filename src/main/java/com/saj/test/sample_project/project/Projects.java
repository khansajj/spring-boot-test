package com.saj.test.sample_project.project;

import java.util.ArrayList;

import com.saj.test.sample_project.info.Properties;
import com.saj.test.sample_project.print.Print;

public class Projects implements Print {

	private Properties properties;
	private ArrayList<Object> documents = new ArrayList<Object>();

	public Projects(Properties prop) {
		this.properties = prop;
	}

	public void add(Object obj) {
		documents.add(obj);
	}

	public void print() {
		
		System.out.println(
				"Project: " + properties.getName() + " - URL: Main /"+properties.getName());
		for (int i = 0; i < documents.size(); ++i) {
			// Leverage the "lowest common denominator"
			Print obj = (Print) documents.get(i);
			obj.print();
		}
	}
}