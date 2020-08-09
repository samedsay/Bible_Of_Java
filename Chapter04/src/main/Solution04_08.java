package main;

import java.util.Scanner;

public class Solution04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code: ");
		int ascii = input.nextInt();
		
		System.out.println("The character for ASCII code " + ascii + " is " + (char)ascii);

		
		input.close();

	}

}
