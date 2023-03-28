package lab01;


public class ManageStudent2 {

	public static void main(String[] args) {

		Student a = new Student("Mert", "Computer Engineering", 1001);
		Student b = new Student("Egemen", "Computer Engineering", 1002);
		Student c = new Student("Enes", "Software Engineering", 1003);
		Student d = new Student("Mustafa", "Software Engineering", 1004);
		
		StudentList theList = new StudentList();
		theList.addStudent(a);
		theList.addStudent(b);
		theList.addStudent(c);
		theList.addStudent(d);

		System.out.println(theList);
		
		Student e = new Student("Nazli", "Electrical Engineering", 2000);
		theList.addStudent(e);
		System.out.println("The biggest modified value: " + theList.modifyID());
		theList.removeStudent(c);
		System.out.println(theList);

	}

}