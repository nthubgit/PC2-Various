
class Mammals {
	void call(){
		System.out.println("This is the Pets class");
	}
}

class Cats extends Mammals {
	void call() {
		System.out.println("This is the Cats class");
	}
}

class Dogs extends Mammals{
	void call() {
		System.out.println("This is the Dogs class");
	}

}
public class Pets{
public static void main(String[] args) {

	Mammals p0 = new Mammals();
	Mammals p1 = new Cats();
	Mammals p2 = new Dogs();
	p0.call();
	p1.call();
	p2.call();
}
}