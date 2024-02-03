import java.util.ArrayList;

public class AddElementAtFirstInArrayList {
	public static void main(String[] args) {
		System.out.println("<<<Linked List>>>");
		
		ArrayList<Integer> lk= new ArrayList<>();
		lk.add(4);
		lk.add(1);
		lk.add(6);
		lk.add(7);
		lk.add(4);
		
		lk.add(0, 5);
		System.out.println(lk);
		
		
	}

}

