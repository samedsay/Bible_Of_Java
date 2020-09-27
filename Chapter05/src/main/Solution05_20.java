package main;

/*
 * (Display prime numbers between 2 and 1,000)
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive.
 * Display eight prime numbers per line. Numbers are separated by exactly one space.
 */

public class Solution05_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 2;
		int counter = 0;

		while (number <= 2000) {
			boolean prime = true;
			for (int divisor = 2; divisor < number / 2; divisor++) {
				if (number % divisor == 0) {
					prime = false;
				}
			}
			if (prime) {

				if (counter++ % 8 == 0) {
					System.out.println();
				}
				System.out.printf("%4d ", number);
			}
			
			
			
			number++;
		}

	}

}
