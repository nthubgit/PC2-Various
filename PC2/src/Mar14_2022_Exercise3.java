////Create a class that accepts the strings from the user (as long as he wants to enter), and then,
////when the user has finished with his data entry, checks for the duplicate values and deletes them
////from the ArrayList. Print the final unified list of strings. 
//
//import java.util.*;
//
//public class Mar14_2022_Exercise3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StringInput a = new StringInput();
//		
//		a.inputLoop();
//
//	}
//}
//
//class StringInput {
//
//	private ArrayList<String> whateverArrayList= new ArrayList<>();
//
//	public StringInput(ArrayList<String> whateverArrayList) {
//		this.whateverArrayList= whateverArrayList;
//	}
//
//	void inputLoop() {
//		int flag = 0, count = 0;
//		String tempString = "n";
//		Scanner keyScanner = new Scanner(System.in);
//		
//		System.out.println("Enter a string. Enter QUIT to stop.");
//		while (flag == 0) {
//			tempString = keyScanner.next();
//			if (tempString.equalsIgnoreCase("QUIT")) {
//				flag = 1;
//				break;
//			}
//			else
//			whateverArrayList.set(count, tempString);
//			count++;
//		}
//		System.out.println(whateverArrayList);
//	}
//}
//
//
