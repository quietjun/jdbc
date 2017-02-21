package com.example.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

	public static void main(String[] args) {
		logger.trace("trace level");
		logger.debug("debug level");
		logger.info("info level");
		logger.warn("warning level");
		logger.error("error level");
	}
}
