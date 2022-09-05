package com.ctfs.qa.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import com.cmccarthy.common.utils.ApplicationProperties;
import com.ctfs.qa.Request.InitializeRequest;
import com.ctfs.qa.businessLogic.InitializeBusinessLogic;
import com.ctfs.qa.config.InitializeAPITestDefinition;
import com.ctfs.qa.response.InitializeResponse;
import com.ctfs.qa.sessionstorage.SessionContext;

import io.cucumber.java.en.Given;


public class InitializeAPIStepdef extends InitializeAPITestDefinition{
    private static final Logger LOGGER = LogManager.getLogger(InitializeAPIStepdef.class);
    
//    @Autowired
//    SessionContext context;
//    SessionContext context;
//    public InitializeAPIStepdef(SessionContext context) {
//        this.context=context;
//    }
    @Autowired
    private ApplicationProperties applicationProperties;
    
    @Autowired
    private InitializeRequest initReq;
    
    @Autowired
    private InitializeBusinessLogic initBusiness;
    
    @Given("User Calls Initiate Application API")
    public void user_calls_initiate_application_api() {
    	//Given
        int max=99999;
        int min=10000;
        
        int random_int1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        String webSessionID=String.valueOf(random_int1)+String.valueOf(random_int2);
        //String webSessionID="1234876542";
        System.out.println("webSessionID ------ "+webSessionID);
        System.out.println("CardType"+initReq.getCardType());
        String [] cardTypes = {"OMX","OMZ","OML"};
        
      
                InitializeResponse response = initBusiness.getAuthTokenResponse
                        ("OMZ",webSessionID );
                System.out.println("CardType2"+initReq.getCardType());
       //         String authToken = response.getJwt();
            //    LOGGER.info("### Generated Auth Token:" + authToken);
                //Then
                //verifyGeneratedToken();
                //applicationProperties.
    }
    
}