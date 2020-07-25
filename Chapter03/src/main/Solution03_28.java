package main;

/*
 * (Geometry: two rectangles) 
 * Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as shown in Figure 3.9.
 * Test your program to cover all cases.
 */

import java.util.Scanner;

public class Solution03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		double firstX = input.nextDouble();
		double firstY = input.nextDouble();
		double firstWidth = input.nextDouble();
		double firstHeight = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		double secondX = input.nextDouble();
		double secondY = input.nextDouble();
		double secondWidth = input.nextDouble();
		double secondHeight = input.nextDouble();
		
		double r1Up = firstY + firstHeight/2.0;
		double r1Down = firstY - firstHeight/2.0;
		double r1Left = firstX - firstWidth/2.0;
		double r1Right = firstX + firstWidth/2.0;
		
		double r2Up = secondY + secondHeight/2.0;
		double r2Down = secondY - secondHeight/2.0;
		double r2Left = secondX - secondWidth/2.0;
		double r2Right = secondX + secondWidth/2.0;
		
		if(r2Up <= r1Up && r2Down >= r1Down && r2Left >= r1Left && r2Right <= r1Right)
			System.out.println("r2 is inside r1");
		else if(r2Down > r1Up || r2Up < r1Down || r2Left > r1Right || r2Right < r1Left)
			System.out.println("r2 does not overlap r1");
		else // if(r2Up <= r1Up || r2Down >= r1Down || r2Left >= r1Left || r2Right <= r1Right)
			System.out.println("r2 overlaps r1");
		
		input.close();
		
	}

}
