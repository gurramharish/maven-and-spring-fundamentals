package com.hans.msf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("springCalculate")
public class SpringCalculate {

	
	private Adder adder;
	private Subtractor subtractor;
	@Autowired
	private ApplicationContext applicationContext;
	private IMSFProducer imsfProducer;
	
	public void addAndPrint(int a, int b) {
		System.out.println("SPC:: " + adder);
		adder.sum = 10;
		if(a > 10) {
			imsfProducer = applicationContext.getBean("subtractProducer", IMSFProducer.class);
		} else {
			imsfProducer = applicationContext.getBean("harishProducer", IMSFProducer.class);
		}
		System.out.println(imsfProducer.produceRandomString());
		int sum = adder.add(a, b);
		System.out.println("Sum : " + sum);
		System.out.println("SPC adder sum :: " + adder.sum);
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
