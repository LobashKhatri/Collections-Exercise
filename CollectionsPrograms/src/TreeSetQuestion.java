//Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;

public class TreeSetQuestion {

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
		
		System.out.println("tree= "+tSet);
		System.out.println(tSet.first());
		System.out.println(tSet.last());

	}

}
