package main;

import java.util.Scanner;

public class Solution06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = input.nextInt();
		System.out.println("Sum of digits of " + number + " = " + sumDigits(number));

		
		input.close();
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			int remainder = (int) n % 10;
			sum += remainder;
			n /= 10;
		}
		return sum;
	}

}
