package main;

/*
 * (Demonstrate cancellation errors)
 * A cancellation error occurs when you are manipulating a very large number with a very small number.
 * The large number may cancel out the smaller number.
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results, carefully select the order of computation.
 * For example, in computing the following series, you will obtain more accurate results by computing from right to left
 * rather than from left to right.
 * Write a program that compares the results of the summation of the preceding series,
 * computing from left to right and from right to left with n = 50000.
 */

public class Solution05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 1; i <= 50000; i++) {
			sum += ((1.0) / i);

		}
		System.out.println("From Left to Right Sum is " + sum);
		sum = 0;
		for(int i = 50000; i > 0; i--) {
			sum += ((1.0) / i);
		}
		System.out.println("From Left to Right Sum is " + sum);


	}

}
