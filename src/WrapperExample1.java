
public class WrapperExample1 {
	public static void main(String args[]) {
		
		// converting int to Integer
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j = a; // This is autoboxing and now the compiler will run Integer.valueOf(a) internally
		
		System.out.print(a + " " + i + " " + j);
	}

}
