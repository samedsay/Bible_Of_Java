package main;

public class Solution05_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum = 0;
		for(int i = 1; i <= 97; i++) {
			sum += ((i*1.0) / (i+2));
					
		}
		System.out.println("From Left to Right Sum is " + sum);
		

	}

}
