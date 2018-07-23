class Person{
	String name;
	int age;
	
	void speaking() {
		System.out.println("My name is: " + name);
	}
	
	int calculateToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class getter{
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "John";
		person1.age = 31;
		
		person1.speaking();
		
		int years = person1.calculateToRetirement();
		System.out.println("Years till retirement: " + years);
		
		int age = person1.getAge();
		System.out.println("Age is: " + age);
		
		String name = person1.getName();
		System.out.println("Name is: " + name);
	}
}