package main;

import java.util.Scanner;

public class Solution05_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double interest = input.nextDouble() / 100.0;
		System.out.print("Enter maturity period (number of months): ");
		double month = input.nextDouble();

		double sum = 0;
		interest /= 12.0;

		System.out.println("Month  CD Value");

		for (int i = 1; i <= month; i++) {
			sum += amount * (1 + interest);
			System.out.printf("%-6d %.2f\n", i, sum);

		}

	}

}
