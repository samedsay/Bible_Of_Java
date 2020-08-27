package main;

import java.util.Scanner;

/*
 * (Display pyramid)
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
 */

public class Solution05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 15: ");
		int checker = input.nextInt();

		for (int i = 1, space = checker; i <= checker; i++, space--) {

			for (int k = 1; k < space; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int j = i; j > 0; j--) {
				if(j == 1)
					continue;
				System.out.print(j-1 + " ");
			}

			System.out.println();
		}

	}

}
