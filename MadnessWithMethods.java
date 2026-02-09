package cit63;

import java.util.Scanner; //Scanner 

public class MadnessWithMethods {

	
		
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Madness with Methods");

	        //Functions to get input from user 
	        int firstNum = getAnIntFromTheUser(scanner, "Enter the first integer: ");
	        int secondNum = getAnIntFromTheUser(scanner, "Enter the second integer: ");

	        //Call sumTwoInts to calculate the sum
	        int sum = sumTwoInts(firstNum, secondNum);
	        System.out.println("\nThe sum of the two integers is: " + sum);

	        //Call compareTwoInts to see which is larger
	        compareTwoInts(firstNum, secondNum);
	        
	        scanner.close();
	    }

	    /**
	     * First function gets an integer from the user using a Scanner.
	     * Ensure an integer is entered.
	     */
	    public static int getAnIntFromTheUser(Scanner sc, String prompt) {
	        System.out.print(prompt);
	        while (!sc.hasNextInt()) { //Check if the input is an integer 
	            System.out.println("Sorry, that's not a valid integer. Please try again.");
	            sc.next(); //Discard invalid input 
	            System.out.print(prompt);
	        }
	        return sc.nextInt();
	    }

	    /**
	     * Second function calculates and returns the sum of two integers.
	     */
	    public static int sumTwoInts(int a, int b) {
	        return a + b;
	    }

	    /**
	     * Third function compares two integers and prints the result using 
	     * relational operators.
	     */
	    public static void compareTwoInts(int a, int b) {
	        if (a > b) {
	            System.out.println(a + " is greater than " + b);
	        } else if (b > a) {
	            System.out.println(b + " is greater than " + a);
	        } else {
	            System.out.println("Both integers are equal.");
	            
	            
	        }
	    }
}	
