package main;

import java.util.Scanner;

public class Solution06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two character and numbers of characters per line");
		System.out.println("First Char : ");
		char first = input.next().charAt(0);
		System.out.println("Second Char : ");
		char second = input.next().charAt(0);
		System.out.println("Number of Char per line : ");
		int number = input.nextInt();

		printChars(first, second, number);

		input.close();

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		int lineChecher = 0;
		
		if(ch1 > ch2) {
			char temp = ch2;
			ch2 = ch1;
			ch1 = temp;
		}

		for (int i = (int) ch1; i <= (int) ch2; i++) {

			if (lineChecher % numberPerLine == 0 && lineChecher != 0)
				System.out.println();

			System.out.print((char) i + " ");
			
			lineChecher++;

		}

	}

}
