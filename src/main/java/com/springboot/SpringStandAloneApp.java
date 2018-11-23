package com.springboot;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStandAloneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SpringApplication app = new SpringApplication(SpringStandAloneApp.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args); // stand alone mode
		
		ApplicationContext appc = SpringApplication.run(SpringStandAloneApp.class, args);
		
		System.out.println(appc.getBeanDefinitionCount());
	}

}
