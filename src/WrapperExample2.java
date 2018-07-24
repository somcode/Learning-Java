
public class WrapperExample2 {
	
	public static void main(String[] args) {
		
		//converting Integer into int
		Integer a = new Integer(3);
		int i = a.intValue();
		int j = a;  //this is unboxing now compiler will run a.intValue() internally.
		
		System.out.print(a + " " + i + " " + j);
		
	}

}
