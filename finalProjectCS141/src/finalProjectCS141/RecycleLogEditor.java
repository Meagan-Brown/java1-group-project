package finalProjectCS141;

import java.util.Scanner;

public class RecycleLogEditor {
    public static RecycleLog recycleLog = new RecycleLog();

    // This method handles the user interaction for editing the recycle log

    public static void editLog(Scanner scanner) {
        System.out.println("\nWhich material did you recycle?\n" + Main.divider);

        // displays all materials
        for(int i = 0; i < recycleLog.getSize(); i++) {
            System.out.println(i+1 + ". " + recycleLog.getMaterial(i).getName());
        }

        System.out.print("Choose the material's number: ");
        int index = scanner.nextInt()-1;

        // checks if input is in range
        if(index < 0 || index >= recycleLog.getSize()) {
            System.out.println("Invalid material");
            return;
        }

        System.out.print("How many grams of it did you recycle: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        if(weight <= 0) {
            System.out.println("Invalid weight");
            return;
        }

        recycleLog.addWeight(index, weight);
    }

    // handles user input for adding a new material
    
    public static void addMaterial(Scanner scanner) {
        System.out.println("This action will reset your recycle log. Are you sure you want to continue? (yes/no)");

        // exits if user types yes
        String answer = scanner.nextLine().toLowerCase();
		if (!answer.equals("yes")) return;

        System.out.println("What material would you like to add?");
        String materialName = scanner.nextLine();

        System.out.println("How many grams of carbon is saved per gram of the material reycled?");
        double carbonOutput = scanner.nextDouble();
        scanner.nextLine();

        RecycleLog.addMaterial(materialName, carbonOutput);
        recycleLog = new RecycleLog();

    }
}