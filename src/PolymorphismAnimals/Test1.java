package PolymorphismAnimals;

class Animal2{
	int health = 100;
}

class Mammal2 extends Animal2{}
class Cat2 extends Mammal2{}

public class Test1 {
	
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		System.out.println(c);
		
		Mammal2 m = c;  //Upcsting
		System.out.print(m);
		
	}

}

