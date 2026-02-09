package cit63;

import java.util.Scanner;


public class TempConv {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner( System.in ); //Scanner
		
		System.out.print("Enter a temperature in Fahrenheit:  ");
		
				double fahrenheit = stdin.nextDouble();
		
				
		        //Conversion
		        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
		
				System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	}
		
	}
		
	
	
	
	
				
		
	
	
	


