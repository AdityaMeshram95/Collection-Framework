package Collections;

public class ComparatorEmployee { // Parent class.
	//instance variable
	private int id;
	private String name;
	
	// Constructor
	public ComparatorEmployee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Getter method
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	/*Here we have to convert the output into String form since we use Comparator interface it has 
	 * to add an overridden method "compare" which has a return type if int and all the O/P become int
	 * which will result in garbage value as output for that we have to convert it into String form again 
	 * by using toString() method.*/
	@Override
	public String toString() {
		return "Id: "+ id + " Name: "+ name;
	}
}
