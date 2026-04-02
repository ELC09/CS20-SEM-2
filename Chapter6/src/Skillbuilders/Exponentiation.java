package Skillbuilders;

import java.util.Scanner; 
	

	public class Exponentiation {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the base number: ");
	        double base = input.nextDouble();
	        
	        System.out.print("Enter the exponent: ");
	        double exponent = input.nextDouble();
	        
	        // Displaying the result by calling the powerOf method
	        System.out.println(base + " raised to the power of " + exponent + " is " + powerOf(base, exponent));
	        input.close();
	    }

	    // Custom method to return first parameter raised to the second
	    public static double powerOf(double num1, double num2) {
	        return Math.pow(num1, num2); 
	    }
	}

