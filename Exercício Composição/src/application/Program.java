package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		Department department = new Department(sc.nextLine()) ;
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, level, baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		int contractAmount = sc.nextInt();
		for (int i = 1; i<=contractAmount; i++) {
			System.out.printf("Enter contract #%s data:%n", i);
			System.out.print("Date (DD/MM/YYYY): ");
			String data = sc.next();
			Date date = format.parse(data);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			worker.addContract(new HourContract(date, valuePerHour, hours));
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sc.nextLine();
		String monthAndYear = sc.nextLine();
		int year =  Integer.parseInt(monthAndYear.substring(0, 2));
		int month = Integer.parseInt(monthAndYear.substring(3));
		double income = worker.income(year, month);
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment());
		System.out.printf("Infome for %s: %.2f%n", monthAndYear, income);
		
		sc.close();
	}
}
