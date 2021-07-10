package main;

import java.util.Scanner;

public class Solution06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter i value: ");
		int iMax = input.nextInt();

		for (int i = 1; i <= iMax; i++) {
			double result = 0;

			result = 4 * mFunction(i);

			if (i % 100 == 1)

				System.out.printf("%d\t\t(%4.4f) \n", i, result);

		}

	}

	public static double mFunction(int iMax) {

		double result = 0.0;

		for (int i = 1; i <= iMax; i++) {

			result += (Math.pow(-1, i + 1) / ((2 * i) - 1));

		}

		return result;
	}

}
