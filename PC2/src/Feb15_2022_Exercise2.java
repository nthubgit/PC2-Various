//Need to make constructors and inherit the variables from the parent class

import java.util.Scanner;

abstract class Vehicle {
	abstract void show(String name, int wheels);
}
//Car class
class Car extends Vehicle {
	String name;
	int wheels, liters, horsepower;

	void show(String name, int wheels) {
		this.name = name;
		this.wheels = wheels;
		System.out.println("Name: " + name + "\nWheels: " + wheels + "\nLiters: " + liters + "\nHorsepower: " + horsepower);
	}

	void setLiters(int liters) {
		this.liters = liters;
	}

	int setHorsepower() {
		return liters * wheels;
	}
}
//Bike class
class Bike extends Vehicle {
	String name;
	int wheels;

	void show(String name, int wheels) {
		this.name = name;
		this.wheels = wheels;
		System.out.println("Name: " + name + "\nWheels: " + wheels);
	}
}
//Driver
public class Feb15_2022_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardScanner = new Scanner(System.in);
		int input, flag, wheels, liters;
		String name;
		System.out.println("1 - Bike, 2 - Car");
		input = keyboardScanner.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter name");
			name = keyboardScanner.next();
			System.out.println("Enter no. of wheels.");
			wheels = keyboardScanner.nextInt();
			Vehicle a = new Bike();
			a.show(name, wheels);
			break;
		case 2:
			System.out.println("Enter name");
			name = keyboardScanner.next();
			System.out.println("Enter no. of wheels.");
			wheels = keyboardScanner.nextInt();
			System.out.println("Enter no. of liters.");
			liters = keyboardScanner.nextInt();
			Vehicle b = new Car();
//			b.setLiters(liters);
			b.show(name, wheels);
			break;
		}

	}

}
