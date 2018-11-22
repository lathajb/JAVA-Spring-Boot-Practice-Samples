package com.springboot.multiplecontainers;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Hello {
	
	
	public Hello() {
		System.out.println("Helo constructor involed");
	}
	
	@Bean(name="1")
	public Hello getHello() {
		return new Hello();
	}
	
	@Bean(name="2")
	public Hello getHello1() {
		return new Hello();
	}
	
	
	public String getWishes() {
		System.out.println("Good moring");
		return "Good moring";
	}
	
	
	    @Override
	    public String toString() {
	        return "Hello ......";
	    }

}
