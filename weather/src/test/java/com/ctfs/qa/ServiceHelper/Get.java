package com.ctfs.qa.ServiceHelper;


import static io.restassured.RestAssured.given;



import java.util.Map;

import com.ctfs.qa.api.base.BaseExecutor;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tech.grasshopper.filter.ExtentRestAssuredFilter;



@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Get extends BaseExecutor{
    
//    static {
//        System.setProperty("javax.net.ssl.trustStore", "C:\\Dash\\cacerts\\cacerts.jks");
//        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
//    }
    public static Response getResponse(String url) {
        return given().contentType(ContentType.JSON).when()
                .get(url);
    }
    public static Response getResponseWithHeader(Map<String, String> headers,String url) {
        requestSpec.get().headers(headers);
        return given().spec(requestSpec.get()).filter(new ExtentRestAssuredFilter()).log().all()
                .get(url);
    }



   public static Response getResponseUsingProxy(String url, String proxyHost, int proxyPort) {
        return given().contentType(ContentType.JSON).proxy(proxyHost, proxyPort).when()
                .get(url);
    }



   public static int getStatusCode(String url) {
        return given().contentType(ContentType.JSON).when()
                .get(url).getStatusCode();
    }



   public static JsonPath getBodyAsJsonPath(String url) {
        return given().auth().none().contentType(ContentType.JSON).when()
                .get(url).body().jsonPath();
    }



   public static Response getResponseUsingPathParams(String key, String value, String url) {
        return given().contentType(ContentType.JSON).with()
                .pathParams(key, value)
                .when().get(String.format("%s/{%s}", url, key));
    }



   public static Response getResponseUsingQueryParams(String key, String value, String url) {
        return given().contentType(ContentType.JSON)
                .queryParam(key, value)
                .when().get(url);
        // url will become - http://url?page=2
    }
}