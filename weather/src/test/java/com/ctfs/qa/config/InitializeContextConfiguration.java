package com.ctfs.qa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.retry.annotation.EnableRetry;

import com.ctfs.qa.Request.InitializeRequest;

@EnableRetry
@Configuration
@ComponentScan({
        "com.cmccarthy.api",
        "com.cmccarthy.common",
        "com.ctfs.qa.api.base",
        "com.ctfs.qa",
        "com.ctfs.qa.Request",
        
})
@PropertySource("classpath:/application.properties")
public class InitializeContextConfiguration {
//	@Bean
//	public InitializeRequest getInitializeRequest() {
//		return new InitializeRequest();
//	}
	
}
