package cit63;

import java.util.Scanner;

public class CharDetails {
  
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner ( System.in );
		
		System.out.print("Please type a single character:  ");
		
		String input = stdin.next();
		
		char ch = input.charAt(0);
		
		// Get Unicode value 
		int unicodeValue = (int) ch;
		
		System.out.println("The Unicode value of '" + ch + "' is " + unicodeValue + ".");
        
		if (Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a digit.");
        } else {
            System.out.println("'" + ch + "' is neither a letter nor a digit.");
		
            
	       
	}
	}
	}
