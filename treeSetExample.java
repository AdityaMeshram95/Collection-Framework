package Collections;

import java.util.Set;
import java.util.TreeSet;

public class treeSetExample {
	// Main method
	public static void main(String[] args) {
		// Create a TreeSet list that implements Set interface.
		Set<String> set = new TreeSet<>(); 
		
		// Pass Value.
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("three"); /*Here we set "three" 2 times which is not allowed in set interface ( duplicates are
		 					not allowed*/
		
		for(String item : set) {
			System.out.println("Item: "+ item);
		}
	}
}