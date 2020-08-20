package main;

/*
 * (Count positive and negative numbers and compute the average of numbers)
 * Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros).
 * Your program ends with the input 0. Display the average as a floating-point number. 
 */

import java.util.Scanner;

public class Solution05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int positiveCounter = 0;
		int negativeCounter = 0;
		double sum = 0;
		int number;

		do {
			System.out.println("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();

			if (number > 0)
				positiveCounter++;
			else if (number < 0)
				negativeCounter++;

			sum += number;

		} while (number != 0);

		if (positiveCounter == 0 && negativeCounter == 0)
			System.out.println("No numbers are entered except 0");
		else {
			System.out.println("The number of positives is " + positiveCounter);
			System.out.println("The number of negatives is " + negativeCounter);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + sum / (positiveCounter + negativeCounter));
		}
		input.close();
	}

}
