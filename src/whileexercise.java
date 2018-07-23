/* Write Java program to prompt the user to choose the correct answer from a list of answer choices of a question.

The user can choose to continue answering the question or stop answering it. See the example below:

What is the command keyword to exit a loop in Java?

 int
 continue
 break
 exit
Enter your choice: 'b'

Incorrect!

Again? press y to continue:
*/


import java.io.*;
public class whileexercise
{
public static void main(String[] args)
{
selectChoice();
}
static void selectChoice(){
String choice;
String con;
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("What is the command keyword to exit a loop in Java?");
System.out.println("a.quit");
System.out.println("b.continue");
System.out.println("c.break");
System.out.println("d.exit");
do {
System.out.print("Enter your choice:");
choice =br.readLine();
if (choice.compareTo("c")==0) {
System.out.println("Congratulation!");
}
else if (choice.compareTo("q")==0 || choice.compareTo("e")==0) {  System.out.println("Exiting...!"); break; }
else System.out.println("Incorrect!");
System.out.print("Again? press y to continue:");
con =br.readLine();
} while (con.compareTo("y")==0);
}catch(IOException e){}
  }
}
