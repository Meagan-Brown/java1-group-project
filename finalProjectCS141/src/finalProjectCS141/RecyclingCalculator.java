//package finalProjectCS141;

import java.util.Scanner;

public class RecyclingCalculator {
	    public static void run(Scanner scanner) {
			RecycleLog recycleLog = new RecycleLog();

			for(int i = 0; i < recycleLog.getSize(); i++) {
				System.out.println("How many grams of " + recycleLog.getMaterial(i).getName() + " recycled per day? ");
	        	recycleLog.addWeight(i, scanner.nextDouble());
			}

	        System.out.println(Main.divider + "\nEstimated CO2 saved per day: " + recycleLog.getCarbonSaved() + " kg.\n" + Main.divider + " \nReturning to main menu.");

	    }
	}
