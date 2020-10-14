package main;

/*
 * (Financial application: find the sales amount)
 * Rewrite Programming Exercise 5.39 as follows:
 * ■ Use a for loop instead of a do-while loop.
 * ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */

import java.util.Scanner;

public class Solution05_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter comission rates: ");
		System.out.println("Rate for 0 - 5000$");
		double firstRate = input.nextDouble();
		System.out.println("Rate for 5000$ - 10000$");
		double secondRate = input.nextDouble();
		System.out.println("Rate for > 10000$");
		double thirdRate = input.nextDouble();

		double amount = 0;
		double interest = 0;

		for (; interest < 30000; amount++) {
			interest = 0;
			if (amount >= 10000) {
				interest += 5000 * firstRate;
				interest += 5000 * secondRate;
				interest += (amount - 10000) * thirdRate;
			} else if (amount >= 5000) {
				interest += 5000 * firstRate;
				interest += (amount - 5000) * secondRate;
			} else {
				interest += amount * firstRate;
			}

		}

		System.out.println("Minimum sales is " + amount);

	}

}
