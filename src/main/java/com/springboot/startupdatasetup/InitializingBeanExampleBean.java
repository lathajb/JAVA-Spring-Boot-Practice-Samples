package com.springboot.startupdatasetup;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanExampleBean implements InitializingBean {

	public final Logger logger = LoggerFactory.getLogger(InitializingBeanExampleBean.class);
 
    @Autowired
    private Environment environment;
 
    @Override
    public void afterPropertiesSet() throws Exception {
    	logger.info("From InitializingBeanExampleBean ....... : ",Arrays.asList(environment.getDefaultProfiles()));
    }
}