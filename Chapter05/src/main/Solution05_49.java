package main;

/*
 * (Count vowels and consonants)
 * Assume letters A, E, I, O, and U as the vowels.
 * Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
 * 
 */

import java.util.Scanner;

public class Solution05_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = input.nextLine();
		text.toLowerCase();
		int counterVowel = 0;
		int counterConsonant = 0;
		for (int i = 0; i < text.length(); i++) {

			int textValue = text.charAt(i);
			if (textValue == 97 || textValue == 101 || textValue == 105 || textValue == 111 || textValue == 117)
				counterVowel++;
			else if (textValue != 32)
				counterConsonant++;

		}

		System.out.println("The number of vowels is " + counterVowel);
		System.out.println("The number of consonant is " + counterConsonant);

		input.close();

	}

}
