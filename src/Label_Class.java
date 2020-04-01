import java.util.Scanner;

public class Label_Class {

	public static void main(String[] args) {

		// Define Variables to be used
		int numLabels; // Number of Labels to be printed
		int cntr; // Counts the number of Labels printed
		String userName; // User Name
		String phone; // User Telephone Number
		Scanner sc; // Scanner to read in data from the key board

		// Print a header with your name
		System.out.println("Assignment 1 - Thomas Reese");

		// Initialize the scanner to read in data
		sc = new Scanner(System.in);

		// Get the name and telephone number from the user
		System.out.print("Enter your name : ");
		userName = sc.nextLine();
		System.out.print("Enter your telephone number : ");
		phone = sc.nextLine();

		// Find out how many labels are required
		System.out.print("How many labels do you want? ");
		numLabels = sc.nextInt();

		// Display the labels
		System.out.println();
		System.out.println("Labels");
		System.out.println("======");

		for (cntr = 1; cntr <= numLabels; cntr++) {
			System.out.println(userName);
			System.out.println(phone);
			System.out.println();
		}

	}

}