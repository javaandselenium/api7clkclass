package com.Github.curdopertions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GitHub.GenericLib.IEndPoints;
import com.GitHub.GenericLib.JavaUtiliy;
import com.GitHub.GenericLib.Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PostOperation extends Baseclass{
	String name="api"+JavaUtiliy.getRandomNum();
	
	Project p=new Project(name,"demo repo");
	
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		Response resp=given()
		.auth().oauth2(IEndPoints.btoken)
		.contentType(ContentType.JSON)
		.body(p)
		.post(IEndPoints.postOPeration);
		
		resp.then().log().all()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON);
		Reporter.log("post operation is successful");
		String gitreponame = resp.jsonPath().get("name");
System.out.println("The repo name which is created randomly "+gitreponame);
		
		//patch operation on dynamically created repro
		Project p1=new Project(name,"demo repo");
		given()
		.auth().oauth2(IEndPoints.btoken)
		.contentType(ContentType.JSON)
		.body(p1)
		.pathParam("owner",pdata.getData("owner"))
		.pathParam("repo", gitreponame)
		
		.patch("/repos/{owner}/{repo}")
		.then().log().all();
		
		Reporter.log("patch operation is scuccessful",true);
		
		//delete operation on dynamically created repo
		given()
		.auth().oauth2(IEndPoints.btoken)
		.pathParam("owner",pdata.getData("owner"))
		.pathParam("repo", gitreponame)
		.delete("/repos/{owner}/{repo}")
		.then().log().all();
		
		
		Reporter.log("delete operation is scuccessful",true);
		
		
		
	
	}

}
