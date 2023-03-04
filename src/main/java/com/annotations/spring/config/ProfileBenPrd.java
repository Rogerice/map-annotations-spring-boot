package com.annotations.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.annotations.spring.MyBean;

@Profile("prd") // profile a nivel de Classe
@Configuration // Pacote - Context
public class ProfileBenPrd {

	@Bean
	public MyBean prodProfile() {
		System.out.println("Profile PRD Started");
		return new MyBean();
	}


}
