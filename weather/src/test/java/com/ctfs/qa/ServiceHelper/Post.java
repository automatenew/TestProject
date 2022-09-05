package com.ctfs.qa.ServiceHelper;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tech.grasshopper.filter.ExtentRestAssuredFilter;
import io.restassured.http.ContentType;



import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.ctfs.qa.api.base.BaseExecutor;

import static io.restassured.RestAssured.given;



@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Post extends BaseExecutor{



  
    public static Response getResponseUsingSpec(Map<String, String> map,  Object body ,String url) {
        requestSpec.get().headers(map);
        requestSpec.get().body(body);
        System.out.println("requestSpec.get()"+requestSpec.get());
       Response response = given().spec(requestSpec.get()).filter(new ExtentRestAssuredFilter()).log().all()
        .post(url);
       response.prettyPrint();
        return   response ; 
        }
}