package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet set1;
	private IntegerSet set2;
	
	@BeforeEach
	public void setUp() {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
		
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(10);
		set1.add(12);
		set1.add(14);
		set1.add(16);
		set1.add(18);
		set1.add(20);
		
		set2.add(3);
		set2.add(6);
		set2.add(8);
		set2.add(12);
		set2.add(15);
		set2.add(18);
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
			
	}

	@Test
	@DisplayName("Test case for ***")
	public void testEquals() {
		
	}

	@Test
	@DisplayName("Test case for equals")
	public void testContains() {
		
	}

	@Test
	@DisplayName("Test case for largest")
	public void testLargest() {
		
	}

	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() {
		
	}

	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		
	}

	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		
	}

	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		
	}

	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		
	}

	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		
	}

	@Test
	@DisplayName("Test case for complement")
	public void testComplement() {
		
	}

	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		
	}

	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		
	}

	@Test
	@DisplayName("Test case for iterator")
	public void testIterator() {
		
	}
}
