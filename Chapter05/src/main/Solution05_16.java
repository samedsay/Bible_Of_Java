package main;

import java.util.Scanner;

/*
 * (Find the factors of an integer)
 * Write a program that reads an integer and displays all its smallest factors in increasing order.
 * For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */

public class Solution05_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int factor = 2;

		while (number != 0) {

			if (number % factor == 0) {
				System.out.print(factor + " ");
				number /= factor;
			}else {
				factor++;
			}
		}
		input.close();
	}

}
