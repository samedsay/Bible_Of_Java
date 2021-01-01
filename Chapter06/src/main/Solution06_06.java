package main;

import java.util.Scanner;

public class Solution06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Pleasen enter integer value: ");
		int number = input.nextInt();
		displayPattern(number);

		input.close();

	}

	public static void displayPattern(int n) {

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}

			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
