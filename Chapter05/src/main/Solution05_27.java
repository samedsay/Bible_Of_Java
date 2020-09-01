package main;

public class Solution05_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		for (int year = 101; year <= 2100; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if (counter++ % 10 == 0) {
					System.out.println();
				}
				System.out.print(year + " ");
			}

		}

	}

}
