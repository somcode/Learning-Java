package PolymorphismAnimals;

public class App {
	public static void main(String[] args) {
		Insect allInsects[] = new Insect[4];
		
		allInsects[0] = new Roach();
		allInsects[1] = new Beatle();
		allInsects[2] = new Spider();
		allInsects[3] = new Ant();
		
		for(int i = 0; i < allInsects.length; i++) {
			allInsects[i].eat();
		}
	}

}
