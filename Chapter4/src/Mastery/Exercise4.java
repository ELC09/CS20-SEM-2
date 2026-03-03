/*

Program: CarRecallEx4.java          Last Date of this Revision: March 3, 2026

Purpose: Create a CarRecall application that prompts a customer for the model number 
of their car to find out if it is defective and then displays "Your car is not defective." or "Your car is defective!" 

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20
 

*/
package Mastery; //This line tells Java the file belongs to the "Mastery" package

import java.util.Scanner; //Imports the Scanner class so we can get input from the user

public class Exercise4  //Declares a public class named Exercise4
{
	//Main Method
	 public static void main(String[] args) {
		 
		 //Scanner initialization
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for an integer
	        System.out.print("It has been found that certain models of our car have had a defect with our tires. Please enter your model number to see if your vehicle has a defect." );
	      //Store number entered by the user into the variable "modelNum"
	        int modelNum = scanner.nextInt();
	        
	       //Check for defect numbers using Switch
	        switch(modelNum)
	        {
	        //defective models
	        case 119:
	        case 179:
	        case 189:
	        case 190:
	        case 191:
	        case 192:
	        case 193:
	        case 194:
	        case 195:
	        case 221:
	        case 780:
	        	//Alert user if the model matches the defective list
	        	System.out.println(" Your car is defective, it must be repaired!");
	        	break; //Exit switch after handling defect
	        	
	        //non defective models
	        default:
	        	System.out.println("Your car is not defective! Hooray!");
	        	break;
	        }
	      
	        //close scanner
	        scanner.close();
	        }
	     }

/*
 * It has been found that certain models of our car have had a defect with our tires. Please enter your model number to see if your vehicle has a defect.119
 Your car is defective, it must be repaired!
 OR
 It has been found that certain models of our car have had a defect with our tires. Please enter your model number to see if your vehicle has a defect.100
Your car is not defective! Hooray!
 */

