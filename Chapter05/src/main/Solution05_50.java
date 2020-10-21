package main;

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

		System.out.println("The number of capital letter is " + counterCapital);

		input.close();

	}

}
