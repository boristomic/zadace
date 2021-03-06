package ba.home.boris.homework.weekend3;

import java.util.Scanner;

public class ASmallGame {

	public static void main(String[] args) {
		
		int[] array = randomElementsFromOneToFour();
		
		// Array with random numbers from 1 to 4.
		System.out.println(java.util.Arrays.toString(randomElementsFromOneToFour()));
		
		// Check if all numbers in array are zeroes.
		checkIfAllZeros(array);
		
		// Catch non existing index.
		catchingIndex(array);
		
		
		}
	
		
		// Array with random numbers from 1 to 4.
	
		static int[] randomElementsFromOneToFour () {
			int[] array = new int[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * 4 + 1); // Assign random number from 1 to 4.
			}
			return array;
			
		}

		// Check if all numbers in array are zeroes.
		static void checkIfAllZeros (int[] array) {
			
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					counter++;
				}
				if (counter == array.length) {
					System.out.println("All zeroes");
				}
			}
			System.out.println("No zeroes.");
			
		}


		// Catch non existing index.
		
		static int[] catchingIndex (int[] array) {
			
		try {
			Scanner input = new Scanner (System.in);
			int[] arrayName = new int[5];
			System.out.println("Enter number to acces array index.");
			int index = input.nextInt();
			arrayName[index] = 5;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array length is 5.");
			ex.printStackTrace();
		}
		return array;
		
		}
		
		

	

	
}
