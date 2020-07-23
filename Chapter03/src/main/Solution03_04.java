package main;

/*
 * (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name 
 * January, February, ..., December for the number 1, 2, ..., 12, accordingly.
 */

public class Solution03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random() * 13);
		switch(number) {
			case 1:
				System.out.println(number + ". month is January!");
				break;
			case 2:
				System.out.println(number + ". month is February!");
				break;
			case 3:
				System.out.println(number + ". month is March!");
				break;
			case 4:
				System.out.println(number + ". month is April!");
				break;
			case 5:
				System.out.println(number + ". month is May!");
				break;
			case 6:
				System.out.println(number + ". month is June!");
				break;
			case 7:
				System.out.println(number + ". month is July!");
				break;
			case 8:
				System.out.println(number + ". month is August!");
				break;
			case 9:
				System.out.println(number + ". month is September!");
				break;
			case 10:
				System.out.println(number + ". month is October!");
				break;
			case 11:
				System.out.println(number + ". month is November!");
				break;
			case 12:
				System.out.println(number + ". month is December!");
				break;
			
		}

	}

}
