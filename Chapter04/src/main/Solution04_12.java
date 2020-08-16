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
		String inputValue = input.nextLine();
		char hex = inputValue.charAt(0);
		int output = (int) hex;
		int valueOfHex = 0;
		int binaryNum = 0;

		if ((output - 48) < 10 && (output - 48) >= 0) {
			valueOfHex = output - 48;

		} else if (((output - 65) < 6 && (output - 65) >= 0)) {
			valueOfHex = output - 65 + 10;
		} else if ((output - 97) < 6 && (output - 97) >= 0) {
			valueOfHex = output - 97 + 10;

		} else {
			valueOfHex = -1;
			System.out.println((valueOfHex < 0 ? inputValue : hex) + " is an invalid input. ");

		}
		if (valueOfHex >= 0) {
			switch (valueOfHex) {
			case 1:
				binaryNum = 1;
				break;
			case 2:
				binaryNum = 10;
				break;
			case 3:
				binaryNum = 11;
				break;
			case 4:
				binaryNum = 100;
				break;
			case 5:
				binaryNum = 101;
				break;
			case 6:
				binaryNum = 110;
				break;
			case 7:
				binaryNum = 111;
				break;
			case 8:
				binaryNum = 1000;
				break;
			case 9:
				binaryNum = 1001;
				break;
			case 10:
				binaryNum = 1010;
				break;
			case 11:
				binaryNum = 1011;
				break;
			case 12:
				binaryNum = 1100;
				break;
			case 13:
				binaryNum = 1101;
				break;
			case 14:
				binaryNum = 1110;
				break;
			case 15:
				binaryNum = 1111;
				break;

			}
			System.out.println("The binary value is " + binaryNum);

		}

		input.close();

	}

}
