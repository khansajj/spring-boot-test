package com.saj.exercise.repository;

import java.util.ArrayList;

import com.saj.exercise.domain.Document;
import com.saj.exercise.domain.Extension;
import com.saj.exercise.domain.IFile;
import com.saj.exercise.domainprovider.DomainProvider;

public class DocumentRepository implements IDocumentRepository {

	private DomainProvider domainProvider;

	/**
	 * Constructor
	 * 
	 * @param provider
	 */
	public DocumentRepository(DomainProvider provider) {
		this.domainProvider = provider;

	}

	/**
	 * 
	 * @param name
	 * @param parentUrl
	 * @param pName
	 * @param extension
	 */
	public void storeDocument(String name, String parentUrl, Extension extension) {

		Document doc = new Document(name, parentUrl, extension);

		this.domainProvider.retrieve(parentUrl).addFile(doc);
		;

	}

	/**
	 * 
	 * @param pName
	 * @return
	 */
	public Document retrieveDocument(String dName, String parentUrl) {

		ArrayList<IFile> files = this.domainProvider.retrieve(parentUrl).retrieveAllFiles();

		for (IFile file : files) {

			if (file.getName().equals(dName)) {

				if (file instanceof Document) {
					return (Document) file;
				}
				else {
					return null;
				}
			}
		}

		return null;

	}

	public DomainProvider getDomainProvider() {
		return this.domainProvider;
	}

}
