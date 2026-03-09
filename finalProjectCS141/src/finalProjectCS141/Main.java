
//package finalProjectCS141;

import java.util.Scanner;

public class Main {
	// Initializes static variables
	
	public static String divider = "-------------------";
	public static String largeDivider = "==================================================";
	static Scanner scanner = new Scanner(System.in);
	private static Group[] groups = new Group[0];
	private static Group[] joinedGroups = new Group[0];
	private static int totalJoinedGroups = 0;
	
	public static void main(String[] args) {
		// Initializes stuff
		
		initializeGroups();
		joinedGroups = new Group[groups.length];
		int userInput = 0;
		
		// Prints program name
		
		String programName = "Recycling Tracker"; // Temporary Name
		System.out.println(largeDivider + "\n"+ programName +"\n" + largeDivider);
		
		// Main loop
		
		while(userInput != 6) {
			mainMenu();
			
			// Gets user input
			
			System.out.print("Enter your choice: ");
			userInput = scanner.nextInt();
			scanner.nextLine();
			
			// Different functionalities depending on user input
			
			switch(userInput) {
				case 1:
					// feature: info on general recycling practices (should I call a class/method or just use println here?)
					
					break;
					
				case 2:
					// feature: Recycling log
					break;

				case 3:
					// add a feature
					break;
				
				case 5:
					joinGroup();
					break;
					
				case 6:
					// Main loop ends
					break;
					
				default:
					System.out.println("Invalid option");
					break;
				
			}
		}
		
		
	}
	
	
	// Displays Main Menu info
	
	private static void mainMenu() {
		System.out.println("\nMain Menu\n" + divider);
		
		// Currently hardcoded, there is probably a better solution
		System.out.println("""
				1. Add Material
				2. Create/Edit Recycle Log
				3. View Recycle Log
				4. Recycling Calculator
				5. Join a Local Group
				6. Exit
				""");
	}
	
	// Initializes local support groups     The info is fake
	
	private static void initializeGroups() {

	    groups = new Group[3];

	    groups[0] = new Group(
	        "Recycling Club",
	        "Every Saturday at 9 AM",
	        "recycleclub@gmail.com"
	    );

	    groups[1] = new Group(
	        "Recycling Awareness Group",
	        "Meetings online at 11 AM every Sunday",
	        "recyclingAwarenessOfficial@gmail.com"
	    );

	    groups[2] = new Group(
	        "Sustainability Volunteers",
	        "Every Wednesday at 6 PM",
	        "sustainabilityVolunteers@outlook.com"
	    );
	}
	
	// Displays groups and handles joining groups
	
	private static void joinGroup() {
		System.out.println("\nAvailable Groups\n" + divider);
		
		// Loops through groups and displays group info
		
		for(int i = 0; i < groups.length; i++) {
			System.out.println(i+1 + ". " + groups[i].getName());
			System.out.println("Meetings: " + groups[i].getMeetings());
			System.out.println("Contact Info: " + groups[i].getContact() + "\n");
		}
		
		System.out.print("Would you like to join a group? (yes/no): ");
		
		// Exits method if user types anything but yes
		String answer = scanner.nextLine().toLowerCase();
		if (!answer.equals("yes")) return;
		
		System.out.print("Enter the group number to join: ");
        int userInput = scanner.nextInt()-1;
        scanner.nextLine();
        
        // Exits method if user types invalid group number
        if(userInput < 0 || userInput >= groups.length) {
        	System.out.println("Invalid group number");
        	return;
        }
        
        // Exits method if user already joined the chosen group
        for(int i = 0; i < totalJoinedGroups; i++) {
        	if(joinedGroups[i] == groups[userInput]) {
        		System.out.println("You have already joined this group");
        		return;
        	}
        }
        
        // Joins group
        System.out.println("You joined the " + groups[userInput].getName());
        joinedGroups[totalJoinedGroups] = groups[userInput];
        totalJoinedGroups++;
        
		
	}

}
