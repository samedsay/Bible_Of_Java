package main;

import java.util.Scanner;

/*
 * (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange. java, to fix the possible loss of accuracy when converting a float value to an int value.
 * Read the input as a string such as "11.56".
 * Your program should extract the dollar amount before the decimal point and the cents after the decimal amount using
 * the indexOf and substring methods.
 */

public class Solution04_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in int, for example 11.56 (11 dollar 56 cent): ");
		String money = input.next();

		int numberOfOneDollars = Integer.parseInt(money.substring(0, money.indexOf('.')));

		int coins = Integer.parseInt(money.substring(money.indexOf('.') + 1));

		int numberOfQuarters = coins / 25;
		coins = coins % 25;

		int numberOfDimes = coins / 10;
		coins = coins % 10;

		int numberOfNickels = coins / 5;
		coins = coins % 5;

		int numberOfPennies = coins;

		System.out.println("Your amount " + money + " consists of");
		System.out.println("		" + numberOfOneDollars + " dollars");
		System.out.println("		" + numberOfQuarters + " quarters ");
		System.out.println("		" + numberOfDimes + " dimes");
		System.out.println("		" + numberOfNickels + " nickels");
		System.out.println("		" + numberOfPennies + " pennies");

		input.close();

	}

}
