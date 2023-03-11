package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int roomsAmount = sc.nextInt();
		
		for(int i=0; i < roomsAmount; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			if(rooms[roomNumber] == null) {
				rooms[roomNumber] = new Rent(name, email);
			} else {
				System.out.println("Room is already rented. Please select another one.");
				i--;
			}
			
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<rooms.length; i++) {
			if(rooms[i] != null) {				
				System.out.printf("%d: %s, %s%n", i, rooms[i].getName(), rooms[i].getEmail());
			}
		}
		
		sc.close();
	}
	

}
