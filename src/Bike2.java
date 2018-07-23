class Bike2 {
	
	// final variable
	final int speedlimit = 90;
	
	// we can't reassign the final variable 
	void run() {
		speedlimit = 400;
	}
	
	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();
	}

}


// when we define a final variable, we can't modify and reassign it later in our code
