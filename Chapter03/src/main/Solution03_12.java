package main;

import java.util.Scanner;

/*
 * (Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number.
 * A number is palindrome if it reads the same from right to left and from left to right.
 */

public class Solution03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3-digit number to find it is Palindrome or not? ");
		int number = input.nextInt();
		System.out.print(number);
		
		int lastDigit = number % 10;
		number /= 100;
		if(number == lastDigit)
			System.out.println(" is a palindrome.");
		else
			System.out.println(" is not a palindrome.");
		
		input.close();
		

	}

}
