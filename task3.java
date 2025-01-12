package StudentGradeCalculator;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int input;
	do {
		System.out.println("marks = ");
		int marks = sc.nextInt();
		if (marks >= 90 && marks<= 100)
		{
			System.out.println("O (Outstanding)");
		}
		else if (marks >= 80 && marks <= 89)
		{
			System.out.println("A+ (Excellent)");
		}
		else if (marks >=70 && marks <= 79)
		{
			System.out.println("A (Very Good)");
		}
		else if (marks >=60 && marks <= 69)
		{
			System.out.println("B+ (Good)");
		}
		else if (marks >=50 && marks <= 59)
		{
			System.out.println("B (Above Average)");
		}
		else if (marks >=40 && marks <= 49)
		{
			System.out.println("C (Average)");
		}
		else if (marks >=36 && marks <= 39)
		{
			System.out.println("D (Pass)");
		}
		else if (marks >=0 && marks <= 35)
		{
			System.out.println("F (Fail)");
		}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("Want to continue ? (yes (1) or no(0))");
		input = sc.nextInt();
	} while (input == 1);

	}

}
