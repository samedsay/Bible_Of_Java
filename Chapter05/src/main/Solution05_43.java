package main;

public class Solution05_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				if (i != j) {
					System.out.println(i + " " + j);
					counter++;
				}
			}
		}
		System.out.println("The total number of all combinations is " + counter);

	}

}
