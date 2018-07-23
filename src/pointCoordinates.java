
public class pointCoordinates {
	
	private int x, y;
	
	pointCoordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static void main(String[] args) {
		pointCoordinates s1 = new pointCoordinates(2, 4);
		
		// using the default Object.toString() method
		System.out.println("Object toString() method: " + s1);
		
		// implicitily call toString() on object as part of the string concatenation
		String s2 = s1 + "testing";
		System.out.println(s2);
		
	}

}
