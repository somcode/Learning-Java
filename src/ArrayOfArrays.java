
public class ArrayOfArrays {
	public static void main(String[] args) {
		String[][] words = {
				{ "a", "b", "c" },
				{ "d", "e", "f" },
				{ "g", "h", "i" }};
				
    for(int i = 0; i < words.length; i++) {
    	System.out.print(words[i][0] + ":");
    	System.out.print("\n");
    	for(int j = 1; j < words[i].length; j++) {
    		System.out.print(words[i][j]);
    		System.out.print("\n");
    	}
    }
	}

}


