package main;

/*
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */

public class Solution01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((60 * 60 * 24 * 1.6) / ((60 + 40) * 60 + 35));

	}

}
