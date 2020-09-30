package main;

/*
 * (Financial application: find the sales amount)
 * You have just started a sales job in a department store.
 * Your pay consists of a base salary and a commission.
 * The base salary is $5,000.
 * The scheme shown below is used to determine the commission rate.
 * Note that this is a graduated rate.
 * The rate for the first $5,000 is at 8%, the next $5000 is at 10%, and the rest is at 12%.
 * If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year.
 * Write a program that finds the minimum sales you have to generate in order to make $30,000.
 */

public class Solution05_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount = 0;
		double interest = 0;

		while (interest < 30000) {
			amount++;
			interest = 0;
			if (amount >= 10000) {
				interest += 5000 * 0.08;
				interest += 5000 * 0.10;
				interest += (amount - 10000) * 0.12;
			} else if (amount >= 5000) {
				interest += 5000 * 0.08;
				interest += (amount - 5000) * 0.10;
			} else {
				interest += amount * 0.08;
			}

		}

		System.out.println("Minimum sales is " + amount);

	}

}
