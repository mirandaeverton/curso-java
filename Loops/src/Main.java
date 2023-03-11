import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		int soma = 0;
//		
//		// WHILE
//		System.out.println("Estrutura While");
//		
//		while (x != 0) {
//			soma += x;
//			x = sc.nextInt();
//		}
//		System.out.println(soma);
//		
//		// FOR
//		System.out.println("Estrutura For");
//		int qtdeNums = sc.nextInt();
//		soma = 0;
//		
//		for (int i = 0; i < qtdeNums; i++) {
//			x = sc.nextInt();
//			soma += x;
//		}
//		
//		System.out.println(soma);

		// DO WHILE

		double tempCelsius, tempFarenheit;
		char answer;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			tempCelsius = sc.nextDouble();
			tempFarenheit = 9.0 * tempCelsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Farenheit: %.2f%n", tempFarenheit);
			System.out.print("Deseja repetir? (s/n): ");
			answer = sc.next().charAt(0);
		} while (answer == 's' || answer == 'S');
		
		sc.close();

	}

}
