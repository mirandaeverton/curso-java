package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		Integer employeeAmount = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 0; i < employeeAmount; i++) {
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increse: ");
		int id = sc.nextInt();
		Employee employee = employees.stream()
				.filter(e -> e.getId() == id)
				.findFirst()
				.orElse(null);
		if (employee != null) {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		} else {
			System.out.println("This id dows not exists!");
		}

		System.out.println();
		System.out.println("List of emplioyees:");
		for (Employee x : employees) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
