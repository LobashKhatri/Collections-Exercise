//Write a Java program to clone a tree set list to another tree set.

import java.util.TreeSet;

public class CloneTreeSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("TreeSet");
		
		TreeSet<Integer> tSet= new TreeSet<>();
		tSet.add(9);
		tSet.add(4);
		tSet.add(7);
		tSet.add(6);
		tSet.add(1);
		tSet.add(3);
		tSet.add(1);
		tSet.add(7);
		
		TreeSet<Integer> tSet2= (TreeSet<Integer>) tSet.clone();
		
		System.out.println("First "+ tSet);
		System.out.println("Second "+ tSet2);

	}

}
