package Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	// Main method
	public static void main(String[] args) {
		
		//Create a TreeMap that implements Map interface
		Map <Integer, String> partList = new TreeMap<>();
		
		// Pass values
		partList.put(001, "Blue Polo Shirt");
		partList.put(002, "Black Polo Shirt");
		partList.put(006, "Duke Hat");
		
		partList.put(002, "Black T-Shirt"); /*if we put double values then it will overwrite, here double values
		 										not allowed based on "key" and not "values" here 002 is repeated
		 										twice so this values will get Overwrite.*/
		
		Set<Integer> keys = partList.keySet(); /*Map interface is also included in collections but it is not 
		 									connected with any collection interface as shown in Tree diagram.
		 									so we have to use set interface here giving the taking values from 
		 									partList which is an object of TreeMap*/
		
		System.out.println("===Part List===");
		for(Integer key : keys) {
			System.out.println("Part#: " + key + " " + partList.get(key));
		}
	}
}