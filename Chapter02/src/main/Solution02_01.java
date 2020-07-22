package main;

import java.util.Scanner;

/*
 * (Convert Celsius to Fahrenheit)
 * Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
 * The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */

public class Solution02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celcius = input.nextDouble();
		double fahrenheit = (9/5.0) * celcius + 32;
		System.out.println(celcius + " degree Celcius is in " + fahrenheit + " degree Fahrenheit.");
		
	}

}
