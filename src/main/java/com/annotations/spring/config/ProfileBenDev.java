package com.annotations.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.annotations.spring.MyBean;



@Profile("dev")
@Configuration
public class ProfileBenDev {

	@Bean
	public MyBean devProfile() {
		System.out.println("Profile DEV Started");
		return new MyBean();
	}

}
