package main;

import java.util.Scanner;

/*
 * (Convert letter grade to number)
 * Write a program that prompts the user to enter a letter grade A, B, C, D, or F
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0. 
 */

public class Solution04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		char letter = input.nextLine().charAt(0);
		int numericValue = 0;
		switch (letter) {
		case 'A':
			System.out.println("The numeric value for grade " + letter + " is " + 4);
			break;
		case 'B':
			System.out.println("The numeric value for grade " + letter + " is " + 3);
			break;
		case 'C':
			System.out.println("The numeric value for grade " + letter + " is " + 2);
			break;
		case 'D':
			System.out.println("The numeric value for grade " + letter + " is " + 1);
			break;
		case 'F':
			System.out.println("The numeric value for grade " + letter + " is " + 0);
			break;
		default:
			System.out.println(letter + " is an invalid grade");

		}
		
		input.close();
	}

}
