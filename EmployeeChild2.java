package Collections;

import java.util.Comparator;

public class EmployeeChild2 implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee e1, ComparatorEmployee e2) {
		int result = e1.getName().compareTo(e2.getName());
		/*Here as we know that getName() has a String return type and compare() method has a int return
		 * type which will give an error for that we have to use compareTo() method and change it to 
		 * int form. */
		
		if(result > 0) {
			return 1;
		}else if (result < 0) {
			return -1;
		}else {
			return 0;
		}
	}
}
