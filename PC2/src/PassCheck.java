//Tyler Nelson 2195426 Quiz 4

import java.util.Scanner;

class PassChecker{
	private int flag;
	private char ch;

	public PassChecker(){

	}

	public void PassCheckerAll(String username, String pass) {
		//Username check
		flag = 0;
		if (pass.contains(username)){
			flag = 1;
		}
		try {
			if (flag == 1) { //Must not contain username
				throw new PasswordException();
			}
		} 
		catch (PasswordException e) {
			System.out.println(e);
			return;
		}
		//Length check
		flag = 0;
		if (pass.length() < 8) {
			flag = 1;
		}
		try {
			if (flag == 1) { //Must have at least 8 characters of length
				throw new PasswordException();
			}
		} 
		catch (PasswordException e) {
			System.out.println(e);
			return;
		}
		//Capital check
		flag = 0;
		for (int i = 0; i < pass.length(); i++) {
			ch = pass.charAt(i);
			if (Character.isUpperCase(ch) == true){
				flag++;
			}
		}
		try {
			if (flag == 0) { //Must have at least one capital letter
				throw new PasswordException();
			}
		} 
		catch (PasswordException e) {
			System.out.println(e);
			return;
		}
		//Digit check
		flag = 0;
		for (int i = 0; i < pass.length(); i++) {
			ch = pass.charAt(i);
			if (Character.isDigit(ch) == true){
				flag++;
			}
		}
		try {
			if (flag <= 1 ) { //Must at least 2 digits
				throw new PasswordException();
			}
		} 
		catch (PasswordException e) {
			System.out.println(e);
			return;
		}
		//Special char check
		flag = 0;
		String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		for (int i = 0; i < pass.length(); i++) {
			ch = pass.charAt(i);
			if (specialChar.contains(Character.toString(ch))){
				flag++;
			}
		}
		try {
			if (flag == 0) { //Must have at least 1 special character
				throw new PasswordException();
			}
		} 
		catch (PasswordException e) {
			System.out.println(e);
			return;
		}
		//Display username and password if all checks are cleared
			System.out.println("\nPASSWORD IS VALID");
			System.out.println("PassCheck [user=" + username + ", pass=" + pass + "]");
		}
	}

//Exceptions
class PasswordException extends Exception{
	public String toString() {
		return "\nInvalid password!";
	}
}
//Driver
public class PassCheck {
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		
		//Opening
		System.out.println("Enter the username.");
		String u = keyboardScanner.next();
		System.out.println("Enter the password.");
		String p = keyboardScanner.next();

		PassChecker pChecker = new PassChecker();
		pChecker.PassCheckerAll(u, p);
		//Closing
		System.out.println("\nSee you again, have a nice day.");
		keyboardScanner.close();
	}

}

