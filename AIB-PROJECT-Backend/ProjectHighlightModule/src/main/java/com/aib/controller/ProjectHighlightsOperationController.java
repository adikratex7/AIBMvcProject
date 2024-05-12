package com.aib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aib.entity.ProjectHighlight;
import com.aib.service.IProjectHighlights;

@RestController
@RequestMapping("/projecthighlight")
public class ProjectHighlightsOperationController {
	
	@Autowired
	private IProjectHighlights service;
	
	
	@PostMapping("/addHighlight")
	public ResponseEntity<String> saveHighlight(@RequestBody ProjectHighlight highlight)
	{
		  
		String result = service.saveHighlight(highlight);
		
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getAllHighlights")
	public ResponseEntity<Iterable<ProjectHighlight>> getAllHighlights()
	{
		
		
		Iterable<ProjectHighlight> result= service.getAllHightlights();
		
		
		return new ResponseEntity<Iterable<ProjectHighlight>>(result,HttpStatus.OK);
		
		
	}

}
