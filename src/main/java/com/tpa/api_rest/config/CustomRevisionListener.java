package com.tpa.api_rest.config;

import org.hibernate.envers.RevisionListener;

import com.tpa.api_rest.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;
	}

}