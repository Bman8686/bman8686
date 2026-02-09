package cit63;

import java.util.Scanner;

public class ReversedStrings {
	
				
		public static void main(String[] args) {
		
		Scanner stdin = new Scanner( System.in ); 
		
		String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
		}

}
