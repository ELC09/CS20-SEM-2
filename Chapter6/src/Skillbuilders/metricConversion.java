package Skillbuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class metricConversion 
{
	static DecimalFormat dcf = new DecimalFormat("0.0");
	
	
	//converting inch to centimeters
	public static void inchesToCentimeters(int number)
	{
		double answer;
		
		answer = number * 2.54;
		
		System.out.println("\n" + number
				+ "inches equals"
				+ dcf.format(answer) + "centimeters.");
	}
	
	
	public static void feetToCentimeters(int number)
	{
		double answer;
		
		answer = number * 30.48;
		
		System.out.println("\n" + number
				+ "feet equals"
				+ dcf.format(answer) + "centimeters.");

	}
	
	
	public static void yardToMEters(int number)
	{
		double answer;
		
		answer = number * 0.91;
		
		System.out.println("\n" + number
				+ "yards equals"
				+ dcf.format(answer) + "meters.");
	}
	
	
	public static void mileToKilometers(int number)
	{
		double answer;
		
		answer = number * 1.61;
		
		System.out.println("\n" + number
				+ "miles equals"
				+ dcf.format(answer) + "kilometers.");
	}
	
	
	public static void centimetersToInches(int number)
	{
		double answer;
		
		answer = number * 0.3937;
		
		System.out.println("\n" + number
				+ "centimeters equals"
				+ dcf.format(answer) + "inches.");
	}
	
	public static void centimetersToFeet(int number)
	{
		double answer;
		
		answer = number * 0.0328;
		
		System.out.println("\n" + number
				+ "centimeters equals"
				+ dcf.format(answer) + "feet.");
	}
	
	
	public static void metersToYards(int number)
	{
		double answer;
		
		answer = number * 1.09;
		
		System.out.println("\n" + number
				+ "meters equals"
				+ dcf.format(answer) + "yards.");
	}
	
	public static void kilometersToMiles(int number)
	{
		double answer;
		
		answer = number * 0.62;
		
		System.out.println("\n" + number
				+ "kilometers equals"
				+ dcf.format(answer) + "miles.");
	}
	
	public static void main(String[] args)
	{
		int choice;
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		System.out.println();
		System.out.println("convert: ");
		System.out.println("1. Inches to centimeters\t"
				+ "5. Centimeters to Inches");
		System.out.println("2. Feet to centimeters\t"
				+ "6. Centimeters to Feet");
		System.out.println("3. Yards to meters\t"
				+ "7. Meters to Yards");
		System.out.println("4. Miles to kilometers\t"
				+ "8. kilometers to miles");
		
		System.out.println("Enter your choice: ");
		
		choice = input.nextInt();
		
		switch(choice)
		{
		case 1: inchesToCentimeters(number);break;
		case 2: feetToCentimeters(number);break;
		case 3: yardToMEters(number);break;
		case 4: mileToKilometers(number);break;
		case 5: centimetersToInches(number);break;
		case 6: centimetersToFeet(number);break;
		case 7: metersToYards(number);break;
		case 8: kilometersToMiles(number);break;
		}
		
		
	}
}
