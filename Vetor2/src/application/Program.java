package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos: ");
		int productsAmount = sc.nextInt();
		Product[] products = new Product[productsAmount];
		double productsPriceSum = 0;
		
		for(int i = 0; i < products.length; i ++) {
			sc.nextLine();
			
			System.out.printf("Informe o nome do produto n°%d: ", (i + 1));
			String productName = sc.nextLine(); 
			
			System.out.printf("Informe o preço do produto n°%d: ", (i + 1));
			double productPrice = sc.nextDouble();
			
			products[i] = new Product(productName, productPrice);
			
			productsPriceSum += productPrice;
		}
		
		double productsAvaragePrice = productsPriceSum / productsAmount;
		System.out.printf("O valor médio dos produtos é de $%.2f", productsAvaragePrice);
		
		sc.close();
	}

}
