package main;

import java.util.Scanner;

public class Solution06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("The amount invested: ");
		double amount = input.nextDouble();
		System.out.println("Annual interest rate: ");
		double interest = input.nextDouble();
		System.out.println("Enter year: ");
		int year = input.nextInt();

		futureInvestmentValue(amount, interest / 12.0, year);

		input.close();

	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		System.out.println("Years\t Future Value");

		for (int i = 1; i <= years; i++) {

			for (int j = 0; j < 12; j++) {
				double newAmount = (double) investmentAmount * ((double) monthlyInterestRate * 1.0 / 100.0);
				investmentAmount += newAmount;
			}

			System.out.printf(" %2d\t   %.2f\n", i, investmentAmount);

		}

		return 0;
	}

}
