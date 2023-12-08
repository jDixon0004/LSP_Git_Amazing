package org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

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
		
	}
	
	@Test
	@DisplayName("Test case for loggerInstances")
	public void testLoggerInstances() {
		Logger logger2 = Logger.getInstance();
		assertequals(logger, logger2);
	}
}
