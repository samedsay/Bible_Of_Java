package main;

import java.util.Scanner;

public class Solution06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println(" i\t m(i)");
		System.out.println("_________________");

		for (int i = 1; i <= 20; i++) {

			System.out.printf("%2d\t%7.4f\n", i, mFunction(i));

		}

		input.close();

	}

	public static double mFunction(int limit) {

		double result = 0;

		for (int i = 1; i <= limit; i++) {
			result += (1.0 * i / (1.0 * (i + 1)));
		}

		return result;
	}

}
