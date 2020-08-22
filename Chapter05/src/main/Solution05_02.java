package main;

import java.util.Scanner;

/*
 * (Repeat additions)
 * Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
 * Revise the program to generate ten random addition questions for two integers between 1 and 15.
 * Display the correct count and test time.
 */

public class Solution05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_QESTIONS = 10;
		int counter = 0;
		int correctCounter = 0;
		String output = "";
		long startTime = System.currentTimeMillis();

		while (counter < NUMBER_OF_QESTIONS) {

			int firstNumber = (int) (Math.random() * 16);
			int secondNumber = (int) (Math.random() * 16);

			System.out.print("What is " + firstNumber + " + " + secondNumber + "? ");
			int result = input.nextInt();

			if (firstNumber + secondNumber == result) {
				System.out.println("You are correct!");
				correctCounter++;
			} else {
				System.out.println("Your answer is wrong!\n" + firstNumber + " + " + secondNumber + " should be "
						+ (firstNumber + secondNumber) + "\n");

			}
			counter++;

			output += "\n" + firstNumber + " + " + secondNumber + " = "
					+ (firstNumber + secondNumber == result ? "correct" : "wrong");

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"\nCorrect count is " + correctCounter + "\nTest time is " + (testTime / 1000) + " seconds\n" + output);

		input.close();
	}

}
