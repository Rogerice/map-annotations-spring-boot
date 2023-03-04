package com.annotations.spring;


public class MyBean {

	
	//mesmo essa classe não tendo anotação @bean, ele foi mapeado pela classe de configuração do Spring com anatoação @Configuration
	
	
	public void method() {
		System.out.println("MyBean method() foi criado pelo Spring");
	}
	
	

}
