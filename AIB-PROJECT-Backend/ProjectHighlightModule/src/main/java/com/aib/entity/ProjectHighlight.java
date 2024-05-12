package com.aib.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectHighlight {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;
	
	private String projectName;
	
	private String projectTechStack;
	
	private String projectType;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

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