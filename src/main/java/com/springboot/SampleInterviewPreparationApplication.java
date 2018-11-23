package com.springboot;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springboot.startupdatasetup.BeanInitMethodExample;
import com.springboot.startupdatasetup.LoadPropertyDataFromApplication;

@SpringBootApplication
public class SampleInterviewPreparationApplication extends SpringBootServletInitializer  implements CommandLineRunner  {

	@Bean(initMethod="latha")
	public BeanInitMethodExample exBean() {
	    return new BeanInitMethodExample();
	}
	
	 @Autowired
	 private LoadPropertyDataFromApplication cmdbProperties;
	 
	  
	@Autowired
	ApplicationContext appContext;
	
	public static void main(String[] args) {
		System.out.println("From spring boot on port :" );
		
		SpringApplication.run(SampleInterviewPreparationApplication.class, args);
	}
	
	public void run(String... args) throws Exception {

        String[] beans = appContext.getBeanDefinitionNames();
       
        Arrays.sort(beans);
        for (String bean : beans) {
            //System.out.println("Loaded bean............."+bean);
        }

    }
	
	// using run overloaded method
	@Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            String[] beans = appContext.getBeanDefinitionNames();
            //Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(SampleInterviewPreparationApplication.class);
	}
	
	
}
