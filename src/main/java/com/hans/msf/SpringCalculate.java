package com.hans.msf;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringCalculate {

	
	private Adder adder;
	private Subtractor subtractor;
	
	public void addAndPrint(int a, int b) {
		int sum = adder.add(a, b);
		System.out.println("Sum : " + sum);
	}
	
	public void subtractAndPrint(int a, int b) {
		int sub = subtractor.subtract(a, b);
		System.out.println("Sub :: " + sub);
	}

	@Autowired
	public void setAdder(Adder adder) {
		this.adder = adder;
	}

	@Autowired
	public void setSubtractor(Subtractor subtractor) {
		this.subtractor = subtractor;
	}
	
	
}
