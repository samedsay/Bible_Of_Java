package main;

import java.util.Scanner;

public class Solution05_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		short number = input.nextShort();
		
		String binaryForm = "";
		
		for(int i = 0; i < 16; i++) {
			
			binaryForm = (number & 1) + binaryForm;
			number >>= 1;
			
		}
		
		System.out.println("The bits are " + binaryForm);
		
		
	}

}
