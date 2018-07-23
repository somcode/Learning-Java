/* Write a program called <strong>CheckPassFail</strong> which prints "PASS" 
 * if the int variable "mark" is more than or equal to 50;
 * or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
 * 
 */
public class CheckPassFail {
	public static void main(String[] args) {
		int mark = 49;
		System.out.print("The mark is " + mark);
		System.out.print("\n");
		if(mark >= 50) {
			System.out.print("PASS");
		}else {
			System.out.print("FAIL");
		}
		System.out.print("\n");
		System.out.print("DONE");
	}

}
