import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int qtde = sc.nextInt();

		int[] numbers = new int[qtde];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		int evenAmount = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("NUMEROS PARES:");
			if(numbers[i]%2 == 0) {
				evenAmount++;
				System.out.print(" " + numbers[i] + " ");
			}
		}
		
		System.out.println("QUANTIDADES DE PARES = " + evenAmount);
		
		sc.close();
	}

}
