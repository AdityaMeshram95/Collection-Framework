package Collections;

import java.util.*;

public class TestComparatorEmployee {
	// Main method
	public static void main(String[] args) {
		
		List<ComparatorEmployee> ce = new LinkedList<>();
		Comparator<ComparatorEmployee> id = new EmployeeChild1();
		Comparator<ComparatorEmployee> name = new EmployeeChild2();
		
		ce.add(new ComparatorEmployee(2, "Aditya"));
		ce.add(new ComparatorEmployee(1, "Zoro"));
		ce.add(new ComparatorEmployee(3, "Luffy"));
		ce.add(new ComparatorEmployee(4, "Sanji"));
		
		// Extracting data
		System.out.println("===Sort Name===");
		Collections.sort(ce, name);
		for(ComparatorEmployee s1 : ce) {
			System.out.println(s1);
		}
		
		System.out.println("===Sort Id===");
		Collections.sort(ce, id);
		for(ComparatorEmployee s2 : ce) {
			System.out.println(s2);
		}
	}
}
