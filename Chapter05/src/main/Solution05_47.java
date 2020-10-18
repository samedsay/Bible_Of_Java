package main;

import java.util.Scanner;

public class Solution05_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");

		int i = 1;
		int sum = 0;
		String isbnNumber = "";
		while (i < 13) {

			int number = input.nextInt();
			isbnNumber += "" + number;

			if (i % 2 == 0)
				sum += 3 * number;
			else
				sum += number;

			i++;

		}

		isbnNumber += "" + (10 - sum % 10);
		
		System.out.println("he ISBN-13 number is " + isbnNumber);

		input.close();
	}

}
