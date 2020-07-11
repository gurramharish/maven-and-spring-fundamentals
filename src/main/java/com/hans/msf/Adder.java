package com.hans.msf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
public class Adder {
	
	public int sum = 0;

	@Autowired
	@Qualifier("harishProducer")
	private IMSFProducer producer;
	
	public int add(int a, int b) {
		System.out.println("ADDD ::: " + producer.produceRandomString());
		return a + b;
	}
	
	public static void sayHello() {
		System.out.println("Hello!!");
	}

}
