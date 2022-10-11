import java.util.Scanner;
public class PalindromeTester {

	public static void main(String[] args) {
//		Scanner keyboardScanner = new Scanner(System.in);
//		String input = keyboardScanner.next();
		String input = "12321";
		Boolean palinFlag = false;

		for (int i = 0; i < (input.length()/2); i++) {
			if (input.charAt(i) == input.charAt(input.length() -1 - i)) {
				palinFlag = true;
			}
			else {
				palinFlag = false;
				break;
			}
		}
		if (palinFlag == true) {
			System.out.println("This is a palindrome.");}
		else {
			System.out.println("This is not a palindrome.");
		}
	}
}


