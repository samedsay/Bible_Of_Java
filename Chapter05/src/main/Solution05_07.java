package main;

import java.util.Scanner;

/*
 * (Financial application: compute future tuition)
 * Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
 * In one year, the tuition will be $10,500.
 * Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
 */

public class Solution05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		final double RATIO = 0.05;
		double tuitionFee = 10000;
		for (int i = 0; i < 10; i++) {
			tuitionFee = tuitionFee + (tuitionFee * RATIO);
			System.out.printf("After %2d.year -> %.3f\n", (i + 1), tuitionFee);
		}

	}

}
