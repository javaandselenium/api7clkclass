package com.GitHub.GenericLib;

public class Project {
	public String name="Apitestdemo";
	public String description="dummy repo";
	
	
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public Project() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
