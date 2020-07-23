package main;

import java.util.Scanner;

/*
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros).
 * Your program should read the input as an integer. 
 */

public class Solution03_09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbnNumber = input.nextInt();
		int isbn = isbnNumber;
		int mulNum = 9;
		int total = (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		isbnNumber /= 10;
		total += (isbnNumber % 10) * mulNum--;
		
		System.out.print("The ISBN-10 number is ");
		if(isbnNumber == 0)
			System.out.print(0);
		
		int lastNumber = total % 11;
		if(lastNumber == 10)
			System.out.print(isbn + "X");
		else
			System.out.print(isbn + ""+ lastNumber);
		
		
		input.close();
		
	}

}
