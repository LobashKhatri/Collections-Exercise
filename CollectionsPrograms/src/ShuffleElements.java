import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {

	public static void main(String[] args) {
		System.out.println("Shuffling");
		
		ArrayList<Integer> aList=  new ArrayList<>();
		
		aList.add(5);
		aList.add(4);
		aList.add(1);
		aList.add(7);
		aList.add(3);
		aList.add(5);
		
		System.out.println("Without Shufflig= "+aList);
		Collections.shuffle(aList);
		System.out.println("After Shufflig=   "+aList);
		
		
	}

}
