import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int qtde = sc.nextInt();
		
		double[] numbers = new double[qtde];
		double sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
			
			sum += numbers[i];
		}
		
		double avg = sum / numbers.length;
		System.out.print("Valores =");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(" " + numbers[i] + "");
		}
		System.out.printf("\nSoma = %.2f%n", sum);
		System.out.printf("Media = %.2f%n", avg);
		
		sc.close();
	}

}
