
public class EncapsulationDemo {
	private int empSSN;
	private String empName;
	private int empAge;
	
	//Getter and Setter methods
	
	public int getEmpSSN() {
		return empSSN;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpSSN(int newValue) {
		empSSN = newValue;
	}
	
	public void setEmpNmae(String newValue) {
		empName = newValue;
	}
	
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpSSN(234);
		obj.setEmpNmae("John");
		obj.setEmpAge(23);
		
		System.out.println(obj.getEmpSSN());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpAge());
	}

}
