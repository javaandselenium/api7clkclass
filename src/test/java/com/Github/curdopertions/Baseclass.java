package com.Github.curdopertions;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.GitHub.GenericLib.Propertyfile;

import static io.restassured.RestAssured.*;

public class Baseclass{
	public Propertyfile pdata=new Propertyfile();
	
	@BeforeMethod
	public void openApp() {
		baseURI = "https://api.github.com";
	}

	@AfterMethod
	public void closeApp() {
		Reporter.log("closeing the application");
	}
}
