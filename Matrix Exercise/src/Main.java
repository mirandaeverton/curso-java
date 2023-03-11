import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int number = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.printf("Found number in position: %d, %d%n", i, j);
					findNeighbour(mat, i, j-1, "Left");
					findNeighbour(mat, i, j+1, "Right");
					findNeighbour(mat, i-1, j, "Up");
					findNeighbour(mat, i+1, j, "Down");
				}
			}
		}

		sc.close();
	}
	
	public static void findNeighbour(int[][] mat, int row, int column, String direction) {
		if (row >= 0 && column >= 0 && row < mat.length && column < mat[row].length) {
			int result = (int) mat[row][column];
			System.out.printf("%s: %d%n", direction, result);
		}
	}
}
