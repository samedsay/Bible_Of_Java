package main;

import java.util.Scanner;

public class Solution05_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter string: ");
		String text = input.next();
		String reversed = "";

		for (int i = 0; i < text.length(); i++) {
			reversed += text.charAt(text.length() - 1 - i);
		}

		System.out.println("The reversed string is " + reversed);

		
		input.close();
	}

}
