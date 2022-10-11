//Tyler Nelson 2195426 Programming Concepts 2 Final Exam Q1

/*WAP to create an array list “Original” of string type with user inputs (as long as he
wants and continues to input). Then create 2 other array lists: one string type, and the
other one integer type. Start checking the inputted values in Original array list: if
value is convertible to an integer number add it to your integer type array list, and if
not convertible add it to the string type array list. Using exception handling concept,
avoid unwanted termination of program.
At the end, show 3 array lists: Original one, the one including integer values, and the
one including non-integer values.*/

import java.util.Scanner;
import java.util.ArrayList;

public class FinalExam_Q1 {

	public static void main(String[] args) {

		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();

		String tempString;
		int quitFlag = 0;

		Scanner keyboardScanner = new Scanner(System.in);

		//Accepting values into original array
		while (quitFlag == 0) {
			System.out.println("Enter the value:");
			tempString = keyboardScanner.nextLine();
			originalList.add(tempString);
			System.out.println("Continue? Q to quit, any other input to continue.");
			tempString = keyboardScanner.nextLine();
			if(tempString.equalsIgnoreCase("q")) {
				quitFlag = 1;
				System.out.println("Input stopped.");
			}
		}
		//Sorting original array into integer and string array
		for (int i = 0; i < originalList.size(); i++) {
			try {
				int numberTest= Integer.parseInt(originalList.get(i));
				integerList.add(numberTest);
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(e);
				stringList.add(originalList.get(i));
			}
		}
		//Printing
		System.out.println("Original array list: " + originalList);
		System.out.println("Created array list for strings: " + stringList);
		System.out.println("Created array list for integers: " + integerList);	
		//Closing
		System.out.println("\nSee you again, have a nice day.");
		keyboardScanner.close();
	}

}
