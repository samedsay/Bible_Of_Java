package main;

import java.util.Scanner;

public class Solution05_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbnNumber = input.nextInt();
		int isbn = isbnNumber;
		int mulNum = 9;
		int total = (isbnNumber % 10) * mulNum--;
		while (mulNum > 0) {

			isbnNumber /= 10;
			total += (isbnNumber % 10) * mulNum--;

		}

		System.out.print("The ISBN-10 number is ");
		if (isbnNumber == 0)
			System.out.print(0);

		int lastNumber = total % 11;
		if (lastNumber == 10)
			System.out.print(isbn + "X");
		else
			System.out.print(isbn + "" + lastNumber);

		input.close();

	}

}
