package Shape;

import java.util.ArrayList;
import java.util.List;

abstract class Shape1 {
	
	abstract void draw();
	
}


class Rectangle extends Shape1{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape1{
	void draw() {
		System.out.println("Drawing Circle");
	}
}


class GenericTest{
	// creating method that accepts only child class of shape
	
	public static void drawShapes(List <? extends Shape1> lists) {
		for(Shape1 s:lists) {
			s.draw();  //calling method of Shape class by child class instance
	}
}

public static void main(String[] args) {
	List <Rectangle> list1 = new ArrayList<Rectangle>();
	list1.add(new Rectangle());
	
	List <Circle> list2 = new ArrayList<Circle>();
	list2.add(new Circle());
	list2.add(new Circle());
	
	drawShapes(list1);
	drawShapes(list2);
}
}
