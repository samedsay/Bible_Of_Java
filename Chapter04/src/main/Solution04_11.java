package main;

import java.util.Scanner;

/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
 */

public class Solution04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value(0 to 15): ");
		int decimal = input.nextInt();
		String output = "";

		if (decimal < 0 || decimal > 15) {
			System.out.println(decimal + " is an invalid input");
		} else if (decimal < 10)
			System.out.println(Integer.toString(decimal));
		else {
			switch (decimal) {
			case 10:
				output = "A";
				break;
			case 11:
				output = "B";
				break;
			case 12:
				output = "C";
				break;
			case 13:
				output = "D";
				break;
			case 14:
				output = "E";
				break;
			case 15:
				output = "F";
				break;

			}
			System.out.println("The hex value is " + output);

		}

		input.close();

	}

}
