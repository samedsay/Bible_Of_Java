package main;

/*
 * (Simulation: heads or tails)
 * Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
 */

public class Solution05_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iterator = 0;
		int numberOfTails = 0;
		int numberOfHeads = 0;
		while (iterator < 1000000) {

			int random = (int) (Math.random() * 2);
			if (random == 0) {
				numberOfHeads++;
			} else
				numberOfTails++;

			iterator++;
		}

		System.out.println("Number of Heads --> " + numberOfHeads);
		System.out.println("Number of Tails --> " + numberOfTails);

	}

}
