package com.Github.curdopertions;

public class Project {
	private String name="Apitestdemo";
	private String description="dummy repo";
	
	
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
