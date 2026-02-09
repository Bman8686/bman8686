package cit63;

import java.util.Scanner;

public class MadLibs {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner( System.in ); //Scanner
		
		// Variables to hold the user's words
        String name, noun, verb, adjective;
        
        System.out.println("Let's create a story! Please provide the following: ");
        
     // Asking for input (using System.out.print so the input is on the same line)
        System.out.print("Enter a name: ");
        name = stdin.nextLine();
       
        System.out.print("Enter a noun: ");
        noun = stdin.nextLine();
        
        System.out.print("Enter a verb (past tense): ");
        verb = stdin.nextLine();
        
        System.out.print("Enter an adjective: ");
        adjective = stdin.nextLine();
        
     // String Concatenation
        String story = "\nOnce upon a time, " + name + " found a " + adjective + " " + noun + ". " +
                       "Without thinking, " + name + " " + verb + " it immediately!";
	
     // Display the final story
        System.out.println(story);
	}
	

}
