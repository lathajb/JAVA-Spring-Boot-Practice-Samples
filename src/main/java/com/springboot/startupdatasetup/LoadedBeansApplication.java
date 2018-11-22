package com.springboot.startupdatasetup;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
	public class LoadedBeansApplication implements CommandLineRunner {

	    @Autowired
	    private ApplicationContext appContext;


	    public void run(String... args) throws Exception {

	        String[] beans = appContext.getBeanDefinitionNames();
	        Arrays.sort(beans);
	        for (String bean : beans) {
	            System.out.println(bean);
	        }

	    }

	}