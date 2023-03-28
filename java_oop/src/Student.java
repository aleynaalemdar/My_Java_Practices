public class Student {
	
	private String name;
	private long number;
	private int grade;
	
	public Student (String n, long num, int g) {
		name = n;
		number = num;
		grade = g;
	}
	
	public String getName() {
		return name;
	}
	
	public long getNumber() {
		return number;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String toString() {
		return("Name: " + name + "\t" + "Number: " + number + "\t" + "Grade: " + grade);
	}

}
