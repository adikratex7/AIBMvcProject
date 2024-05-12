package com.aib.service;

import com.aib.entity.ProjectHighlight;

public interface IProjectHighlights {
	
	
	public String saveHighlight(ProjectHighlight projectHighlight);
	
	public Iterable<ProjectHighlight> getAllHightlights();

}
