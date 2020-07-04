package com.hans.msf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringCalculate springCalculate = appContext.getBean("springCalculate", SpringCalculate.class);
		springCalculate.addAndPrint(200, 300);
		springCalculate.subtractAndPrint(233, 122);
	}
}
