package main;

import java.util.Scanner;

public class Solution05_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of your money: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest amount: ");
		double interest = input.nextDouble() / 100.0;
		System.out.println("Enter the number of months: ");
		double month = input.nextDouble();

		double sum = 0;
		interest /= 12.0;

		System.out.println("Your money -> " + amount);

		for (int i = 1; i <= month; i++) {
			sum += amount * (1 + interest);
			System.out.printf("After %d. month -> %.3f\n", i, sum);

		}
		
		input.close();
	}
}
