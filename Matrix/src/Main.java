import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// Matrix declaration
		int[][] mat = new int[n][n];
		
		/* Matrix length
		 * Rows == mat.length
		 * Columns ==  mat[i].length
		 * */
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int negativeNumbersCount = 0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negativeNumbersCount++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + negativeNumbersCount);
		
		sc.close();
	}

}
