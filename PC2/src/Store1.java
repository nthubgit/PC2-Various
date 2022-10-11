
//Create a class encapsulating a bike store, which inherits from Store. 
//A bike store has the following additional attributes: the number of bicycle brands that it carries and whether it sponsors a bike club. 
//Code the constructor and the toString method of the new class. You also need to include a client class to test your code.


public class Store1 {

	public final double SALES_TAX_RATE = 0.06; 
	private String name; 

	public Store1(String name ){  
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
class BikeStore extends Store1{
	private int brandNumber, bClubFlag = 0;

	public BikeStore(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {

		BikeStore bs1 = new BikeStore("teststorename");
		bs1.toString();
	}
}