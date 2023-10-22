package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
	// main method
	public static void main(String[] args) {
		
		// call the concrete class that implements interface set, here we are going to use set interface.
		Set<ComparableStudent> studentList = new TreeSet<>();
		
		// Pass values.
		studentList.add(new ComparableStudent("Aditya", 1111, 8.18));
		studentList.add(new ComparableStudent("Aryan", 2222, 9.15));
		studentList.add(new ComparableStudent("Sunny", 3333, 6.18));
		
		// Extract data
		for(ComparableStudent student : studentList) {
			System.out.println(student);
		}
	}
}