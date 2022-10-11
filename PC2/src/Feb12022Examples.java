import java.util.Scanner;
public class Feb12022Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardScanner = new Scanner(System.in);
		int threeByFour[][] = new int [3][4];
		int totalSum = 0, rowSum;
		
		//Filling array & summation
		for (int i=0;i<3;i++) {
			rowSum = 0;
			for (int j=0;j<4;j++) {
				threeByFour[i][j]=keyboardScanner.nextInt();
				totalSum+=threeByFour[i][j];
				rowSum+=threeByFour[i][j];
				if (j==3) {
					System.out.println("Row " + (i+1) + " Sum: " + rowSum);
				}
			}
		}
		//Printing array
		for (int i=0;i<3;i++) {
			System.out.println();;
			for (int j=0;j<4;j++) {
				System.out.print(threeByFour[i][j] + " ");
			}
		}
		//Printing sum
		System.out.println("\nSum is the array is " +totalSum);
		
	}

}
