package cit63;

import java.util.Scanner;

public class SimpleCal {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in ); //Scanner
	
		double  firstNum;
		double  secondNum;
		double  product;
		
		//Prompt user
		System.out.print("Please enter the first number: ");
		firstNum = stdin.nextDouble();
		
		//Prompt user
		System.out.print("Please enter the second number: ");
		secondNum = stdin.nextDouble();
		
		product = firstNum * secondNum;
		
		System.out.println("The product of" + firstNum + "and"  + secondNum +  "is:"  + product);
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
