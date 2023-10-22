package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	// Main Method
	public static void main(String[] args) {
		
		//Create a HashSet list that implements set interface.
		Set<String> HS  = new HashSet<>();
		
		// Pass values
		HS.add("one");
		HS.add("two");
		HS.add("three");
		HS.add("three");
		
		for(String item : HS) {
			System.out.println("Items: "+ item);
		}
	}
}