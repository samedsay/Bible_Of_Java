package main;

/*
 * (Generate vehicle plate numbers)
 * Assume a vehicle plate number consists of three uppercase letters followed by four digits.
 * Write a program to generate a plate number.
 */

public class Solution04_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char first = (char) (int) ((Math.random() * 26) + 65);
		char second = (char) (int) ((Math.random() * 26) + 65);
		char third = (char) (int) ((Math.random() * 26) + 65);
		char fourth = (char) (int) ((Math.random() * 9) + 48);
		char fifth = (char) (int) ((Math.random() * 9) + 48);
		char sixth = (char) (int) ((Math.random() * 9) + 48);
		char seventh = (char) (int) ((Math.random() * 9) + 48);
		String numberPlate = Character.toString(first) + Character.toString(second) + Character.toString(third)
				+ Character.toString(fourth) + Character.toString(fifth) + Character.toString(sixth)
				+ Character.toString(seventh);

		System.out.println("Random plate number is " + numberPlate);

	}

}
