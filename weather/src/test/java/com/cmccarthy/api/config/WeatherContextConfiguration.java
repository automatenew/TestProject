package com.cmccarthy.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@Configuration
@ComponentScan({
        "com.cmccarthy.api",
        "com.cmccarthy.common",
        "com.ctfs.qa.api.base",
        "com.ctfs.qa",
        
})
@PropertySource("classpath:/application.properties")
public class WeatherContextConfiguration {

}
