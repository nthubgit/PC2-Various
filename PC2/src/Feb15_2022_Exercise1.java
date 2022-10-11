abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank {
	void getBalance() {
		System.out.println("$100");
	}
}

class BankB extends Bank {
	void getBalance() {
		System.out.println("$150");
	}
}

class BankC extends Bank {
	void getBalance() {
		System.out.println("$200");
	}
}
public class Feb15_2022_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new BankA();
		Bank bank2 = new BankB();
		Bank bank3 = new BankC();

		bank1.getBalance();
		bank2.getBalance();
		bank3.getBalance();
	}

}
