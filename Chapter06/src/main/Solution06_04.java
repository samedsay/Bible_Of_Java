package main;

import java.util.Scanner;

public class Solution06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = input.nextInt();

		reverse(number);

		input.close();

	}

	public static void reverse(int number) {
		int reverseNumber = 0;

		while (number > 0) {
			int remainder = number % 10;
			reverseNumber *= 10;
			reverseNumber += remainder;
			number /= 10;
		}

		System.out.println(reverseNumber);

	}

}
