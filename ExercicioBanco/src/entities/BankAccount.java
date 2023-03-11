package entities;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	private static final double WITHDRAW_FEE = 5.00;
	
	public BankAccount(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolder, int accountNumber, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		addDeposit(initialDeposit);
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addDeposit(double amount) {
		balance += amount;
	}
	
	public void addWithdraw(double amount) {
		this.balance -= amount + WITHDRAW_FEE;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ "; Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
				
	}
} 
