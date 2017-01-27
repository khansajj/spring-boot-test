package com.saj.exercise.repository;

import com.saj.exercise.domain.Document;
import com.saj.exercise.domain.Extension;

public interface IDocumentRepository {

	// store document
	void storeDocument(String name, String parentUrl, Extension extension);
	
	// retrieve document
	Document retrieveDocument(String dName, String parentUrl);
}
