/*

Program: PrintingEx1.java          Last Date of this Revision: March 3, 2026

Purpose: Create a printing application that prompts the user for the number of copies to print 
and then displays the price per copy and the total price for the job.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20
 

*/
package Mastery; //This line tells Java that the file belongs to the "Mastery package.

import java.util.Scanner; //This imports the Scanner class so we can get input from the user.

public class Exercise1  //Declares a public class named Exercise1
{	//main method
	public static void main(String[] args) {
		//scanner initialization
		Scanner scanner = new Scanner(System.in);
		
		//User input section (for copies)
		System.out.println("Enter the number of copies to be printed: ");
		//Store number entered by the user into the variable "copies"
		int copies = scanner.nextInt();
		
		//determining price depending on input
		double price = 0.00;
		
		 if (copies <= 99) {
	            price = 0.30;
	            
	        } else if (copies <= 499) {
	            price = 0.28;
	           
	        } else if (copies <= 749) {
	            price = 0.27;
	           
	        } else if (copies <= 999 ) {
	            price = 0.26;
	            
	        } else if (copies > 1000) {
	            price = 0.25;
	            
	        } else {
	        	//Handle negative numbers or invalid inputs
	            System.out.println("Invalid amount of copies. Please enter a number greater than 0");
	        }  
	        
		 //total cost calculation
		 double totalCost = copies * price;

	        // Display results, input, price, total cost
	        System.out.println("\nNumber of copies: " + copies);
	        System.out.println("Price per copy: $" + price);
	        System.out.println("Total cost: $" + totalCost);
	    
	   //close scanner
	   scanner.close();
	         	 
	}
	
}

/*
Enter the number of copies to be printed: 
576

Number of copies: 576
Price per copy: $0.27
Total cost: $155.52
*/