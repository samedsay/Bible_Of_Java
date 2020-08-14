package main;

import java.util.Scanner;

/*
 * (Hex to binary)
 * Write a program that prompts the user to enter a hex digit and displays its corresponding binary number. 
 */

public class Solution04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hex digit: ");
		char hex = input.nextLine().charAt(0);
		int output = (int) hex;
		int valueOfHex = 0;

		if ((output - 48) < 10) {
			valueOfHex = output - 48;
			System.out.println(valueOfHex);
		} else if ((output - 65) < 6) {
			valueOfHex = output - 65 + 10;
			System.out.println(valueOfHex);
		} else {
			System.out.println(hex + " is an invalid input. ");
		}

		input.close();

	}

}
