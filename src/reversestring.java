/* Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String. The output shall look like:
 * Enter a String: abcdef
The reverse of the String "abcdef" is "fedcba".
 * 
 */

import java.util.Scanner;
public class reversestring {
	public static void main(String[] args) {
		String inStr;  //input string
		int inStrLen;  // length of the input string
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next();  // use next() to read a String
		inStrLen = inStr.length();
		
		// Use inStr.charAt(index) in a loop to extract character at "index" from inStr
		// The String's index begins at 0 from the left.
		for (int i = inStrLen - 1; i >= 0; --i) {  // Process the String from the right
		   System.out.print(inStr.charAt(i));
		}
	}

}


/*Note: For a String called inStr, you can use inStr.length() to get the length of the String; and inStr.charAt(index) to retrieve the char at the index position, where index begins with 0.
 * */



