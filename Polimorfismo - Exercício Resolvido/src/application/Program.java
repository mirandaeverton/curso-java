package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;
import entitites.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 1; i <= numberOfEmployees; i++) {
			System.out.printf("Employee #%s data:%n", i);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			double additionalCharge = 0.0;
			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
			}
			employees.add(createEmployee(name, hours, valuePerHour, additionalCharge));
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public static Employee createEmployee (String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		if (additionalCharge > 0.0) {
			Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			return employee;
		} else {
			Employee employee = new Employee(name, hours, valuePerHour);
			return employee;
		}
		
	}

}
