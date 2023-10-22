package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample { // It is non Synchronized.
	//Main method
	public static void main(String[] args) {
		
		//Create an object of implemented class of Map interface using Generic method of object creation.
		Map<Integer, String> partList = new HashMap<>();
		
		// Pass values.
		partList.put(002, "Black Shirt");
		partList.put(003, "Blue Pant");
		partList.put(001, null); // HashMap can accept null values
		partList.put(null, null);
		partList.put(005, "White Shirt");
		
		/*We have to pass all the elements from map into set interface since map is not connected 
		 * with collection*/
		Set<Integer> keys = partList.keySet();
		
		// Printing the values.
		System.out.println("===Part List===");
		for(Integer key : keys) {
			System.out.println("Part#: " + key + " " + partList.get(key));
		}
	}
}

// NOTE: HashMap returns the Output in ascending order.