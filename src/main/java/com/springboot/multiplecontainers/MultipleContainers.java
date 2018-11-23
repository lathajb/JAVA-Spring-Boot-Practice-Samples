package com.springboot.multiplecontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*@SpringBootApplication
public class MultipleContainers {

	public static void main(String[] args) {
		
		System.out.println("From spring boot");

		ApplicationContext appContext = SpringApplication.run(MultipleContainers.class, args);
		
		
		
		ApplicationContext appContext1 = SpringApplication.run(MultipleContainers.class, args); // javax.management.InstanceAlreadyExistsException
		
		
		//Hello a = (Hello)appContext.getBean("hello");
		//System.out.println(a.getWishes()+ a);
		
		//Hello a1 = (Hello)appContext.getBean("hello");
		//System.out.println("Hello1 :"+ a1.getWishes()+ a1);
		
		
		Hello sample1 = (Hello) appContext.getBean("1");  
        Hello sample2 = (Hello) appContext.getBean("2");
        System.out.println(sample1 == sample2);
        System.out.println(sample1 + "::" + sample2);
		
		
	}
}
*/