package project;

import java.util.*;

public class classexample {

		private static Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		
//	int a;
//	int b;
//	a = 3;
//	b = 2;
//    System.out.println("a =" + a);
//	System.out.println("b =" +b);
//	System.out.println("a + b =" +(a + b));
//	System.out.println("a - b =" +(a - b));
//	System.out.println("a * b =" + a * b);
//	System.out.println("a / b =" + a / b);
//	System.out.println("a % b =" + (a % b));


		String companyname;
		int enrollment;
		boolean choices;
		Double Ratings;
		
		System.out.println("Enter Company's Name : ");
		companyname = input.next();		
		System.out.println("Company's Name is " + companyname );

		System.out.println("Please enter your enrollment number:");
		enrollment = input.nextInt();
		System.out.println("Enrollment number is " +enrollment);
		
		
		System.out.println("Do you love working in Apple Company:");
		choices = input.nextBoolean();
		System.out.println("Are you loving to work in Apple company :" + choices);
		
		System.out.println("How do you rate this Company:");
		Ratings = input.nextDouble();
		System.out.println("I rate the Apple company: "+Ratings);
		
		
		
		}
}
