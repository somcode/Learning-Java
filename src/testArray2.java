
public class testArray2 {
	public static void main(String[] args) {
		//declare the string array with initial size
		String[] schoolbag = new String[4];
		schoolbag[0] = "Book";
		schoolbag[1] = "Pencil";
		schoolbag[2] = "Notebook";
		schoolbag[3] = "Pens";
		
		System.out.print(schoolbag[1]);
		System.out.print("\n");
		
		
		String[] schoolbag2 = {"book", "Pencil", "Notebook", "Pens" };
		for(int i = 0; i < schoolbag2.length; i++) {
			System.out.print("Index [" + i + "]: " + schoolbag2[i]);
			System.out.print("\n");
		}
		
	}

}
