import java.util.Scanner;

class Person {

	String name;
	int age;

	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Mar15_2022_Exercise1 {

	public static void main(String[] args) {

		Person people[] = new Person[5];
		people[0] = new Person("Alice", 44);
		people[1] = new Person("Bob", 24);
		people[2] = new Person("Carl", 70);
		people[3] = new Person("Daviddddd", 14);
		people[4] = new Person("Earl", 50);

		//Setting max age
		int maxAge = people[0].getAge();
		
		for (int i = 1; i < people.length; i++) {
			if(maxAge < people[i].getAge()) {
				maxAge = people[i].getAge();
			}
		}
		//Setting longest name
		String maxName = people[0].getName();
		
		for (int i = 1; i < people.length; i++) {
			if(maxName.length() < people[i].getName().length()) {
				maxName = people[i].getName();
			}
		}
		//Printing
		for (int i = 0; i < people.length; i++) {
			System.out.print(people[i].getName() + ", ");
			System.out.println(people[i].getAge());
		}
		System.out.println("The longest name is " + maxName);
		System.out.println("The highest age is " + maxAge);

	}

}