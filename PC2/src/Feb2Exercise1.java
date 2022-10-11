import java.util.Scanner;
public class Feb2Exercise1 {

	public static void main(String[] args) {
		// Exercise 1
		Scanner keyboardScanner = new Scanner(System.in);
		int threeByFour[][] = new int [3][4];

		//Filling array
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				threeByFour[i][j]=keyboardScanner.nextInt();
			}
		}
		//Printing array columns 
		for (int i=0;i<4;i++) {
			System.out.println("");
			for (int j=0;j<3;j++) {
				System.out.print(threeByFour[j][i] + " ");
			}
		}
		keyboardScanner.close();
	}
}
