package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Program {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double quotation, dollarAmount, reaisAmount;
		
		System.out.print("What is the dollar price? ");
		quotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		dollarAmount = sc.nextDouble();
		reaisAmount = CurrencyConverter.dollarToReal(quotation, dollarAmount);
		System.out.printf("Amount to be paid in reais = %.2f", reaisAmount);
		
	}
	


}
