package main;

/*
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */

public class Solution03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 200);
		int x, y;
		x = y = 0;
		
		System.out.println("Coordinates are: ");
		System.out.print("(" + x + "," + (y + height) + ")--------");
		System.out.println("(" + (x + width) + "," + (y + height) + ")\n  |		|\n  |		|\n  |		|\n  |		|");
		System.out.print("(" + x + "," + y + ")--------");
		System.out.println("(" + (x + width) + "," + y + ")");
	

	}

}
