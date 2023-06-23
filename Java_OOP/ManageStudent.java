package lab01;

public class ManageStudent {

	public static void main(String[] args) {

		Student a = new Student("Mert", "Computer Engineering", 1001);
		Student b = new Student("Egemen", "Computer Engineering", 1002);
		Student c = new Student("Enes", "Software Engineering", 1003);
		Student d = new Student("Mustafa", "Software Engineering", 1004);

		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
		System.out.println('\n');
		
		a.capitalizeDepartment('e');
		System.out.print(a);

		b.capitalizeDepartment('E');
		System.out.print(b);
		
		System.out.println(c.searchDepartment("Engineering"));
		System.out.println(d.searchDepartment("Computer"));
		
		System.out.println("\n");

	}

}