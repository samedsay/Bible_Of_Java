package main;

import java.util.Scanner;

/*
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following linear equation:
 * (y1 -y2)x-(x1 -x2)y=(y1 -y2)x1 -(x1 -x2)y1
 * (y3 -y4)x-(x3 -x4)y=(y3 -y4)x3 -(x3 -x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
 * If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the inter- secting point. 
 */

public class Solution03_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1, y1, x2, y2, x3, y3 , x4, y4;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
	
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		if (a * d - b * c == 0)
		{
			System.out.println("The two lines are parallel");
		}
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
		
		input.close();
		

	}

}
