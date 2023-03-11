package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFísica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		double healthExpenses = 0.0;
		int employeesCount = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:%n", i);
			System.out.print("Individual or company (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double annualRevenue = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				healthExpenses = sc.nextDouble();
			}
			if (type == 'c') {
				System.out.print("Number of employees: ");
				employeesCount = sc.nextInt();
			}
			contribuintes.add(createContribuinte(type, name, annualRevenue, healthExpenses, employeesCount));
		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		
		double totalTaxes = 0.0;
		for (Contribuinte c : contribuintes) {
			System.out.printf("%s: $ %.2f%n", c.getName(), c.calculateTaxes());
			totalTaxes += c.calculateTaxes();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
	}
	
	public static Contribuinte createContribuinte(char type, String name, Double annualRevenue, Double healthExpenses,  Integer employeesCount) {
		if (type == 'i') {
			return new PessoaFísica(name, annualRevenue, healthExpenses);
		}
		
		return new PessoaJuridica(name, annualRevenue, employeesCount);
	}
}
