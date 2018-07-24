package PolymorphismAnimals;


class Animal{
	int health = 100;
}

class Mammal1 extends Animal{}
class Cat1 extends Mammal1{}
class Dog1 extends Mammal1{}


public class Test {
	
	public static void main(String[] args) {
		Cat1 c = new Cat1();
		System.out.println(c.health);
		
		Dog1 d = new Dog1();
		System.out.println(d.health);
			
	}
}
