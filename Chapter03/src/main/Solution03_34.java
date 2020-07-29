package main;

import java.util.Scanner;

/*
 * (Geometry: point on line segment)
 * Programming Exercise 3.32 shows how to test whether a point is on an unbounded line.
 * Revise Programming Exercise 3.32 to test whether a point is on a line segment.
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1. 
 */

public class Solution03_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2: ");
		double x0, x1, x2, y0, y1, y2;
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		float distance = (float)(Math.sqrt(Math.pow(x0-x1, 2) + Math.pow(y0 - y1, 2)));
		float distanceFirstHalf = (float)(Math.sqrt(Math.pow(x2-x0, 2) + Math.pow(y2 - y0, 2)));
		float distanceSecondHalf = (float)(Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2)));
		
		//System.out.println(distanceFirstHalf + " + " + distanceSecondHalf + " = " + distance);
		
		if (!(distanceFirstHalf + distanceSecondHalf > distance))
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + x1 + ")");
		
		else
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + x1 + ")");

		input.close();

	}

}
