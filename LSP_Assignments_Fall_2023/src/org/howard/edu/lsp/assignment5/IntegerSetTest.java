package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet set1;
	private IntegerSet set2;
	private IntegerSet set3;
	private IntegerSet set4;
	private IntegerSet set5;
	
	@BeforeEach
	public void setUp() {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
		set3 = new IntegerSet();
		set4 = new IntegerSet();
		set5 = new IntegerSet();
		
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
		set2.add(9);
		set2.add(12);
		set2.add(15);
		set2.add(18);
		
		set3.add(3);
		set3.add(6);
		set3.add(9);
		set3.add(12);
		set3.add(15);
		set3.add(18);
		
		set4.add(21);
		set4.add(22);
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		// Test with populated set
		set1.clear();
		assertEquals(set1, new IntegerSet());
		
		// Test with empty set
		set1.clear();
		assertEquals(set1, new IntegerSet());
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		// Test with populated set
		assertEquals(set1.length(), 10);
		
		// Test with empty set
		set1.clear();
		assertEquals(set1.length(), 0);
	}

	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		// Test with sets with all the same values
		assertEquals(set2.equals(set3), true);
		
		// Test with sets with some of the same values
		assertEquals(set1.equals(set2), false);
		
		// Test with sets with none of the same values
		assertEquals(set1.equals(set4), false);
		
		// Test with an empty set
		assertEquals(set1.equals(set5), false);
		
		// Test with two empty sets
		assertEquals(set5.equals((new IntegerSet())), true);
		
		// Test with the same set
		assertEquals(set1.equals(set1), true);
		
	}

	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		// Test with set containing the value
		assertEquals(set1.contains(8), true);
		
		// Test with empty set
		assertEquals(set5.contains(8), false);
		
		// Test with populated set not containing the value
		assertEquals(set1.contains(3), false);
	}

	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		// Test with populated set
		assertEquals(set1.largest(), 20);
		
		// Test with empty set
		Throwable exception = assertThrows(IntegerSetException.class, () -> set5.largest());
		assertEquals(exception.getMessage(), "Empty set");
		assertNotNull(exception.getMessage());
	}

	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		// Test with populated set
		assertEquals(set1.smallest(), 2);
		
		// Test with empty set
		Throwable exception = assertThrows(IntegerSetException.class, () -> set5.smallest());
		assertEquals(exception.getMessage(), "Empty set");
		assertNotNull(exception.getMessage());
	}

	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		// Test adding non-duplicate
		int length = set1.length();
		Integer[] temp = {2,4,6,8,10,12,14,16,18,20,22};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		set1.add(22);
		assertEquals(set1.contains(22), true);
		assertEquals(set1.length(), length+1);
		assertEquals(set1.equals(expected), true);
		
		// Test adding duplicate
		String toString = set1.toString();
		set1.add(2);
		assertEquals(set1.length(), length+1);
		assertEquals(set1.toString(), toString);
		assertEquals(set1.equals(expected), true);
	}

	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		int length = set1.length();
		Integer[] temp = {4,6,8,10,12,14,16,18,20};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		// Test removing item contained in set
		set1.remove(2);
		assertEquals(set1.contains(2), false);
		assertEquals(set1.length(), length-1);
		assertEquals(set1.equals(expected), true);
		
		// Test removing item not contained in set
		String toString = set1.toString();
		set1.remove(22);
		assertEquals(set1.length(), length-1);
		assertEquals(set1.toString(), toString);
		assertEquals(set1.equals(expected), true);
	}

	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		Integer[] temp = {2,3,4,6,8,9,10,12,14,15,16,18,20};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		// Test with two populated sets
		set1.union(set2);
		assertEquals(set1.equals(expected), true);
		
		Integer[] temp2 = {21,22};
		ArrayList<Integer> tempList2 = new ArrayList<Integer>(Arrays.asList(temp2));
		IntegerSet expected2 = new IntegerSet(tempList2);
		
		// Test with empty set
		set4.union(set5);
		assertEquals(set4.equals(expected2), true);
	}

	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		Integer[] temp = {6,12,18};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		// Test with two populated sets
		set1.intersect(set2);
		assertEquals(set1.equals(expected), true);
		
		IntegerSet expected2 = new IntegerSet();
		
		// Test with empty set
		set4.intersect(set5);
		assertEquals(set4.equals(expected2), true);
	}

	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		Integer[] temp = {2,4,8,10,14,16,20};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		// Test with two populated sets
		set1.diff(set2);
		assertEquals(set1.equals(expected), true);
		
		Integer[] temp2 = {21,22};
		ArrayList<Integer> tempList2 = new ArrayList<Integer>(Arrays.asList(temp2));
		IntegerSet expected2 = new IntegerSet(tempList2);
		
		// Test with empty set
		set4.diff(set5);
		System.out.println("Diff: " + set4);
		assertEquals(set4.equals(expected2), true);
	}

	@Test
	@DisplayName("Test case for complement")
	public void testComplement() {
		Integer[] temp = {3,9,15};
		ArrayList<Integer> tempList = new ArrayList<Integer>(Arrays.asList(temp));
		IntegerSet expected = new IntegerSet(tempList);
		
		// Test with two populated sets
		set1.complement(set2);
		assertEquals(set1.equals(expected), true);
		
		IntegerSet expected2 = new IntegerSet();
		
		// Test with empty set
		set4.complement(set5);
		assertEquals(set4.equals(expected2), true);
	}

	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		// Test with populated set
		assertEquals(set1.isEmpty(), false);
		
		//Test with empty set
		assertEquals(set5.isEmpty(), true);
	}

	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		// Test with populated set
		assertEquals(set1.toString(), "{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}");
		
		//Test with empty set
		assertEquals(set5.toString(), "{Empty}");
	}

	/*@Test
	@DisplayName("Test case for iterator")
	public void testIterator() {
		
	}*/
}
