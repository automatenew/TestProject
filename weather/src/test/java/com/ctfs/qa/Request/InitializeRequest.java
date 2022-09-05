package com.ctfs.qa.Request;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import lombok.Data;

@Component
@Data
public class InitializeRequest{
	@JsonProperty("cardType")
	 String cardType;
}
