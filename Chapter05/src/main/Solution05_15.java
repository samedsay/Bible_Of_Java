package main;

/*
 * (Display the ASCII character table)
 * Write a program that prints the characters in the ASCII character table from ! to ~.
 * Display ten characters per line.
 * The ASCII table is shown in Appendix B.
 * Characters are separated by exactly one space.d
 */

public class Solution05_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 33;
		int counter = 1;
		while (index < 127) {
			System.out.print((char) (index) + " ");
			if (counter % 10 == 0)
				System.out.println();

			index++;
			counter++;
		}

	}

}
