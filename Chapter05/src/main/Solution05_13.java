package main;

/*
 * (Find the largest n such that n3 6 12,000)
 * Use a while loop to find the largest integer n such that n^3 is less than 12,000.
 */

public class Solution05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int greatestValue = 0;
		while (greatestValue * greatestValue * greatestValue < 12000)
			greatestValue++;
		System.out.println("Smallest value is " + (greatestValue-1));

	}

}
