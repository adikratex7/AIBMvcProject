package com.aib.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aib.entity.ProjectHighlight;
import com.aib.repo.ProjectHighlghtsRepo;
import com.aib.service.IProjectHighlights;

@Service
public class ProjectHighlightsServiceImple implements IProjectHighlights {

	@Autowired
	private ProjectHighlghtsRepo repo;
	
	@Override
	public String saveHighlight(ProjectHighlight projectHighlight) {
		
		return "Project Highlights Save Successfully with Project ID::"+repo.save(projectHighlight).getProjectId();
	}

	@Override
	public Iterable<ProjectHighlight> getAllHightlights() {
		
		return repo.findAll();
	}

	

}
