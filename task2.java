package creatingPalindromeChecker;

import java.util.Scanner;

public class task2 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int rev = 0, temp;
		System.out.println("Enter the Number");
		int num = s.nextInt();
		temp = num;
		while(num>0)
		{
			int remainder = num%10;
			rev = rev *10+ remainder;
			num = num/10;
		}
		if(temp == rev)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
