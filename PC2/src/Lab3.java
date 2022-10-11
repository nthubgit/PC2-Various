//Tyler Nelson 2195426 Lab 3

interface Organize{
	abstract String[] sort(String name[]);
}

interface Calculate{
	abstract int calc(int salaryorage[]);
}

//Company A
class Company_A implements Organize, Calculate{
	private String name[];
	private int age[], salary[];
	private String topEarner;
	//Constructor
	public Company_A() {
		name = new String[]{"Beth", "Alice", "Diane", "Carol"};
		age = new int[]{12, 33, 45, 62};
		salary = new int[]{2500, 45000, 50000, 75000};
		topEarner = "null";
		}

	public String[] getName() {
		return name;
	}

	public int[] getAge() {
		return age;
	}

	public int[] getSalary() {
		return salary;
	}

	public String getTopEarner() {
		return topEarner;
	}

	public void setTopEarner(String topEarner) {
		this.topEarner = topEarner;
	}

	//Sort ascending
	public String[]sort(String name[]) {
		String tempName = "null";
		int tempAge = 0, tempSalary = 0, compare = 0;
		for (int i = 0; i < name.length - 1; i++) {
			compare = name[i].compareTo(name[i+1]);
			if(compare > 0) {
				//Need to sort all three arrays here to keep them linked in order because not multi dimensional?
				tempName = name[i+1];
				name[i+1] = name[i];
				name[i] = tempName;
				tempAge = age[i+1];
				age[i+1] = age[i];
				age[i] = tempAge;
				tempSalary = salary[i+1];
				salary[i+1] = salary[i];
				salary[i] = tempSalary;
			}
		}
		return name;
	}
	//Calculate highest
	public int calc(int salary[]) {
		int max = salary[0];
		for (int i = 0; i < salary.length - 1; i++) {
			if(salary[i] < salary[i+1]) {
				max = salary[i+1];
				setTopEarner(name[i+1]);
			}
		}
		return max;
	}
	//toString override
	public String toString() {
		//Sloppy
		return "The highest salary is " + calc(salary) + " ,earned by " + getTopEarner() + ".\n" +
				"Sorted list in ascending order based on name: \n" +
				name[0] + " " +  age[0] + " years old, " +
				name[1] + " " +  age[1] + " years old, " +
				name[2] + " " +  age[2] + " years old, " +
				name[3] + " " +  age[3] + " years old, "
				;

	}
}

//Company B
class Company_B implements Organize, Calculate{
	private String name[];
	private int age[], salary[];
	private String youngestEmployee;
	//Constructor
	public Company_B() {
		name = new String[]{"Bob", "Arnold", "Donald", "Chris"};
		age = new int[]{22, 43, 55, 72};
		salary = new int[]{3500, 55000, 60000, 85000};
		youngestEmployee = "null";
	}
	public String[] getName() {
		return name;
	}

	public int[] getAge() {
		return age;
	}

	public int[] getSalary() {
		return salary;
	}

	public String getYoungestEmployee() {
		return youngestEmployee;
	}

	public void setYoungestEmployee(String topEarner) {
		this.youngestEmployee = topEarner;
	}
	
	//Sort descending
	public String[]sort(String name[]) {
		String tempName = "null";
		int tempAge = 0, tempSalary = 0;
		for (int i = 0; i < salary.length - 1; i++) {
			if(salary[i] > salary [i+i]) {
				//Need to sort all three arrays here to keep them linked in order because not multi dimensional?
				tempName = name[i+1];
				name[i+1] = name[i];
				name[i] = tempName;
				tempAge = age[i+1];
				age[i+1] = age[i];
				age[i] = tempAge;
				tempSalary = salary[i+1];
				salary[i+1] = salary[i];
				salary[i] = tempSalary;
			}
		}
		return name;
	}
	//Calculate youngest
		public int calc(int age[]) {
			int min = age[0];
			setYoungestEmployee(name[0]);
			for (int i = 0; i < age.length - 1; i++) {
				if(age[i] > age[i+1]) {
					min = age[i+1];
					setYoungestEmployee(name[i+1]);
				}
			}
			return min;
		}
		//toString override
		public String toString() {
			//Sloppy
			return "The youngest employee is " + calc(age) + " years old, and their name is " + getYoungestEmployee() + ".\n" +
					"Sorted list in descending order based on salary: \n" +
					name[3] + " with " +  salary[3] + " salary, " +
					name[2] + " with " +  salary[2] + " salary, " +
					name[1] + " with " +  salary[1] + " salary, " +
					name[0] + " with " +  salary[0] + " salary, "
					;

		}
}
//Driver
public class Lab3 {

	public static void main(String[] args) {
		Company_A cmpA = new Company_A();
		Company_B cmpB = new Company_B(); 
		
		//Openin
		System.out.println("Info for Company A:\n----------------------------");
		cmpA.sort(cmpA.getName());
		System.out.println(cmpA.toString());
		
		System.out.println("\nInfo for Company B:\n----------------------------");
//		cmpB.sort(cmpB.getName());
		System.out.println(cmpB.toString());
		//Closing
		System.out.println("\nSee you again, have a nice day.");
	}

}

