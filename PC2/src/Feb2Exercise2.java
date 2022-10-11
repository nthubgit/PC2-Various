import java.util.Scanner;

public class Feb2Exercise2 {

	public static void main(String[] args) {
		// Exercise 2
		Scanner keyboardScanner = new Scanner(System.in);
		int threeByFour[][] = new int [3][4];
		int searchValue = 0, missCounter = 0;
		Boolean quitFlag = false;

		//Opening
		System.out.println("Hello, please enter 12 integers (Do not use 255)");
		//Filling array. For the sake of simplicity, it is assumed that the user will only make perfect inputs.
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				threeByFour[i][j]=keyboardScanner.nextInt();
			}
		}
		//Searching array
		System.out.println("/n Enter a value you would like to search for, or enter 255 to quit.");
		while (quitFlag == false) {
			searchValue = keyboardScanner.nextInt();
			//Flag for quitting
			if (searchValue == 255){
				quitFlag = true;
			}
			//Search loop
			else {
				missCounter = 0;
				for (int i=0;i<3;i++) {
					for (int j=0;j<4;j++) {
						if (threeByFour[i][j] == searchValue) {
							System.out.println("Value " + searchValue + " is located at [" + i + "][" + j + "]");
						}
						else {
							missCounter++;
						}
					}
				}
				//Checking to see is no value was returned
				if (missCounter == 12) {
					System.out.println("Value not found in array!");
				}
			}
		}
		//Closing
		System.out.println("Thank you for searching, goodbye!");
	}
}
