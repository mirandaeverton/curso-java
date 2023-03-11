package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		
		System.out.println("Enter the student data:");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Fist Grade: ");
		student.firstGrade = sc.nextDouble();
		System.out.print("Second Grade: ");
		student.secondGrade = sc.nextDouble();
		System.out.print("Third Grade: ");
		student.thirdGrade = sc.nextDouble();
		
		System.out.println();
		System.out.println(student);
		
		sc.close();
	}

}
