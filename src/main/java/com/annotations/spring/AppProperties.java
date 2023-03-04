package com.annotations.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "app")
@Component
@Getter
@Setter
public class AppProperties {
	
	
	private String properties;
	
	

}
