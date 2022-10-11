import java.util.Scanner;

public class Feb2Exercise3 {

	public static void main(String[] args) {
		// Exercise 3
		Scanner keyboardScanner = new Scanner(System.in);
		int threeByFour[][] = new int [3][4];
		int temp = 0;

		//Filling array
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				threeByFour[i][j]=keyboardScanner.nextInt();
			}
		}
		//Sorting rows in descending order
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				for (int k=0;k<3;k++) {
					if (threeByFour[i][k] < threeByFour[i][k+1]) {
					temp = threeByFour[i][k+1];
					threeByFour[i][k+1] = threeByFour[i][k];
					threeByFour[i][k] = temp;
					}
				}
			}
		}
		//Swapping rows (I don't know a better way to make the entire array descended)
		for (int i=0;i<4;i++) {
				temp = threeByFour[2][i];
				threeByFour[2][i]=threeByFour[0][i];
				threeByFour[0][i] = temp;
			}

		//Printing the sorted array
		for (int i=0;i<3;i++) {
			System.out.println("");
			for (int j=0;j<4;j++) {
				System.out.print(threeByFour[i][j] + " ");
			}
		}
		keyboardScanner.close();
	}
}
