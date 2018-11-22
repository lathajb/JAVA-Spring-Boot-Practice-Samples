package com.springboot.startupdatasetup;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class LogicInConstructorExampleBean {
 
    private static final Logger LOG 
      = LoggerFactory.getLogger(LogicInConstructorExampleBean.class);
 
    private final Environment environment;
 
    @Autowired
    public LogicInConstructorExampleBean(Environment environment) {
        this.environment = environment;
        LOG.info("Using contructor Injection :.........................",Arrays.asList(environment.getDefaultProfiles()));
    }
}