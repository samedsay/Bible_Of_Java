package main;

/*
 * (Count uppercase letters)
 * Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.

 */

import java.util.Scanner;

public class Solution05_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = input.nextLine();
		int counterCapital = 0;

		for (int i = 0; i < text.length(); i++) {
			int textValue = text.charAt(i);
			if (textValue >= 65 && textValue <= 96)
				counterCapital++;

		}

		System.out.println("The number of uppercase letter is " + counterCapital);

		input.close();

	}

}
