package com.example.calculator;

import com.example.calculator.Calculator;

public class CalculatorTestNormal {

	Calculator calc = null;

	public CalculatorTestNormal() {
		this.calc = new Calculator();
	}

	public static void main(String[] args) {
		CalculatorTestNormal normal = new CalculatorTestNormal();
		normal.minusTest();
	}

	public void minusTest() {
		System.out.println(calc.subtract(2, 1));
	}
}
