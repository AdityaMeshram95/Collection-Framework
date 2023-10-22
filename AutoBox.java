package Collections;

public class AutoBox {
	// Main method
	public static void main(String[] args) {
		
		Integer intObj = 1;
		int intPrimitive = 2;
		
		Integer tempInteger;
		int tempPrimitive;
		
		tempInteger = intPrimitive;
		tempPrimitive = intObj.intValue();
		
		tempInteger = intPrimitive; //Auto Box
		System.out.println(tempInteger);
		
		tempPrimitive = intObj; //Auto Unbox.
		System.out.println(tempPrimitive);
	}
}