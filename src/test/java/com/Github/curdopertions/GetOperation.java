package com.Github.curdopertions;


import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetOperation extends Baseclass{
	
	@Test
	public void tc1() throws FileNotFoundException, IOException {

	
given()
.pathParam("owner",pdata.getData("owner"))
.pathParam("repo",pdata.getData("repo"))
.get("/repos/{owner}/{repo}")
.then().log().all()
.assertThat().statusCode(200)
.contentType(ContentType.JSON);

Reporter.log("get operation is successful");
		
	}

}
