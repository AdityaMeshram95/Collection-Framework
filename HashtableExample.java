package Collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableExample { // It is Synchronized
	// Main method 
	public static void main(String[] args) {
		
		// create an object of implemented class of interface MAP using Generic method of object creation.
		Map<Integer, String> partList = new Hashtable<>();
		
		//Pass values
		partList.put(002, "Black Shirt");
		partList.put(001, "Blue Shirt");
		partList.put(003, "White Shirt");
		partList.put(002, "Blue Pant"); // this will get overWrite since the key is repeated twice (002).
		
		/*Pass all the elements from map to set interface since map is not connected with any of the collection
		 * so here we will pass all the elements from object(partList) using method keySet*/
		Set<Integer> keys = partList.keySet();
		
		// Printing the values.
		System.out.println("===Part List===");
		for(Integer key : keys) {
			System.out.println("Part#: " + key + " " + partList.get(key));
		}
	}
}

//NOTE : Hastable returns the Output in Descending order according to its key number.