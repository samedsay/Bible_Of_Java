package main;

import java.util.Scanner;

public class Solution04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char vowelChar = input.nextLine().charAt(0);
		// vowelChar = Character.toUpperCase(vowelChar);
		int charValue = (int) vowelChar;

		if (vowelChar == 'A' || vowelChar == 'E' || vowelChar == 'I' || vowelChar == 'O' || vowelChar == 'U'
				|| vowelChar == 'a' || vowelChar == 'e' || vowelChar == 'i' || vowelChar == 'o' || vowelChar == 'u') {
			System.out.println(vowelChar + " is a vowel");
		} else if ((charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122)) {
			System.out.println(vowelChar + " is a consonant");
		} else {
			System.out.println(vowelChar + " is an invalid input");
		}
		
		input.close();
	}

}
