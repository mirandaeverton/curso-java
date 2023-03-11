package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão informadas? ");
		int peopleCount = sc.nextInt();
		Person[] people = new Person[peopleCount];
		
		double heightSum = 0.0;
		
		for(int i=0; i<people.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			people[i] = new Person(name, age, height);
			
			heightSum += height;
		}
		
		double avgHeight = calculateAvgHeight(heightSum, people.length);
		double percentage = calculatePercentageYougPeople(people);
		
		System.out.printf("Altura média: %.2f%n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", percentage);
		printNameYoungPeople(people);
		
		sc.close();
	}
	
	public static double calculateAvgHeight(double heightSum, int heightAmount) {
		return heightSum / heightAmount;
	}
	
	public static double calculatePercentageYougPeople(Person[] people) {
		int amount = findAmountYoungPeople(people);
		double percentage = amount / people.length * 100.0;
		return percentage;
	}
	
	public static int findAmountYoungPeople(Person[] people) {
		int amount = 0;
		for(int i=0; i<people.length; i++) {
			if(people[i].getAge() < 16) {
				amount++;
			}
		}
		return amount;
	}
	
	public static void printNameYoungPeople(Person[] people) {
		for(int i=0; i<people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
	}
}
