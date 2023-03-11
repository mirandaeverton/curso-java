import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String xString = sc.next();
		System.out.println("You typed " + xString);
		
		int xInt = sc.nextInt();
		System.out.println("You typed " + xInt);
		
		double xDouble = sc.nextDouble();
		System.out.println("You typed " + xDouble);
		
		char xChar = sc.next().charAt(0);
		System.out.println("You typed " + xChar);
		
		xString = sc.next();
		xInt = sc.nextInt();
		xDouble = sc.nextDouble();
		System.out.printf("String %s, int %d, double %.2f%n", xString, xInt, xDouble);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Typed values: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
