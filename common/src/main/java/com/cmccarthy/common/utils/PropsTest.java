package com.cmccarthy.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropsTest {

	@Value("weather.url.value")
	private String url;
	
	
	
}
