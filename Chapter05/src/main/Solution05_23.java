package main;

public class Solution05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1; i <= 50000; i++) {
			sum += ((1.0) / i);
					
		}
		System.out.println("From Left to Right Sum is " + sum);
		sum = 0;
		for(int i = 50000; i > 0; i--) {
			sum += ((1.0) / i);
		}
		System.out.println("From Left to Right Sum is " + sum);


	}

}
