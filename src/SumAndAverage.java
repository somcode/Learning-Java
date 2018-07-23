/* Write a program called <strong>SumAndAverage</strong> to produce the sum of 1, 2, 3, ..., to 100.
 *  Also compute and display the average. 
 * The output shall look like:

The sum is 5050
The average is 50.
**/

public class SumAndAverage {   // Save as "SumAndAverage.java"
   public static void main (String[] args) {
      int sum = 0;          // Store the accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;   // The lowerbound to sum
      int upperbound = 10; // The upperbound to sum
      int count = 0;
 
      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;     // same as "sum = sum + number"
         count++;
      }
      // Compute average in double. Beware that int/int produces int.
        average = sum/count;
      // Print sum and average.
        System.out.print("The sum is: " + sum);
        System.out.print("\n");
        System.out.print("the average is: " + average);
   }
}
