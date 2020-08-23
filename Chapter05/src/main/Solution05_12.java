package main;

/*
 * (Find the smallest n such that n^2 7 12,000)
 * Use a while loop to find the smallest integer n such that n^2 is greater than 12,000.
 */

public class Solution05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallestValue = 0;
		while (smallestValue * smallestValue < 12000)
			smallestValue++;
		System.out.println("Smallest value is " + smallestValue);

	}

}
