
public class Bank {
	
	public static void main(String[] args) {
		int dollar = 500;
		System.out.println("dollar before assignment: " + dollar);
		dollar = 600;
		System.out.println("dollar after assignment: " + dollar);
		
		final double $rate = 61.5;
		System.out.println("rate is: " + $rate);
		
//		final variable can not be reassigned and it gives an error
//		$rate = 65;
	}

}
