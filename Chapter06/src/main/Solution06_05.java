package main;

import java.util.Scanner;

public class Solution06_05 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers to order them, ");
		System.out.println("Enter first number: ");
		double number1 = input.nextDouble();
		System.out.println("Enter second number: ");
		double number2 = input.nextDouble();
		System.out.println("Enter third number: ");
		double number3 = input.nextDouble();

		displaySortedNumbers(number1, number2, number3);

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double first = 0;
		double second = 0;
		double third = 0;

		if (num1 >= num2 && num1 >= num3) {

			first = num1;

			if (num2 >= num3) {
				second = num2;
				third = num3;
			} else {
				second = num3;
				third = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			first = num2;

			if (num1 >= num3) {
				second = num1;
				third = num3;
			} else {
				second = num3;
				third = num1;
			}

		} else if (num3 >= num2 && num3 >= num1) {
			first = num3;

			if (num2 >= num1) {
				second = num2;
				third = num1;
			} else {
				second = num1;
				third = num2;
			}

		}
		
		System.out.println(third + " >> " + second + " >> " + first);

	}

}
