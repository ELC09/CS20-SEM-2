package Skillbuilders;

import java.util.Scanner;

public class Delivery {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of the package: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the package: ");
	        double width = scanner.nextDouble();

	        System.out.print("Enter the height of the package: ");
	        double height = scanner.nextDouble();

	        if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Rejected!");
	        } else {
	            System.out.println("Accepted!");
	        }

	        scanner.close();
	    }
	}

