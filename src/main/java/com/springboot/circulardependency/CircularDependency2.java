package com.springboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularDependency2 {

	private CircularDependency1 circA;
	 
    @Autowired
    public CircularDependency2(CircularDependency1 circA) {
        this.circA = circA;
    }
    
    public void setcircA(CircularDependency1 circA) {
    	this.circA =circA;
    }
	
}
