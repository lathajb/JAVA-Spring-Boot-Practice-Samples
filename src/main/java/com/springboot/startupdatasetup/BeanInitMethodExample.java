package com.springboot.startupdatasetup;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class BeanInitMethodExample {
	
	private static final Logger LOG = LoggerFactory.getLogger(BeanInitMethodExample.class);
	 
    @Autowired
    private Environment environment;
 
    public void latha() {
        LOG.info("From Bean initMethod attribute value.................... : init"+ Arrays.asList(environment.getDefaultProfiles()));
    }

}
