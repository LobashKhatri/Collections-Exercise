import java.util.LinkedList;

public class RemoveSpecifiedNumberFromList {
		public static void main(String[] args) {
			System.out.println("<<<Linked List>>>");
			
			LinkedList<Integer> lk= new LinkedList<>();
			lk.add(4);
			lk.add(1);
			lk.add(6);
			lk.add(7);
			lk.add(4);
			
			for (int i = 0; i < lk.size(); i++) {
				if (lk.get(i)==6) {
					lk.remove(i);
				}
			}
			System.out.println(lk);
		}
	}