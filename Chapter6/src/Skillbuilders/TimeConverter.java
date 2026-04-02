package Skillbuilders;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Time Converter Menu");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.println("5. Exit");
        System.out.print("Select an option (1-5): ");
        choice = input.nextInt();

        // Process the user's choice
        switch (choice) {
            case 1:
                System.out.print("Enter hours: ");
                double hrsToMin = input.nextDouble();
                System.out.println(hrsToMin + " hours is " + hoursToMinutes(hrsToMin) + " minutes.");
                break;
            case 2:
                System.out.print("Enter days: ");
                double daysToHrs = input.nextDouble();
                System.out.println(daysToHrs + " days is " + daysToHours(daysToHrs) + " hours.");
                break;
            case 3:
                System.out.print("Enter minutes: ");
                double minToHrs = input.nextDouble();
                System.out.println(minToHrs + " minutes is " + minutesToHours(minToHrs) + " hours.");
                break;
            case 4:
                System.out.print("Enter hours: ");
                double hrsToDays = input.nextDouble();
                System.out.println(hrsToDays + " hours is " + hoursToDays(hrsToDays) + " days.");
                break;
            case 5:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        input.close();
    }

    // Method 1: Converts Hours to Minutes
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    // Method 2: Converts Days to Hours
    public static double daysToHours(double days) {
        return days * 24;
    }

    // Method 3: Converts Minutes to Hours
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // Method 4: Converts Hours to Days
    public static double hoursToDays(double hours) {
        return hours / 24;
    }


}
