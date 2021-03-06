package ba.home.boris.homework.weekend3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// Instructing user to enter number format.
			System.out.println("Enter number to check if it's sleep time.");
			int n = input.nextInt(); // Using scanner input.

			// Check for every case and fall thru to the message.
			switch (n) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("Sleep time.");
				break;
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
				System.out.println("Classes.");
				break;
			case 14:
			case 15:
			case 16:
			case 17:
				System.out.println("Exercises.");
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 1:
				System.out.println("Homework.");
				break;
			default: // If user enters number over 24, message tells him input was wrong.
				System.out.println("Day is 24 hours long.");
			}
		} catch (InputMismatchException ex) { // If user enters string message tells him input was wrong.
			System.out.println("Enter in number format not string!");
			ex.printStackTrace(); // Error number for user beside message.
		}

		input.close();

	}

}
