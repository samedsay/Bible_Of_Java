package main;

import java.util.Scanner;

public class Solution04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character: ");
		char ascii = input.nextLine().charAt(0);

		System.out.println("The Unicode for the character " + ascii + " is " + (int) ascii);

		input.close();

	}

}
