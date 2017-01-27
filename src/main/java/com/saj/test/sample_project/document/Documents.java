package com.saj.test.sample_project.document;

import com.saj.test.sample_project.info.Extension;
import com.saj.test.sample_project.info.Properties;
import com.saj.test.sample_project.print.Print;

/**
 * 
 * @author Sajjad Khan
 *
 */
public class Documents implements Print {

	Properties properties;
	
	Extension extension;

	
	public Documents(final Properties prop, final Extension ext) {
		this.properties = prop;
		this.extension = ext;
	}

	public void print() {
		System.out.println(
				"Document: " + properties.getName() + " - Extension: ." 
		+ extension.name() + " - URL: " +properties.getUrl());
	}

}
