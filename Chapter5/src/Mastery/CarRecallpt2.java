/*

Program: CarRecall modification Ex4.java          Last Date of this Revision: March 31, 2026

Purpose: Modify the CarRecall application to allow the user to input as many model numbers as needed.
 Use 0 as a sentinel to end user input.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20
 

*/
package Mastery; //Defines the package 

import java.util.Scanner; //Imports scanner class for user input handling

public class CarRecallpt2 { //main Class declaration
	public static void main(String[] args) { //main method
		//scanner initialization
        Scanner scanner = new Scanner(System.in);
      
        int modelNumber; //Variable to store the user's input (car model)
        
      //Start of do-while loop to ensure the program runs at least once
        do { 
            //prompts user for input
        	System.out.print("Enter your car model number to check for defects. or enter 0 to quit: ");
            //Reads integer input
        	modelNumber = scanner.nextInt();
            
            //switch statement used for efficient multi-branch selection based on model number
            switch (modelNumber) {
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
            	//These represent defective car model numbers
            	
            	//Output defect status to user
                System.out.println("Model " + modelNumber + " is defective.");
                break;//Terminates execution 

            case 0: // sentinel value used to terminate the loop
                break; // No output here, control handled by loop condition

            default: //handles all models not listed in the switch statement
            	//Outputs non-defective status
                System.out.println("Model " + modelNumber + " is not defective!");
        }
            //Prints a blank line for better readability
            System.out.println();
            
          //loop continues until user enters sentinel value 0  
        } while (modelNumber != 0);
        
        //Final message after loop termination
        System.out.println("Thank you!");
        
        //Closes scanner 
        scanner.close();
	
	}
}
/*Enter your car model number to check for defects. or enter 0 to quit: 23
Model 23 is not defective!

Enter your car model number to check for defects. or enter 0 to quit: 119
Model 119 is defective.

Enter your car model number to check for defects. or enter 0 to quit: 0

Thank you!*/