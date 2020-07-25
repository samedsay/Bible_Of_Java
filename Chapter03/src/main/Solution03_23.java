package main;

import java.util.Scanner;

/*
 * (Geometry: point in a rectangle?)
 * Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5.
 * For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b.
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2.
 * Test your program to cover all cases.) 
 */

public class Solution03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		x = x < 0 ? -x : x;
		y = y < 0 ? -y : y;
		boolean range = x <= 10/2.0 && y <=5/2.0;
		System.out.print("Point (" + x + ", " + y + ") is" + (range ? "" : " not") +" in the rectangle");
		
		input.close();

	}

}
