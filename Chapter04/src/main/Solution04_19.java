package main;

import java.util.Scanner;

/*
 * (Business: check ISBN-10)
 * Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string. 
 */

public class Solution04_19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbnNumberString = input.next();
		int isbnNumber = Integer.parseInt(isbnNumberString);
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

