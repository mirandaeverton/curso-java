import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int qtde = sc.nextInt();
		
		int[] numbers = new int[qtde];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos:");
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]<0) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();
	}

}
