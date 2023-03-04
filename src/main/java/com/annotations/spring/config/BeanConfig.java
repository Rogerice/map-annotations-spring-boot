package com.annotations.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.annotations.spring.MyBean;

@Configuration // Pacote - Context
//@ComponentScan(basePackages ="com.annotations.spring.config" )
public class BeanConfig {

	/*
	 * essa classe foi criada para entender como o Spring interpreta as anotações
	 * 
	 * @Configuration | @ComponentScan | @Bean / Pacote - Context
	 * Anotação @ComponentScan pode usar para especificar os pacotes que são os
	 * beans que ele vai precisar fazer uma varredura, mas aqui não precisamos pois
	 * o Spring Boot já tem definido por padrão
	 */

	@Bean // Pacote - Context
	public MyBean myBean() {
		return new MyBean();

	}

}
