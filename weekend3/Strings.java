package ba.home.boris.homework.weekend2;

import java.util.Scanner;

public class Strings {
	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first string.");
	String first = input.nextLine();
	System.out.println("Enter second string.");
	String second = input.nextLine();

	
	// Method that checks if all character from first string appear in second string.
	System.out.println("Does first string appear in second? > " + firstAppearInSecond(first, second));
	
	// Method that prints string that comes latest in alphabet.
	wichStringComesLastInAlphabet(first, second);
	
	// Method that determines if two strings are anagrams.
	areAnagrams(first, second);
	
	input.close();	
	}
	
	
	// Method that checks if all character from first string appear in second string.
	
	static boolean firstAppearInSecond (String first, String second) {
		
		int counter = 0;
		if (first.length() <= second.length()) { // If first string is smaller or equal to second.
			for (int i = 0; i < first.length(); i++) { // Go thru first.
				for (int j = 0; j < second.length(); j++) { // Go thru second.
					if (first.charAt(i) == second.charAt(j)) { // If for every index value in first there is equal character in second.
						counter++; // Count them.
					}
				}
			}
		} else { // Second string is smaller then first so return false.
			return false;
		}
		if (counter >= first.length()) { // If counter is larger or equal to length of first string, then it all checks out.
			return true;
		} else { // Otherwise values are not same, so return false.
			return false;
		}
	}
	
	// Method that prints string that comes latest in alphabet.
	
	static void wichStringComesLastInAlphabet (String first, String second) {
		
		int num = first.compareToIgnoreCase(second); // Compare strings.
		if (num > 0) { // Positive number means first string is larger then second.
			System.out.println("Last one would be > " + first);
		} else { // Vice versa.
			System.out.println("Last one would be > " + second);
		}
		
	}
	
	// Method that determines if two strings are anagrams.
	
	static void areAnagrams (String first, String second) {
		
		char[] arrayFirstString = first.toCharArray(); 
		char[] arraySecondString = second.toCharArray();
		if (arrayFirstString.length == arraySecondString.length) {
			for (int i = 0; i < arrayFirstString.length; i++) {
				for (int j = 0; j < arraySecondString.length; j++) {
					if (arrayFirstString[i] == arraySecondString[j]) {
						System.out.println("Strings are anagrams");
						break;
					} 
				}
			}
		} else {
			System.out.println("Strings not anagrams.");
		}
		
				
	}
	
	
	
	
	

}