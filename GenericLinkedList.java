package Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class GenericLinkedList {
	// Main method
	public static void main(String[] args) {
		// Here we will create ArrayList
		List<Integer> partList = new LinkedList<>(); // ArrayList is the implement of List (interface) 
		
		// Adding objects inside List.
		partList.add(1111);
		partList.add(2222);
		partList.add(3333);
		//partList.add("Bad Data"); <<-- This will show compiler error.
		
		/* Here (.add) is a function which will add all the objects carrying values and add them to the list (partList)
		 * which is an reference variable of List ( as we know that List is the predefine interface for doing
		 * collections and ArrayList is the sub part of that interface so we had given the reference of ArrayList 
		 * (Sub) to List(interface)
		 * in the last line we added a String "Bad Data" which proves that a collection is an single object design 
		 * to manages groups of objects */
		
		/* Iterator : it is the biggest collection interface (Fundamental interface) inside Java.
		it provides a standardized way to iterate over elements regardless of specific type of collection is
		being used.*/
		Iterator<Integer> elements = partList.iterator();
		
		while(elements.hasNext()) {
			//AutoBox and UnBox
			Integer partNumberObject = elements.next(); // autoBoxing
			int partNumber = partNumberObject.intValue(); //unBoxing
			
			System.out.println("Part number: "+ partNumber); 
		}
	}
}