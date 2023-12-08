package org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogger {
	private Logger logger;
	
	@BeforeEach
	public void setUp() {
		logger = Logger.getInstance();
	}
	
	@Test
	@DisplayName("Test case for displayLog")
	public void testDisplayLog() {
		logger.logMessage("Hello World!");
		assertEquals(logger.displayLog(), ("Log:\n" + "Hello World!\n"));
	}
	
	@Test
	@DisplayName("Test case for loggerInstances")
	public void testLoggerInstances() {
		Logger logger2 = Logger.getInstance();
		assertEquals(logger, logger2);
	}
}
