class Personel {

	String name;
	int age, dept_no;

	public Personel(String name, int age, int dept_no) {
		this.name = name;
		this.age = age;
		this.dept_no = dept_no;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getDept_no() {
		return dept_no;
	}

}

class Department {

	String name;
	int dept_no;

	public Department(String name, int dept_no) {
		this.name = name;
		this.dept_no = dept_no;
	}

	public String getName() {
		return name;
	}

	public int getDept_no() {
		return dept_no;
	}

}
public class Mar15_2022_Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personel staff[] = new Personel[3];
		staff[0] = new Personel("Alice", 21, 201);
		staff[1] = new Personel("Bob", 55, 101);
		staff[2] = new Personel("Chris", 33, 501);

		Department depo[] = new Department[3];
		depo[0]  = new Department("Marketing", 101);
		depo[1]  = new Department("HR", 501);
		depo[2]  = new Department("IT", 201);

		//Sorting
		for (int i = 0; i < staff.length; i++) { 
			for (int j = 0; j < staff.length; j++){
				if (staff[i].getDept_no() == depo[j].getDept_no()) {
					System.out.println(staff[i].getName() + ", " + staff[i].getAge() + ", " + depo[j].getName());
				}
			}
		}


	}

}
