import javax.print.attribute.standard.PrinterInfo;

public class Television {

	private String brand;
	private int price;

	//Constructors
	public Television (String newBrand, int newPrice) {
		brand = newBrand;
		price = newPrice;
	}

	public Television () {
		
	}
	//Getters/Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//toString
	public String toString () {
		return "Brand: " + getBrand() +
				"\nPrice: $" + getPrice();
	}
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television firstTV = new Television();
		firstTV.setBrand("Toshiba");
		firstTV.setPrice(50);
		System.out.println(firstTV.toString());
	}

}
