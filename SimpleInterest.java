package cit63;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner( System.in ); //Scanner
		
		//Declare variables for the calculation
		        double principle;
		        double rate;
		        double time;
		        double interest;  
		        
		        System.out.print("Enter the priciple amount:  " );
		        principle = stdin.nextDouble();
		        
		        System.out.print("Enter the annual interest rate (as a decimal, e.g., 0.05 for 5%): ");
		        rate = stdin.nextDouble();
		        
		        System.out.print("Enter the length in years:  ");
		        time = stdin.nextDouble();
		        
		     // Simple Interest Formula: Principle * Rate * Time
		        interest = principle * rate * time;
		        
		     // Output the result 
		        System.out.println("The calculated simple interest is: " + interest);
		        
		        
		        
		        
		        
		        
}
}