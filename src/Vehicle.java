
class Vehicle {
	String color;
	int speed;
	int size;
	
	void attributes() {
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed);
		System.out.println("Size: " + size);
	}
}

class Car extends Vehicle{
	int cc;
	int gear;
	
	void attributescar() {
		System.out.println("Color of car: " + color);
		System.out.println("Speed of car: " + speed);
		System.out.println("Size of car: " + size);
		System.out.println("CC of car: " + cc);
		System.out.println("Gear of car: " + gear);
	}
	
	public static void main(String[] args) {
		Car b1 = new Car();
		b1.color = "blue";
		b1.speed = 200;
		b1.size = 50;
		b1.cc = 300;
		b1.gear = 5;
		b1.attributescar();
	}
}