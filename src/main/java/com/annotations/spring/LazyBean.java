package com.annotations.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // Pacote Context
public class LazyBean {

	
	
	public LazyBean() {
		System.out.println("#LazyBean started!!!!!");
		
	
	}

}
