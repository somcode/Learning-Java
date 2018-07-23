
interface MyInterface {
	public void method1();
	public void method2();
}

class XYZ implements MyInterface {
	public void method1() {
		System.out.print("Implementation of method 1");
	}
	
	public void method2() {
		System.out.print("Implementation of method 2");	
	}
	
	public static void main(String[] args) {
		MyInterface obj = new XYZ();
		obj.method1();
	}
}