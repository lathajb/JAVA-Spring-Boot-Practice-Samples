package com.springboot.circulardependency;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

    @Configuration
	public class CircularDependency1 {
	 
    	
	    private CircularDependency2 circB;
	 
	    @Autowired
    	public void setCircularDependency2(CircularDependency2 circB) {
    	  this.circB = circB;	
    	}
	    
	    @PostConstruct
	    public void init() {
	        circB.setcircA(this);
	    }
	    
//	    public CircularDependency1( CircularDependency2 circB) {
//	        this.circB = circB;
//	    }
	}

