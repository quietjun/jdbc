package com.example.calculator;

import java.math.BigDecimal;

public class Calculator {
	public double addition(double a, double b) {
		return getBD(a).add(getBD(b)).doubleValue();
	}

	public double subtract(double a, double b) {
		return getBD(a).subtract(getBD(b)).doubleValue();
	}

	public double division(double a, double b) {
		return getBD(a).divide(getBD(b)).doubleValue();
	}

	public double multiply(double a, double b) {
		return getBD(a).multiply(getBD(b)).doubleValue();
	}
	
	public BigDecimal getBD(double d){
		return new BigDecimal(d+"");
	}
}
