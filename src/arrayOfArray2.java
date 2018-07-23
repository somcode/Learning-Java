
public class arrayOfArray2 {
	public static void main(String[] args) {
		
		int myArrays [][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}};
		
//		int myArray [][] = new int [2][3];
//		myArray[0][0] = 1;
//		myArray[0][1] = 2;
//		myArray[0][2] = 3;
//		myArray[0][3] = 4;
//		
//		myArray[1][0] = 5;
//		myArray[1][1] = 6;
//		myArray[1][2] = 7;
//		myArray[1][3] = 8;
//		
//		myArray[2][0] = 9;
//		myArray[2][1] = 10;
//		myArray[2][2] = 11;
//		myArray[2][3] = 12;
//		
		int rows = 3;
		int col = 4;
		int i, j;
		
		for(i = 0; i < rows; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(myArrays[i][j] + " ");
			}
		}
	}	

}

