
public class methodparam {
	
	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		int c = minFunction(a,b); 
		System.out.print("Minimum value is: " + c);
		}
	
	// return the minimun of two numbers
	public static int minFunction(int n1, int n2) {
		int min;
		if(n1 > n2) 
			min = n2;
		else
			min = n1;
		
		return min;
	}

}
