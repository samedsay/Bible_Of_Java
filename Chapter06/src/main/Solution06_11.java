package main;

public class Solution06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount = 10000;

		System.out.println("Sales Amount\tCommission");
		System.out.println("____________________________");

		for (int i = 0; i < 19; i++) {

			System.out.printf("%6d\t\t%6.1f\n", amount, computeCommission(amount));

			amount += 5000;

		}

	}

	public static double computeCommission(double salesAmount) {

		double interest = 0;

		if (salesAmount >= 10000) {
			interest += 5000 * 0.08;
			interest += 5000 * 0.10;
			interest += (salesAmount - 10000) * 0.12;
		} else if (salesAmount >= 5000) {
			interest += 5000 * 0.08;
			interest += (salesAmount - 5000) * 0.10;
		} else {
			interest += salesAmount * 0.08;
		}

		return interest;

	}

}
