package com.hans.msf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringCalculate springCalculate = appContext.getBean("springCalculate", SpringCalculate.class);
		Adder adder = appContext.getBean("adder", Adder.class);
		
		springCalculate.addAndPrint(9, 300);
		springCalculate.subtractAndPrint(233, 122);
		System.out.println("Main:: " + adder);
		System.out.println("Adder data:: " + adder.sum);
	}
}
