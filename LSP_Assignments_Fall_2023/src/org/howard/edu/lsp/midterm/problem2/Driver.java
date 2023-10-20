package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String[] args) {
		Range range1 = new Range(5, 10);
		Range range2 = new Range(8, 15);
		Range range3 = new Range(16, 20);
		
		int testValue = 7;
		System.out.println(testValue + " is in range1: " + range1.isValuesInRange(testValue));
		System.out.println(testValue + " is in range2: " + range2.isValuesInRange(testValue));
		System.out.println(testValue + " is in range3: " + range3.isValuesInRange(testValue));
		
		System.out.println("range1 and range2 overlap: " + range1.doRangesOverlap(range2));
		System.out.println("range2 and range1 overlap: " + range2.doRangesOverlap(range1));
		System.out.println("range2 and range3 overlap: " + range2.doRangesOverlap(range3));
		System.out.println("range3 and range2 overlap: " + range3.doRangesOverlap(range2));
		
		System.out.println("Size of range1: " + range1.size());
		System.out.println("Size of range2: " + range2.size());
		System.out.println("Size of range3: " + range3.size());
	}
}
