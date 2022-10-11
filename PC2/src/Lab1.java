// Tyler Nelson 2195426 Programming Concepts 2 Lab 1
// January 31 2022
import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		int temp;
		int initArray[] = new int[10];

		// Opening
		System.out.println("Hello, please enter 10 integers.");
		for (int i = 0; i < initArray.length; i++) {
			initArray[i] = keyboardScanner.nextInt();
		}
		// Printing initial array
		System.out.println("Initial array: ");
		for (int i = 0; i < initArray.length; i++) {
			System.out.print(initArray[i] + " ");
		}
		// Sorting positive integers to the right
		for (int i = 0; i < initArray.length-1; i++) {
			for (int j = 0; j < initArray.length-1; j++) {
				if (initArray[j] >= 0 && !(initArray[j+1] >=0) ) { 
					temp = initArray[j+1];
					initArray[j+1] = initArray[j];
					initArray[j] = temp;
				}

			}
		}
		// Printing shifted array
		System.out.println("\nShifted array: ");
		for (int i = 0; i < initArray.length; i++) {
			System.out.print(initArray[i] + " ");
		}
		// Ending
		System.out.println("\nSee you again, have a nice day.");
		keyboardScanner.close();
	}

}
