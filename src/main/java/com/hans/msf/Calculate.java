package com.hans.msf;

public class Calculate {

	private Adder adder;
	private Subtractor subtractor;
	
	public void addAndPrint(int a, int b) {
		adder = new Adder();
		int sum = adder.add(a, b);
		System.out.println("Sum : " + sum);
	}
	
	public void subtractAndPrint(int a, int b) {
		subtractor = new Subtractor();
		int sub = subtractor.subtract(a, b);
		System.out.println("Sub :: " + sub);
	}
	
	
}
