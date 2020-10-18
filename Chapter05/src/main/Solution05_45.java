package main;

import java.util.Scanner;

public class Solution05_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 numbers: ");

		int counter = 10;
		double totalMean = 0;
		double totalDeviation = 0;
		int n = 10;

		while (counter > 0) {
			double value = input.nextDouble();
			totalMean += value;
			totalDeviation += Math.pow(value, 2);
			counter--;
		}

		double mean = totalMean / 10;

		double standartDeviaton = Math.sqrt((totalDeviation - (Math.pow(totalMean, 2) / 10)) / (n - 1));

		System.out.println("The mean is " + mean);

		System.out.println("The standard deviation is " + standartDeviaton);

	}

}
