package main;

import java.util.Scanner;

public class Solution05_47B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		long number = input.nextLong();

		int i = 0;
		int sum = 0;
		String isbnNumber = "" + number;
		while (number > 0) {

			int remainder = (int) (number % 10);

			if (i % 2 == 0)
				sum += 3 * remainder;
			else
				sum += remainder;

			number /= 10;

			i++;

		}

		int checkSum = (10 - (sum % 10));
		if (checkSum == 10) {
			isbnNumber += "" + 0;
		} else {
			isbnNumber += "" + checkSum;
		}

		System.out.println("The ISBN-13 number is " + isbnNumber);

		input.close();
	}

}
