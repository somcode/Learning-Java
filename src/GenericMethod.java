
public class GenericMethod {
	
	//Generic method printArray
	public static <E> void printArray(E[] inputArray) {
		
		//Display array elements
		for(E element: inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Create Array of Integer, Double and Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("Integer Array contains: ");
		printArray(intArray);
		
		System.out.println("double Array contains: ");
		printArray(doubleArray);
		
		System.out.println("Character Array contains: ");
		printArray(charArray);
	}

}
