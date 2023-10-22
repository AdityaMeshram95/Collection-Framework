package Collections;

import java.util.Comparator;

public class EmployeeChild1 implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee e1, ComparatorEmployee e2) {
		if(e1.getId() > e2.getId()) {
			return 1;
		}else if(e1.getId() < e2.getId()) {
			return -1;
		}else {
			return 0;
		}
	}
	/*Here we have to create an unimplemented overridden method coz comparator interface uses compare
	 * method which has a return type of int and since we are returning Id which is an numeric value we don't 
	 * have to use compareTo method in addition.*/
}
