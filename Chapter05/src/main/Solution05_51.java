package main;

import java.util.Scanner;

public class Solution05_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String first = input.nextLine();
		System.out.println("Enter the second string: ");
		String second = input.nextLine();
		int minLength;
		String maxPrefix = "";
		if (first.length() >= second.length())
			minLength = second.length();
		else
			minLength = first.length();

		for (int i = 0; i < minLength; i++) {

			if (first.charAt(i) == second.charAt(i)) {
				maxPrefix += first.charAt(i);
			} else
				break;
		}

		if (maxPrefix == "")
			System.out.println(first + " and " + second + " have no common prefix");
		else
			System.out.println("The common prefix is " + maxPrefix);
		
		input.close();

	}

}
