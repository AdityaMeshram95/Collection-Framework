package Collections;

/*We created a class and implemented the collection interface using generic method. This */
public class ComparableStudent implements Comparable<ComparableStudent>	 {
	// Instance variable
	private String name;
	private long id = 0;
	private double gpa = 0.0;
	
	// Constructor.
	public ComparableStudent(String name, long id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	// Getter method
	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(ComparableStudent s) {
		
		/*Here we created this override method to compare between names so that we can sort data using names
		 * since comparator collection interface sort the data only by string values and this method is and 
		 * abstract method inside comparator interface which we override here.*/
		int result = this.name.compareTo(s.getName());
		
		if(result > 0) {
			return 1;
		}else if(result < 0) {
			return -1;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Name: "+name+ "\nID: "+ id+ "\nGPA: "+ gpa+ "\n";
	} /*As we did sorting by using the overridden method compareTo the String values get converted 
	and return in one of these 1, -1, 0 so when we will print the output it will return the garbage
	value for that we have to change the output into String again by using another method toString.*/
}