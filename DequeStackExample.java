package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackExample {
	// Main method
	public static void main(String[] args) {
		
		// Create an concrete class that implemented interface Deque.
		Deque<String> stack = new ArrayDeque<>();
		
		// Pass values.
		stack.push("One");
		stack.push("two");
		stack.push("three");
		
		// Extracting values.
		int size = stack.size(); /*Here we have to call the method size to know the size of the stack so that we 
		 							can call the data by index value like we did in Array.*/
		while(size > 0) {
			System.out.println(stack.pop());
			size--;
		}
	}
}