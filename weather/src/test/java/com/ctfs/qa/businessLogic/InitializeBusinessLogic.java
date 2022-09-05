package com.ctfs.qa.businessLogic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctfs.qa.Request.InitializeRequest;
import com.ctfs.qa.ServiceHelper.Post;
import com.ctfs.qa.api.base.BaseExecutor;
import com.ctfs.qa.api.base.Constants;
import com.ctfs.qa.config.InitializeContextConfiguration;
import com.ctfs.qa.response.InitializeResponse;

import io.cucumber.spring.CucumberContextConfiguration;


@Service
public class InitializeBusinessLogic extends BaseExecutor{

	@Autowired
	private InitializeRequest inireq;
	
	


private static final Logger LOGGER = LogManager.getLogger(InitializeBusinessLogic.class);


 public void setcardType(String cardType) {
	 inireq.setCardType(cardType);
 }
   public InitializeResponse getAuthTokenResponse(String cardType, String webSessionID)  {
	   inireq.setCardType(cardType);
	   generateSpec(Constants.BaseURL);
	  currentResponse.set(Post.getResponseUsingSpec(generateHeaders(webSessionID, null),inireq, Constants.initializeAPI));
	  currentResponse.get().prettyPrint();  
	  InitializeResponse authTokenResponse=    currentResponse.get().then().extract().response().as(InitializeResponse.class);
        return authTokenResponse;
    }
}