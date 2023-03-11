package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		/* Default constructor method
		 * Product product = new Product();
		 */
		
		/* First constructor method
		 * Product product = new Product(name, price, quantity); 
		 */
		
		// Second constructor method
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int addedProducts = sc.nextInt();
		product.addProducts(addedProducts);
		product.totalValueInStock();
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int removedProducts = sc.nextInt();
		product.removeProducts(removedProducts);
		product.totalValueInStock();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
