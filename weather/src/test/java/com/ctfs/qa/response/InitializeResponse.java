package com.ctfs.qa.response;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Component
@Data
public class InitializeResponse {
	
	@JsonProperty("jwt")
	String jwt;
}
