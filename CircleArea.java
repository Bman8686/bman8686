package cit63;


import java.util.Scanner;


public class CircleArea {
	
public static void main(String[] args) {
		
		Scanner stdin = new Scanner( System.in ); //Scanner
		
		double radius;   //Var to store radius  
		double area;     //Var to store area
		
		System.out.print("Please enter the radius of the circle");
		radius = stdin.nextDouble();  //Get radius from user
		
		//Calculate the area PI * radius * radius
		area = Math.PI * radius * radius;
		
		System.out.println("Print the area of the circle is: ");
		System.out.print(area);
		
	     
	

}
}
