class StudentX {
	
	private String name;
	private int avgMark;
	
	public StudentX (String name, int avgMark) {
		this.name = name;
		this.avgMark = avgMark;
	}

	public String getName() {
		return name;
	}

	public int getAvgMark() {
		return avgMark;
	}
	
	
	
}
public class Mar15_2022_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentX wintSemester[] = new StudentX[5];
		wintSemester[0] = new StudentX("Alice", 62);
		wintSemester[1] = new StudentX("David", 75);
		wintSemester[2] = new StudentX("Carol", 88);
		wintSemester[3] = new StudentX("John", 52);
		wintSemester[4] = new StudentX("Aaron", 94);
		StudentX temp = new StudentX("null", 0);
		
		//Ranking
		for (int i = 0; i < wintSemester.length; i++) {
			for (int j = 0; j < wintSemester.length - 1; j++)
			if (wintSemester[j].getAvgMark() < wintSemester[j+1].getAvgMark()) {
				temp = wintSemester[j];
				wintSemester[j] = wintSemester[j+1];
				wintSemester[j+1] = temp;
			}
		}
		//Printing
		for (int i = 0; i < wintSemester.length; i++) {
			System.out.print(wintSemester[i].getName() + ", ");
			System.out.println(wintSemester[i].getAvgMark());
		}
		
	}

}
