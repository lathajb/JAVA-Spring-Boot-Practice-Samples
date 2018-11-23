package com.springboot.autoconfiguration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomAutoConfiguration {
	
	public MyCustomAutoConfiguration() {
		System.out.println("********************************");
	}

}
