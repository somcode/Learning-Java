
class Mytostringdemo {
	
	int rollno;
	String name;
	String city;
	
	Mytostringdemo(int rollno, String name, String city){
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return rollno + " " + name + " " + city;
	}
	
	public static void main(String[] args) {
		Mytostringdemo s1 = new Mytostringdemo(101, "John", "Chicago");
		Mytostringdemo s2 = new Mytostringdemo(102, "Chris", "Florida");
		
		System.out.println(s1.toString());
		System.out.println(s2);
		
	}

}
