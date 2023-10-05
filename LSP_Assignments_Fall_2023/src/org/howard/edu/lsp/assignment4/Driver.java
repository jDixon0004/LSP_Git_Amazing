package org.howard.edu.lsp.assignment4;

public class Driver {
	public static void main(String[] args) {
		try {
			IntegerSet set1 = new IntegerSet();
			set1.add(1);
			set1.add(2);
			set1.add(3);
			
			
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Smallest Value in Set1 is: " + set1.smallest());
			System.out.println("Largest Value in Set1 is: " + set1.largest());
			
			IntegerSet set2 = new IntegerSet();
			set2.add(4);
			set2.add(5);
			
			System.out.println("\nUnion of Set1 and Set 2");
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			set1.union(set2);
			System.out.println("Result of union of Set1 and Set 2");
			System.out.println(set1.toString());
			
			System.out.println("\nDifference of Set1 and Set 2");
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			set1.diff(set2);
			System.out.println("Result of difference of Set1 and Set 2");
			System.out.println(set1.toString());
			
			System.out.println("\nComplement of Set1 and Set 2");
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			set1.complement(set2);
			System.out.println("Result of complement of Set1 and Set 2");
			System.out.println(set1.toString());
			
			set1.add(1);
			set1.add(2);
			set1.add(3);
			System.out.println("\nValue of Set1 is: " + set1.toString());
			
			System.out.println("\nClear Set2");
			set2.clear();
			System.out.println("Value of Set2 is: " + set2.toString());
			System.out.println("Value of Set2.isEmpty(): " + set2.isEmpty());
			
			set2.add(1);
			set2.add(2);
			set2.add(4);
			set2.add(7);
			set2.add(8);
			set2.add(9);
			System.out.println("\nValue of Set2 is: " + set2.toString());
			System.out.println("Value of Set2.isEmpty(): " + set2.isEmpty());
			System.out.println("Value of Set2.length(): " + set2.length());
			
			System.out.println("\nIntersect of Set1 and Set 2");
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			set1.intersect(set2);
			System.out.println("Result of intersect of Set1 and Set 2");
			System.out.println(set1.toString());
			
			System.out.println("\nValue of Set1.equals(Set2): " + set1.equals(set2));
			set1.clear();
			set2.clear();
			System.out.println("\nValue of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			System.out.println("Value of Set1.equals(Set2): " + set1.equals(set2));
			
			set1.add(1);
			set1.add(2);
			set1.add(3);
			
			set2.add(1);
			set2.add(2);
			set2.add(3);
			
			System.out.println("\nValue of Set1 is: " + set1.toString());
			System.out.println("Value of Set2 is: " + set2.toString());
			System.out.println("Value of Set1.equals(Set2): " + set1.equals(set2));
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
