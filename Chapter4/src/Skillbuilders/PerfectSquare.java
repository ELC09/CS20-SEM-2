package Skillbuilders;

import java.util.Scanner;

public class PerfectSquare {
	  public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for an integer
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        // Find the square root
	        double squareRoot = Math.sqrt(number);

	        // Truncate the square root (cast to int)
	        int truncatedRoot = (int) squareRoot;

	        // Square the truncated value
	        int squaredValue = truncatedRoot * truncatedRoot;

	        // Check if it matches the original number
	        if (squaredValue == number) {
	            System.out.println(number + " is a perfect square!");
	        } else {
	            System.out.println(number + " is not a perfect square!");
	        }

	        scanner.close();
	    }
	}

