package cit63;


import java.util.Scanner;

/**
 * This program asks the user for three integers and determines
 * the largest among them using nested if statements.
 */
public class LargestOfThree {

    public static void main(String[] args) {
        // Create a Scanner to read from standard input
        Scanner stdin = new Scanner(System.in);
        
        int num1, num2, num3;
        int largest;

        // Ask the user for three integers
        System.out.print("Enter the first integer: ");
        num1 = stdin.nextInt();
        
        System.out.print("Enter the second integer: ");
        num2 = stdin.nextInt();
        
        System.out.print("Enter the third integer: ");
        num3 = stdin.nextInt();

        // Determine the largest using if statements
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        
        System.out.println("The largest integer is: " + largest);
        
        stdin.close();
    }
}


