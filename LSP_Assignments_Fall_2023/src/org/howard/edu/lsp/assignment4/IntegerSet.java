package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An implementation of the a set data structure containing only int elements stored as {@link java.lang.Integer} objects.
 * <p>
 * Implements the set union, intersect, difference, and complement operations, as well as other utility methods such as add, remove, 
 * clear, toString, etc.
 * @author Jaelen Dixon
 */
public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Constructs an empty IntegerSet.
	 */
	public IntegerSet() {}
	
	/**
	 * Constructs an IntegerSet containing the elements of the specified ArrayList. 
	 * <p>
	 * Duplicate elements found in the specified ArrayList will not be added to this IntegerSet (such that only one of the 
	 * duplicate elements is stored in the IntegerSet).
	 * @param set the ArrayList whose elements are placed into this list.
	 */
	public IntegerSet(ArrayList<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			this.set.add(it.next());
		}
	}
	
	/**
	 * Removes all of the elements from this IntegerSet. The IntegerSet will be empty after this method
	 * returns.
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Returns the number of elements in this IntegerSet.
	 * @return the number of elements in this IntegerSet
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Compares the specified object with this IntegerSet for equality. 
	 * <p>
	 * Returns true if the specified object is an IntegerSet and if this IntegerSet and the specified IntegerSet have the same elements.
	 * @param o an object to be compared to this IntegerSet
	 * @return true if the given object equals this IntegerSet
	 */
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
	
	/**
	 * Returns true if this IntegerSet contains the specified element.
	 * <p>
	 * More formally, returns true if and only if this list contains exactly one element e such that
	 * (o==null ? e==null : o.equals(e)).
	 * @param value the int value whose presence in this IntegerSet is to be tested.
	 * @return true if this list contains the specified element
	 */
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * Returns the largest int in this IntegerSet.
	 * @return the largest int in this IntegerSet
	 * @throws IntegerSetException - if this IntegerSet is empty
	 */
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
	
	/**
	 * Returns the smallest int in this IntegerSet.
	 * @return the smallest int in this IntegerSet
	 * @throws IntegerSetException - if this IntegerSet is empty
	 */
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
	
	/**
	 * Adds the given int to IntegerSet.
	 * <p>
	 * If the given int is already in IntegerSet, this function does nothing.
	 * 
	 * @param item an int to be added to this IntegerSet
	 */
	public void add(int item) {
		if(!contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Removes the given int from IntegerSet.
	 * <p>
	 * If the given int is not in IntegerSet, this function does nothing.
	 * 
	 * @param item an int to be removed from this IntegerSet
	 */
	public void remove(int item) {
		Integer temp = item;
		set.remove(temp);
	}
	
	/**
	 * Performs a set union operation on this IntegerSet and the passed IntegerSet intSetB.
	 * <p>
	 * Sets the new value of this IntegerSet to be the result of the union operation.
	 * @param intSetB the second IntegerSet to be used in the union operation
	 */
	public void union(IntegerSet intSetB) {
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			set.add(temp);
		}
	}
	
	/**
	 * Performs a set intersect operation on this IntegerSet and the passed IntegerSet intSetB.
	 * <p>
	 * Sets the new value of this IntegerSet to be the result of the intersect operation.
	 * @param intSetB the second IntegerSet to be used in the intersect operation
	 */
	public void intersect(IntegerSet intSetB) {
		List<Integer> newSet = new ArrayList<Integer>();
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		
		while(it.hasNext()) {
			temp = it.next();
			if(set.contains(temp) && !newSet.contains(temp))
				newSet.add(temp);
		}
		set = newSet;
	}
	
	/**
	 * Performs a set difference operation on this IntegerSet and the passed IntegerSet intSetB.
	 * <p>
	 * Sets the new value of this IntegerSet to be the result of the difference operation.
	 * @param intSetB the second IntegerSet to be used in the difference operation
	 */
	public void diff(IntegerSet intSetB) {
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			set.remove(temp);
		}
	}
	
	/**
	 * Performs a set complement operation this IntegerSet and the passed IntegerSet intSetB.
	 * <p>
	 * Sets the new value of this IntegerSet to be the result of the complement operation.
	 * @param intSetB the second IntegerSet to be used in the complement operation
	 */
	public void complement(IntegerSet intSetB) {
		List<Integer> newSet = new ArrayList<Integer>();
		Integer temp;
		Iterator<Integer> it = intSetB.iterator();
		while(it.hasNext()) {
			temp = it.next();
			if(!set.contains(temp) && !newSet.contains(temp))
				newSet.add(temp);
		}
		set = newSet;
	}
	
	/**
	 * Returns true if this IntegerSet contains no elements.
	 * @return true if this IntegerSet contains no elements
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * Returns a string representation of this collection.
	 * <p>
	 * The string representation consists of a list of the 
	 * collection's elements in the order they are returned by its iterator, enclosed in curly braces ("{}"). Adjacent 
	 * elements are separated by the character ", " (comma and space). Elements are converted to strings as by
	 * Integer.toString().
	 * 
	 * @return a representation of this IntegerSet
	 */
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
	
	/**
	 * Returns an iterator over the elements in this IntegerSet.
	 * @return an iterator over the elements in this IntegerSet
	 */
	public Iterator<Integer> iterator() {
		return set.iterator();
	}
}
