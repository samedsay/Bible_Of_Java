package main;

import java.util.Scanner;

/*
 * (Financials: currency exchange)
 * Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars.
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 */

public class Solution03_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: 0 ");
		int dollarToRMB = input.nextInt();
		if(dollarToRMB == 0) {
			System.out.print("Enter the dollar amount: ");
			double money = input.nextDouble();
			System.out.print("$" + money + " is " + (money * rate) + " yuan");
		}else{
			System.out.print("Enter the RMB amount: ");
			double money = input.nextDouble();
			System.out.print(money + " yuan is $" + (money / rate));
		}

		input.close();
	}

}
