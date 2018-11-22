package com.springboot.startupdatasetup;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PostConstructExampleBean {
	
	public final Logger logger = LoggerFactory.getLogger(PostConstructExampleBean.class);
	
			@Autowired
		    private Environment environment;
		 
		    @PostConstruct
		    public void init() {
		    	logger.info("using PostConstruct annotation...... :"+environment.getDefaultProfiles().toString());
		    }

}
