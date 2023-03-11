package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		double customsFee = 0.0;
		LocalDate manufactureDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data:%n", i);
			System.out.print("Commom, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: ");
			price = sc.nextDouble();
			sc.nextLine();
			if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				manufactureDate = LocalDate.parse(sc.nextLine(), fmt);
			}
			if (type == 'i') {
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
			}
			
			products.add(createProduct(type, name, price, customsFee, manufactureDate));
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
	
	public static Product createProduct(char type, String name, Double price, Double customsFee, LocalDate manufactureDate) {
		if (type == 'i') {
			return new ImportedProduct(name, price, customsFee);
		}
		
		if (type == 'u') {
			return new UsedProduct(name, price, manufactureDate);
		}
		
		return new Product(name, price);
	}

}
