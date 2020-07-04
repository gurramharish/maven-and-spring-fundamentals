package com.hans.msf;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	
	@Bean(name="adder")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON)
	public Adder getAdder() {
		return new Adder();
	}
	
	@Bean(name="subtractor")
	public Subtractor getSubtractor() {
		return new Subtractor();
	}
	
	@Bean(name="springCalculate")
	public SpringCalculate getSpringCalculate() {
		return new SpringCalculate();
	}
}
