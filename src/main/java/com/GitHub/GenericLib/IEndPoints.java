package com.GitHub.GenericLib;

public interface IEndPoints {
	
String getOperation="/repos/{owner}/{repo}";
String postOPeration="/user/repos";
String updateOperation="/repos/{owner}/{repo}";
String deleteOperation="/repos/{owner}/{repo}";

String propertyFilePath="./data.properties";
String btoken="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";

}
