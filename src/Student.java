
class Student {
	int id;
	String name;
	
	// with parameter
	Student(int a, String b){
		id = a;
		name = b;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(111, "John");
		Student s2 = new Student(222, "Chris");
		
		s1.display();
		s2.display();
	}

}
