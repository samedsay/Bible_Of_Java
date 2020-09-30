package main;

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

	}

}
