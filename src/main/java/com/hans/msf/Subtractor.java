package com.hans.msf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Subtractor {
	
	@Autowired
	private IMSFProducer subtractProducer; 

	public int subtract(int a, int b) {
		System.out.println("Subbb :: " + subtractProducer.produceRandomString());
		return a - b;
	}
}
