package Skillbuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hurricane Category calculator");
		System.out.print("Enter hurricane category (1-5): ");
		int category = input.nextInt();
		
		double minMph = 0;
		double maxMph = 0;
		
		 if (category == 1) {
	            minMph = 74;
	            maxMph = 95;
	        } else if (category == 2) {
	            minMph = 96;
	            maxMph = 110;
	        } else if (category == 3) {
	            minMph = 111;
	            maxMph = 130;
	        } else if (category == 4) {
	            minMph = 131;
	            maxMph = 155;
	        } else if (category == 5) {
	            minMph = 155;
	            maxMph = 155;
	        } else {
	            System.out.println("Invalid category. Please enter a number from 1 to 5.");
	            
	        }    
	            double minKnots = minMph * 0.868976;
	            double maxKnots = maxMph * 0.868976;
	            
	            double minKm = minMph * 1.60934;
	            double maxKm = maxMph * 1.60934;
	            
	            if (category == 5) {
	                System.out.printf("Miles per hour: %.0f+ mph\n", minMph);
	                System.out.printf("Knots: %.2f+ kts\n", minKnots);
	                System.out.printf("Kilometers per hour: %.2f+ km/hr\n", minKm);
	               
	            } else {
	                System.out.printf("Miles per hour: %.0f - %.0f mph\n", minMph, maxMph);
	                System.out.printf("Knots: %.2f - %.2f kts\n", minKnots, maxKnots);
	                System.out.printf("Kilometers per hour: %.2f - %.2f km/hr\n", minKm, maxKm);
	            
	            input.close();
	}
	}

}