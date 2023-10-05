package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet() {}
	
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	public void clear() {
		set.clear();
	}
	
	public int length() {
		return set.size();
	}
	
	public boolean equals(Object o) {
		if(o instanceof IntegerSet) {
			IntegerSet b = (IntegerSet)o;
			
			if(b.length() != this.length())
				return false;
			
			for(int i=0; i<set.size(); i++) {
				if(!(b.contains(set.get(i)))) {
					return false;
				}
			}
			
			return true;
		}
		return false;
	}
	
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	public int largest() throws IntegerSetException {
		if(set.isEmpty()) {
			throw new IntegerSetException("Empty set");
		}
		int largest = set.get(0);
		for(int i=1; i<set.size(); i++) {
			if(set.get(i) > largest)
				largest = set.get(i);
		}
		
		return largest;
	}
	
	public int smallest() throws IntegerSetException {
		if(set.isEmpty()) {
			throw new IntegerSetException("Empty set");
		}
		int smallest = set.get(0);
		for(int i=1; i<set.size(); i++) {
			if(set.get(i) < smallest)
				smallest = set.get(i);
		}
		
		return smallest;
	}
	
	public void add(int item) {
		if(!contains(item)) {
			set.add(item);
		}
	}
	
	public void remove(int item) {
		Integer temp = item;
		set.remove(temp);
	}
	
	public void union(IntegerSet intSetB) {
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			set.add(temp);
		}
	}
	
	public void intersect(IntegerSet intSetB) {
		List<Integer> newSet = new ArrayList<Integer>();
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		
		while(it.hasNext()) {
			temp = it.next();
			if(set.contains(temp))
				newSet.add(temp);
		}
		set = newSet;
	}
	
	public void diff(IntegerSet intSetB) {
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			set.remove(temp);
		}
	}
	
	public void complement(IntegerSet intSetB) {
		List<Integer> newSet = new ArrayList<Integer>();
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			if(!set.contains(temp))
				newSet.add(temp);
		}
		set = newSet;
	}
	
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	public String toString() {
		if(set.isEmpty()) {
			return "{Empty}";
		}
		
		String s = "{" + set.get(0).toString();
		for(int i = 1; i < set.size(); i++) {
			s = s + ", " + set.get(i).toString();
		}
		
		s = s + "}";
		return s;
		
	}
	
	public Iterator<Integer> iterator() {
		return set.iterator();
	}
}
