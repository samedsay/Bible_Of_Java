package main;

import java.util.Scanner;

public class Solutions06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer ( < 1000) :");
		int number = input.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}

		input.close();

	}

	public static boolean isPrime(int number) {
	
		
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}

}
