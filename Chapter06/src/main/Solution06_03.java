package main;

import java.util.Scanner;

public class Solution06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = input.nextInt();

		if (isPalindrome(number))
			System.out.println(number + " is palindrome!(" + number + " = " + reverse(number) + ")");
		else
			System.out.println(number + " is not palindrome!(" + number + " != " + reverse(number) + ")");

		input.close();

	}

	public static int reverse(int number) {
		int reverseNumber = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverseNumber *= 10;
			reverseNumber += remainder;
			number /= 10;
		}

		return reverseNumber;

	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

}
