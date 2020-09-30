package main;

/*
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its occurrences.
 * Assume that the input ends with number 0.
 * Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and the occurrence count for 5 is 4.
 * (Hint: Maintain two variables, max and count.
 * max stores the current max number, and count stores its occurrences. Initially, assign the first number to max and 1 to count.
 * Compare each subsequent number with max.
 * If the number is greater than max, assign it to max and reset count to 1.
 * If the number is equal to max, increment count by 1.)
 */

import java.util.Scanner;

public class Solution05_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int number = input.nextInt();
		int max = 0;
		int countOfMax = 1;
		while (number != 0) {
			if (max < number) {
				max = number;
				countOfMax = 1;
			} else if (max == number) {
				countOfMax++;
			}
			number = input.nextInt();
		}

		System.out.println("The largest number is " + max);
		if (max != 0)
			System.out.println("The occurrence count of the largest number is " + countOfMax);
		else
			System.out.println("No entered numbers! Try Again!");

		input.close();

	}

}
