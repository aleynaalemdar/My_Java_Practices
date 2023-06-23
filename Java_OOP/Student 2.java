package lab01;


public class Student {

	private String name;
	private String department;
	private int ID;
	
	public Student(String name, String department, int ID) {
		
		this.name = name;
		this.department = department;
		this.ID = ID;
	}
	
	// Implement getters and setters
	
	public void capitalizeDepartment(char theLetter) {
		
		// check if theLetter is a  lowercase letter and 
		// if it is a lowercase letter modify the department variable so that
		// all the occurrences of theLetter is uppercase.
	}
	
	public String searchDepartment(String sub) {

		//check if sub is a substring of the department variable
		//If it is a substring, return the string that contains all the characters
		//until the start of the sub.
		//If it is not a substring, transform department to all uppercase letters and return it.
		// Do not modify the department variable.
	}
	
	public String toString() {

		// Return a string that contains all the information about the student.
	}
}