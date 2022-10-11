//Tyler Nelson 2195426 Midterm Q2

import java.util.Scanner;

//PARENT class
abstract class part {
	int partNumber, budget;
	abstract String checkBudget();
}
//CHILD Self-manufactured part
class SelfManufacturedPart extends part {
	private int cost, drawingNumber;
	//Constructor
	public SelfManufacturedPart(int pn, int bud, int cos, int dn) {
		// TODO Auto-generated constructor stub
		super.partNumber=pn;
		super.budget=bud;
		this.cost=cos;
		this.drawingNumber=dn;
	}
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDrawingNumber() {
		return drawingNumber;
	}

	public void setDrawingNumber(int drawingNumber) {
		this.drawingNumber = drawingNumber;
	}

	//Override
	public String checkBudget() {
		int flag;
		if (cost > super.budget) {
			flag = 1;
		}
		else {
			flag = 0;
		}
		if (flag == 1) {
			return "Over budget!";
		}
		else {
			return "Within budget!";
		}
	}
	
public String toString() {
	return ("Part number: " + super.partNumber +
			"\nDrawing number: " + this.drawingNumber +
			"\nCost: $" + this.cost +
			"\nBudget: " + checkBudget());
}
}

//CHILD Out sourced part
class OutsourcedPart extends part {
	private String supplierNames[] = new String[3];
	private int supplierPrices[] = new int[3];
	private int bestPrice;
	private String bestSeller;
	//Constructor
	public OutsourcedPart (int pn, int bud) {
		super.partNumber=pn;
		super.budget=bud;
		bestPrice = 0;
		bestSeller = "null";
	}
	//Finding best outsourced price
	public void setBestPriceBestSeller() {
		supplierNames = new String[] {"AppleCorp","BananaCorp","CoconutCorp"};
		supplierPrices = new int[] {599,699,499};
		int min = supplierPrices[0];
		int priceIndex = 0;
		for (int i = 0; i < 3; i++) {
			if (supplierPrices[i] < min) {
				min = supplierPrices[i];
				priceIndex = i;
			}
		}
		bestPrice = min;
		bestSeller = supplierNames[priceIndex];
	}
	//Override
	public String checkBudget() {
		int flag;
		if (bestPrice > budget) {
			flag = 1;
		}
		else {
			flag = 0;
		}
		if (flag == 1) {
			return "Over budget!";
		}
		else {
			return "Within budget!";
		}
	}
	public String toString() {
		return ("Part number: " + super.partNumber +
				"\nBest Supplier: " + this.bestSeller +
				"\nBest Price: $" + this.bestPrice +
				"\nBudget: " + checkBudget());
	}
}
//Driver
public class Midterm_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardScanner = new Scanner(System.in);
		int input, pn, bud, cos, dn;
		
		System.out.println("Hello. Would you like to 1- manufacture a part, or 2- outsource a part?");
		input = keyboardScanner.nextInt();
		//Self
		if (input ==1) {
			System.out.println("What is your desired part number?");
			pn = keyboardScanner.nextInt();
			System.out.println("What is your budget for this part?");
			bud = keyboardScanner.nextInt();
			System.out.println("What is cost for this part?");
			cos = keyboardScanner.nextInt();
			System.out.println("What is the drawing number for this part?");
			dn = keyboardScanner.nextInt();
			
			SelfManufacturedPart s = new SelfManufacturedPart(pn, bud, cos, dn);
			System.out.println(s.toString());
		}
		if (input ==2) {
			System.out.println("What is your desired part number?");
			pn = keyboardScanner.nextInt();
			System.out.println("What is your budget for this part?");
			bud = keyboardScanner.nextInt();
			
			OutsourcedPart o = new OutsourcedPart(pn, bud);
			o.setBestPriceBestSeller();
 			System.out.println(o.toString());
		}
		else {
			System.out.println("Invalid input!");
		}
		//Closing
		System.out.println("See you again, have a nice day!");
		keyboardScanner.close();
		}

}
