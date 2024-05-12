package com.aib.dto;



public class ProjectHighlight {
	
	
	
	
	private String projectId;
	
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	private String projectName;
	
	private String projectTechStack;
	
	private String projectType;

	

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectTechStack() {
		return projectTechStack;
	}

	public void setProjectTechStack(String projectTechStack) {
		this.projectTechStack = projectTechStack;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public ProjectHighlight() {
		super();
	}

	@Override
	public String toString() {
		return "ProjectHighlight [projectId=" + projectId + ", projectName=" + projectName + ", projectTechStack="
				+ projectTechStack + ", projectType=" + projectType + "]";
	}

	

	
	
	

}