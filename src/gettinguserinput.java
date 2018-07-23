import java.util.Scanner;
public class gettinguserinput {
	public static void main(String[] args) {
		//create scanner object 
		Scanner input = new Scanner(System.in);
		
		// Output
		System.out.print("Enter a floating point vlus please: ");
		
		//Wait for the user to input something
		double value = input.nextDouble();
		
		//Tell the user what was entered
		System.out.print("You entered: " + value);
		
	}

}
 
