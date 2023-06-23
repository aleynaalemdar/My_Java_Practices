package lab01;
public class StudentList {

	public Student[] students;
	
	public StudentList() {
		students = new Student[0];
	}
	
	public void addStudent(Student arg) {
		
		// Add a student to students array.
		// Hint: You can use a temporary array that has length 
		// student.length + 1.
	}
	
	public void removeStudent(Student arg) {
		
		// Remove a student from students array.
		// Hint: You can use a temporary array that has length 
		// student.length - 1.

	}
	
	public int modifyID() {

		// Add 1000 to the ID value of students if it is less than 1003
		// Return the value of the biggest modified ID after addition
	}
	
	
	public String toString() {
		String a = "";
		for (int i=0;i<students.length;i++)
			a = a.concat(students[i].toString());
		return a;
	}
	
	
}