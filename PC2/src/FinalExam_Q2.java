//Tyler Nelson 2195426 Programming Concepts 2 Final Exam Q2

/*WAP to create the class Employee. This class has attributes as name, monthly salary, and
monthly working hours. Create another class to instantiate the Employee (make 8 objects
of this kind) and accept the mentioned information. Then, in this class, create a menu
to ask user about his desirable criteria for ranking the employee list. Based on the
user’s selected option show the sorted employee list in ascending order.*/

import java.util.Scanner;

class Employee {

	private String name;
	private int monthlySalary;
	private int monthlyHours;

	public Employee (String name, int monthlySalary, int monthlyHours) {
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.monthlyHours = monthlyHours;
	}

	public String getName() {
		return name;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getMonthlyHours() {
		return monthlyHours;
	}
	
}

//Driver
public class FinalExam_Q2 {

	public static void main(String[] args) {

		Scanner keyboardScanner = new Scanner(System.in);
		String nm;
		int msal, mhours, compare;

		Employee roster[] = new Employee[8];
		Employee temp = new Employee("null", 0, 0);

		//Opening
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter the employee's name[" + (i+1) + "]: ");
			nm = keyboardScanner.next();
			System.out.println("Enter the monthly salary[" + (i+1) + "]: ");
			msal = keyboardScanner.nextInt();
			System.out.println("Enter the monthly working hours[" + (i+1) + "]: ");
			mhours = keyboardScanner.nextInt();
			roster[i] = new Employee(nm, msal, mhours);
		}
		
//		roster[0] = new Employee("Robert", 3400, 120);
//		roster[1] = new Employee("Charlie", 5400, 117);
//		roster[2] = new Employee("Mary", 6600, 105);
//		roster[3] = new Employee("Alfred", 4560, 146);
//		roster[4] = new Employee("David", 3580, 198);
//		roster[5] = new Employee("Rosalina", 3800, 89);
//		roster[6] = new Employee("Peter", 9450, 125);
//		roster[7] = new Employee("George", 4650, 95);
		

		//Menu (one-time use)
		System.out.println("Choose the ranking criteria (enter 1, 2, or 3)");
		System.out.println("1- Based on monthly salary 2- Based on monthly working hours 3- Alphabetically");

		int menuInput = keyboardScanner.nextInt();

		switch (menuInput) {
		case 1: { //Monthly salary ranking
			System.out.println("Ranking based on monthly salary:");
			for (int i = 0; i < roster.length; i++) {
				for (int j = i; j < roster.length; j++) {
					if (roster[i].getMonthlySalary() > roster[j].getMonthlySalary()) {
						temp = roster[i];
						roster[i] = roster[j];
						roster[j] = temp;
					}
				}
				System.out.println((i+1) + ": " + roster[i].getName() + " with the monthly salary " + roster[i].getMonthlySalary());
			}
			break;
		}
		case 2: { //Monthly hours ranking
			System.out.println("Ranking based on monthly hours:");
			for (int i = 0; i < roster.length; i++) {
				for (int j = i; j < roster.length; j++) {
					if (roster[i].getMonthlyHours() > roster[j].getMonthlyHours()) {
						temp = roster[i];
						roster[i] = roster[j];
						roster[j] = temp;
					}
				}
				System.out.println((i+1) + ": " + roster[i].getName() + " with the monthly working hours " + roster[i].getMonthlyHours());
			}
			break;
		}
		case 3: { //Alphabetical ranking
			System.out.println("Ranking based on alphabetical order:");
			for (int i = 0; i < roster.length; i++) {
				for (int j = i; j < roster.length; j++) {
					compare = roster[i].getName().compareToIgnoreCase(roster[j].getName());
					if (compare > 0) {
						temp = roster[i];
						roster[i] = roster[j];
						roster[j] = temp;
					}
				}
				System.out.println((i+1) + ": " + roster[i].getName());
			}
			break;
		}
		default:
			System.out.println("Invalid input!");
			break;
		}
		//Closing
		System.out.println("\nSee you again, have a nice day.");
		keyboardScanner.close();
	}
}
