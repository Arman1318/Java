/*Name = Arman Dodhiya
Student id = 100865197
Course code = COSC-1200-05
description = First class exercise of the Course for the object-oriented programming1, 
this exercise is regarding printing out welcoming message and taking the user input and printing out.*/

package project;

import java.util.Scanner;

public class ClassExercise1 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double userreply;
		
		System.out.println("Hello users!!! Arman Dodhiya here\n Student Id no: 100865197 \n");
		System.out.println("When the going gets tough, the tough get going");
	    String Source = "https://www.english-study-online.com/blog/going-gets-tough-english-proverbs\n";
	    System.out.println(Source);
		System.out.println("Student success ratio in Java Field according to you : ");
		userreply = input.nextDouble();
		System.out.println("According to me the success ratio of the student in Java Field is: " +userreply+"%");
	}

}
