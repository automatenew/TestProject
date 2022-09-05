package com.ctfs.qa.api.base;




import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;



import java.util.HashMap;
import java.util.Map;




//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseExecutor extends BaseBuilder{
    protected static final ThreadLocal<RequestSpecification> requestSpec =new ThreadLocal<>();
     public static final ThreadLocal<Response> currentResponse =new ThreadLocal<>();
     private static final ThreadLocal<Map<String, String>> headers =new ThreadLocal<>();
     private static final ThreadLocal<Response> jwtToken =new ThreadLocal<>();
     private static final ThreadLocal<Response> sessionID =new ThreadLocal<>();
     
    public static String guestToken;
    public static String tokenAfterLogin;
    public static Integer userId;
    public static String username;
    public static String userPassword;
    public static String userEmail;



//    public BaseExecutor() {
//        generateSpec();
//    }
    public static void generateSpec() {
        RequestSpecification spec = SpecBuilder(Constants.BaseURL);
        requestSpec.set(spec);
    }
    public static void generateSpec(String baseURL) {
        RequestSpecification spec = SpecBuilder(baseURL);
        requestSpec.set(spec);
    }
   
    
    
    public static Map<String, String> generateHeaders(String webSessionID, String jwtToken) {
        Map<String, String> headers =new HashMap<>();
        headers.put("Web-Session-id", webSessionID);
        if(jwtToken!=null) {
            headers.put("Authorization", "Bearer "+jwtToken);
        }
        return headers;
    }
        
    
        
    /**
     *
     * @param guestToken
     * @return
     */
    public Response generateRequestBody(String guestToken) {
        return given()
               // .spec(requestSpecification)
                .header("Authorization", "Bearer " + guestToken)
                //.body(body)
                .post("");
    }



   /**
     * POST Registered user authorization request
     */
    public Response authorizationByCreatedPlayer() {
        return given()
               // .spec(requestSpecification)
               // .header("Authorization", authorizationBasicHeader)
               // .body()
                .post("");
    }



   /**
     * GET User profile data request
     */
    public Response getUserProfile(String userId, String tokenAfterLogin) {
        return given()
               // .spec(requestSpecification)
                .header("Authorization", "Bearer " + tokenAfterLogin)
                .get( userId);
    }
    
    
   
}