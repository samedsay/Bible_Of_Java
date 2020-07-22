package main;

import java.util.Scanner;

/*
 * (Convert pounds into kilograms)
 * Write a program that converts pounds into kilo- grams.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 * One pound is 0.454 kilograms. 
 */

public class Solution02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		float pounds = input.nextFloat();
		float kilograms = pounds * 0.454f;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
		
		input.close();

	}

}
