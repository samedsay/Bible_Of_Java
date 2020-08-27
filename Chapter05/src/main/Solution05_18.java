package main;

public class Solution05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("- - - - - - - - ");

		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("- - - - - - - - ");

		for (int i = 1, space = 6; i <= 6; i++, space--) {
			
			for(int k = 1; k < space; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("- - - - - - - - ");

		for (int i = 1, space = 1; i <= 6; i++, space++) {
			
			for(int k = 1; k < space; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 6 - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
