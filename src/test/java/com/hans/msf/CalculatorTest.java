package com.hans.msf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	static Calculator calculator;
	
	@BeforeAll
	public static void setup() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Sum of two int numbers success case")
	public void sumIntSuccess() {
		assertEquals(9, calculator.sum(4, 5));
	}
	
	@Test
	@DisplayName("Sum of two Long numbers success case")
	public void sumLongSuccess() {
		assertEquals(9L, calculator.sum(4L, 5L));
	}
	
	@Test
	@DisplayName("Sum of two double numbers success case")
	public void sumDoubleSuccess() {
		assertEquals(10.0, calculator.sum(4.2, 5.8));
	}
	
	@Test
	@DisplayName("Multiple of two Long numbers success case")
	public void multipleLongSuccess() {
		assertEquals(20L, calculator.multiply(4L, 5L));
	}
	
	@Test
	@DisplayName("Multiple of two double numbers success case")
	public void multipleDoubleSuccess() {
		assertEquals(20.0, calculator.multiply(4.0, 5.0));
	}
}
