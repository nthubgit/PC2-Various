import java.util.Scanner;
import java.util.ArrayList;

//Write a program that accepts names in an ArrayList of Strings and replaces a string of four asterisks "****" in place of every string of length 4. 
//For example, suppose that a list contains the following values: {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"} ; 
//and now your code changes it to  {"****", "is", "****" , "of", "fun", "for", "every", "****",  "programmer"}.

public class Mar14_2022_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sentenceArrayList = new ArrayList<>();
		sentenceArrayList.add("this");
		sentenceArrayList.add("is");
		sentenceArrayList.add("lots");
		sentenceArrayList.add("of");
		sentenceArrayList.add("fun");
		sentenceArrayList.add("for");
		sentenceArrayList.add("every");
		sentenceArrayList.add("Java");
		sentenceArrayList.add("programmer");
		
		System.out.println(sentenceArrayList);
		
		//Removing length 4
		for (int i = 0; i < sentenceArrayList.size(); i++) {
			if (sentenceArrayList.get(i).length() == 4) {
				sentenceArrayList.set(i, "****");
			}
		}
		//Printing again
		System.out.println(sentenceArrayList);

	}

}
