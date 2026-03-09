//package finalProjectCS141;

import java.util.Scanner;

public class RecyclingCalculator {
		public static String divider = "-------------------";

	    public static void run(Scanner scanner) {

	        System.out.println("How many grams of paper recycled per day? ");
	        double paper = scanner.nextDouble();

	        paper = paper / 1000; // Convert g to kg
	        
	        System.out.println("How many grams of plastic recycled per day? ");
	        double plastics = scanner.nextDouble();
	        plastics = plastics / 1000; // Convert g to kg
	        
	        System.out.println("How many grams of metal recycled per day? ");
	        double metal = scanner.nextDouble();
	        metal = metal / 1000; // Convert g to kg
	        
	        System.out.println("How many grams of glass recycled per day? ");
	        double glass = scanner.nextDouble();
	        glass = glass / 1000; // Convert g to kg

	        double carbonSaved = paper * 0.46 + plastics * 1.7 + metal * 4 + glass * 0.3;

	        System.out.println(divider + "\nEstimated CO2 saved per day: " + carbonSaved + " kg." + divider + " \nReturning to main menu.");

	    }
	}
