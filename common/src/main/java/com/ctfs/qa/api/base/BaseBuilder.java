package com.ctfs.qa.api.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseBuilder {
	 static RequestSpecBuilder builder;
	 static RequestSpecification reqspec;
	 public static RequestSpecification SpecBuilder(String baseURL) 
{
		 builder= new RequestSpecBuilder();
		 builder.setBaseUri(Constants.BaseURL);
		 reqspec=builder.build();
	return reqspec;
}
}
