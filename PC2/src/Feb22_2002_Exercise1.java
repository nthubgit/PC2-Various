import javax.print.attribute.standard.Sides;

interface RegularPolygon{
	abstract int getNumSides();
	abstract int getSideLength();
}

class EquilateralTriangle implements RegularPolygon{
	private int sideLength;
	
	public EquilateralTriangle() {
		// TODO Auto-generated constructor stub
		sideLength = 25;
	}
	
	public int getNumSides() {
		return 3;
	}
	public int getSideLength() {
		return sideLength;
	}
	public int getPerimeter() {
		return (getNumSides() * getSideLength());
	}
	public void getInteriorAngle() {
		
	}
}

class Square implements RegularPolygon{
	private int sideLength;
	
	public Square() {
		// TODO Auto-generated constructor stub
		sideLength = 42;
	}
	
	public int getNumSides() {
		return 4;
	}
	public int getSideLength() {
		return sideLength;
	}
	public int getPerimeter() {
		return (getNumSides() * getSideLength());
	}
}

public class Feb22_2002_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square fourSideSquare = new Square();
		EquilateralTriangle threeSideTriangle  = new EquilateralTriangle();
		
		System.out.println("A square has " + fourSideSquare.getNumSides() + ".\n");
		System.out.println("Each side is " + fourSideSquare.getSideLength() + "cm.\n");
		System.out.println("The perimeter of the square is " + fourSideSquare.getPerimeter() + "cm.\n");
		
		System.out.println("A triangle has " + threeSideTriangle.getNumSides() + ".\n");
		System.out.println("Each side is " + threeSideTriangle.getSideLength() + "cm.\n");
		System.out.println("The perimeter of the triangle is " + threeSideTriangle.getPerimeter() + "cm.\n");
	}

}
