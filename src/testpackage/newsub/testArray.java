package testpackage.newsub;

public class testArray {
	public static void main(String[] args) {
		double[] myList = { 1.9, 3.5, 6.8, 7.2 };
		
		// print all the array elements
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
		}
		
		//summing of all elements
		double sum = 0;
		for(int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		System.out.print("Sum is: " + sum);
	}

}
