package main;

/*
 * Geometry: point position)
 * Given a directed line from point p0(x0, y0) to p1(x1, y1), you can use the following condition to decide 
 * whether a point p2(x2, y2) is on the left of the line, on the right, or on the same line
 * 		(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
 * 
 */

import java.util.Scanner;

public class Solution03_32 {

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

		double place = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		
		if(place > 2)
			System.out.println("("+ x2 + ", " + y2 + ") is on the left side of the line from (" 
								+ x0 + ", " + y0 + ") to (" + x1 + ", " + x1 + ")");
		else if(place == 0)
			System.out.println("("+ x2 + ", " + y2 + ") is on the line from (" 
					+ x0 + ", " + y0 + ") to (" + x1 + ", " + x1 + ")");
		else
			System.out.println("("+ x2 + ", " + y2 + ") is on the right side of the line from (" 
					+ x0 + ", " + y0 + ") to (" + x1 + ", " + x1 + ")");
		
		input.close();

	}

}
