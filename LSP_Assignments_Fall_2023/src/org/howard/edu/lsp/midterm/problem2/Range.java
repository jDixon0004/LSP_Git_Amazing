package org.howard.edu.lsp.midterm.problem2;

public class Range {
	private int start;
	private int end;
	
	public Range(int start, int end) {
		// *** NOTE: RANGE IS INCLUSIVE OF GIVEN VALUES (WAS NOT SPECIFIED IN INTRUCTIONS ***
		// *** E.G.: Range(0,5) creates a range including 0,1,2,3,4, and 5 ***
		this.start = start;
		this.end = end;
	}
	
	public boolean isValuesInRange(int value) {
		return value >= this.start && value <= this.end;
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		if(otherRange.start >= this.start && otherRange.start <= this.end)
			return true;
		else if(otherRange.end >= this.start && otherRange.end <= this.end)
			return true;
		
		return false;
	}
	
	public int size() {
		return this.end - this.start + 1;
	}
}
