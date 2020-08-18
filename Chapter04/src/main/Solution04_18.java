package main;

import java.util.Scanner;

public class Solution04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String line = input.nextLine();
		char major = line.charAt(0);
		char status = line.charAt(1);

		if (major == 'M') {
			switch (status) {
			case '1':
				System.out.println("Mathematics Freshman");
				break;
				
			case '2':
				System.out.println("Mathematics Sophomore");
				break;
				
			case '3':
				System.out.println("Mathematics Junior");
				break;

			case '4':
				System.out.println("Mathematics Senior");
				break;

			default:
				System.out.println("Invalid input");

			}
		}

		else if (major == 'C') {
			switch (status) {
			case '1':
				System.out.println("Computer Science Freshman");
				break;

			case '2':
				System.out.println("Computer Science Sophomore");
				break;

			case '3':
				System.out.println("Computer Science Junior");
				break;

			case '4':
				System.out.println("Computer Science Senior");
				break;

			default:
				System.out.println("Invalid input");

			}
		} else if (major == 'I') {
			switch (status) {
			case '1':
				System.out.println("Information Technology Freshman");
				break;

			case '2':
				System.out.println("Information Technology Sophomore");
				break;

			case '3':
				System.out.println("Information Technology Junior");
				break;

			case '4':
				System.out.println("Information Technology Senior");
				break;

			default:
				System.out.println("Invalid input");
			}
		}else {
			System.out.println("Invalid input");

		}
			
		input.close();

	}

}
