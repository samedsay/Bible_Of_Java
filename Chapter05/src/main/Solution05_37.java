package main;

/*
 * Decimal to binary) Write a program that prompts the user to enter a decimal integer and displays its corresponding binary value.
 * Don’t use Java’s Integer .toBinaryString(int) in this program.
 */

import java.util.Scanner;

public class Solution05_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal number to see in binary format: ");
		int decimalNumber = input.nextInt();
		int power = 0;
		int binaryNumber = 0;
		System.out.print(decimalNumber);
	
		while (decimalNumber > 0) {

			int remainder = decimalNumber % 2;
			decimalNumber /= 2;
			binaryNumber += remainder * Math.pow(10, power++);
		}
		
		System.out.println(" (Decimal) = " + binaryNumber  + " (Binary)");
		
		input.close();

	}

}
