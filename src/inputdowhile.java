import java.util.Scanner;
public class inputdowhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = 0;
		do {
			System.out.print("Enter a number: ");
			value = input.nextInt();

		}while(value != 5);
		System.out.print("Got 5!");
	}
}

