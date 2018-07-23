
public class Student2 {
	
	// static variable
	int id;
	String name;
	static String college = "UWM";
	
	Student2(int a, String b){
		id = a;
		name = b;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + college);
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(111, "John");
		Student2 s2 = new Student2(222, "Chris");
		
		s1.display();
		s2.display();
		
	}

}
