package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int peopleCount = sc.nextInt();
		double[] heights = new double[peopleCount];
		double heightsSum = 0;
		for(int i = 0; i < peopleCount; i ++ ) {
			System.out.print("Informe a altura da pessoa n°" + (i+1) + ": ");;
			heights[i] = sc.nextDouble();
			heightsSum += heights[i];
		}
		
		double avarageHeight = heightsSum / peopleCount;
		System.out.printf("A altura média das pessoas informadas é de %.2fm", avarageHeight);
		
		sc.close();
	}
}
