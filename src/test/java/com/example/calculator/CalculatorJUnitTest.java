package com.example.calculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;

import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorJUnitTest {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void subtractTest() {
		assertThat(calc.subtract(2, 1), is(1.0));
		assertThat(calc.subtract(2.0, 1.1), is(0.9));
	}

	@Test
	public void additionTest() {
		assertThat(calc.addition(2, -1), is(1.0));
		assertThat(calc.addition(2.0, -1.1), is(0.9));
	}

	@Test
	public void multiplyTest() {
		assertThat(calc.multiply(2, -1), is(-2.0));
		assertThat(calc.multiply(2.0, -1.1), is(-2.2));
	}
	@Test(expected=ArithmeticException.class)
	public void divideTest() {
		assertThat(calc.division(2.0, 0), is(0));
	}
}
