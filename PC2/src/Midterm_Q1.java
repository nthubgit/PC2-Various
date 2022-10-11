//Tyler Nelson 2195426 Midterm Q1

import java.util.Scanner;

//Parent class
class Store555 {
	public final double SALES_TAX_RATE = 0.06;
	private String name;

	public Store555(String name ){
		setName( name );
	}

	public String getName(){
		return name;
	}

	public void setName(String name ){
		this.name = name;
	}

	public String toString(){
		return("Name: " + name );
	}
}
//Child class
class MobileStore extends Store555{
	private int totalSales, totalHandsetsSold, averageHandsetSale;
	String topMonth;
	private int handsetsSold[] = new int[12];
	//Getters/setters
	public int getTotalHandsetsSold() {
		return totalHandsetsSold;
	}

	public void setTotalHandsetsSold(int totalHandsetsSold) {
		this.totalHandsetsSold = totalHandsetsSold;
	}

	public int getAverageHandsetSale() {
		return averageHandsetSale;
	}

	public void setAverageHandsetSale(int averageHandsetSale) {
		this.averageHandsetSale = averageHandsetSale;
	}

	public String getTopMonth() {
		return topMonth;
	}

	public void setTopMonth(String topMonth) {
		this.topMonth = topMonth;
	}
	
	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	//Constructor w/ inheritance
	public MobileStore(String name) {
		super(name);
		totalSales = 0;
		totalHandsetsSold = 0;
		averageHandsetSale = 0;
		topMonth = "null";
		handsetsSold = new int[12];
	}

	public void soldPerMonth (int i, int sale) {
		handsetsSold[i] = sale;
	}

	public void calcTotalSales() {
		int totalHandsetsSold = 0;
		for (int i = 0; i < handsetsSold.length; i++) {
			totalHandsetsSold += handsetsSold[i];
			this.totalHandsetsSold = totalHandsetsSold;
		}
	}
	public void calcTopSalesMonth() {
		int max = handsetsSold[0], month = 0;
		String topMonth = "null";
		for (int i = 0; i < handsetsSold.length; i++) {
			if (handsetsSold[i] > max) {
				max = handsetsSold[i];
				month = i;
			}
		}
		switch(month) {
		case 0:
			this.topMonth = "January";
			break;
		case 1:
			this.topMonth = "February";
			break;
		case 2:
			this.topMonth = "March";
			break;
		case 3:
			this.topMonth = "April";
			break;
		case 4:
			this.topMonth = "May";
			break;
		case 5:
			this.topMonth = "June";
			break;
		case 6:
			this.topMonth = "July";
			break;
		case 7:
			this.topMonth = "August";
			break;
		case 8:
			this.topMonth = "September";
			break;
		case 9:
			this.topMonth ="October";
			break;
		case 10:
			this.topMonth = "November";
			break;
		case 11:
			this.topMonth ="December";
			break;
		}
	}

	public int calcAverageSales() {
		this.averageHandsetSale = (totalSales / totalHandsetsSold);
		return averageHandsetSale;
	}
	public String toString() {
		return ("Name of store: " + getName() +
				"\nTotal sales: $" + getTotalSales() +
				"\nTotal Handsets Sold: " + getTotalHandsetsSold() +
				"\nAverage Handset Price: $" + getAverageHandsetSale() +
				"\nBest Month: " + getTopMonth());
	}
}
//Driver
public class Midterm_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardScanner = new Scanner(System.in);
		//Opening
		System.out.println("Hello. Enter the name of your Mobile Store.");
		String storeName = keyboardScanner.next();
		MobileStore m = new MobileStore(storeName);

		System.out.println("Enter the total sales for the year.");
		int annualSales = keyboardScanner.nextInt();
		m.setTotalSales(annualSales);
		for (int i = 0; i < 12; i++) {
			System.out.println("Enter the amount of handsets sold in month " + (i+1));
			int thisMonthSold = keyboardScanner.nextInt();
			m.soldPerMonth(i, thisMonthSold);
		}
		m.calcTotalSales();
		m.calcAverageSales();
		m.calcTopSalesMonth();
		System.out.println(m.toString());
		//Closing
		System.out.println("See you again, have a nice day.");
		keyboardScanner.close();
	}

}
