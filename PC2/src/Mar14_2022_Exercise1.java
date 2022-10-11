import java.util.ArrayList;
import java.util.Scanner;

//Write a program and create 2 ArrayLists of String type and integer type, with 10 elements added each one. 
//After printing both ArrayList elements, write the code to remove even-indexed elements from the string list; and odd-indexed elements from integer list

public class Mar14_2022_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		String tempString;
		int tempInt;

		Scanner keyboardScanner = new Scanner(System.in);

		//Adding values
		System.out.println("Enter 5 strings.");
			stringList.add("a");
			stringList.add("b");
			stringList.add("c");
			stringList.add("d");
			stringList.add("e");
			stringList.add("f");
			stringList.add("g");
			stringList.add("h");
			stringList.add("i");
			stringList.add("j");
		System.out.println("Enter 5 integers.");
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			intList.add(6);
			intList.add(7);
			intList.add(8);
			intList.add(9);
			intList.add(10);
		//Printing
		System.out.println(stringList);
		System.out.println(intList);
		//Removing
		for (int i = 0; i < stringList.size(); i++) {
				stringList.remove(i);
		}
		for (int i = 1; i < intList.size(); i++) {
				intList.remove(i);
		}
		//Printing again
		System.out.println(stringList);
		System.out.println(intList);
	}

}
