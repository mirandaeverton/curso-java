package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount account;
		
		System.out.println("Welcome to Miranda Bank \n" 
		+ "Please enter the account information below");
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(accountHolder, accountNumber, initialDeposit);
		}
		else {
			account = new BankAccount(accountHolder, accountNumber);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.addDeposit(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.addWithdraw(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
