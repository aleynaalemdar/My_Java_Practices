public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("be", 1321, 55);
		Student s2 = new Student("ce", 5454, 75);
		Student s3 = new Student("ze", 6987, 88);
		Student s4 = new Student("me", 5648, 35);
		
		Student [] s = new Student[4];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		
		StudentMethods sm = new StudentMethods();
		
		sm.sortGrade(s);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println();
		
		sm.sortNumber(s);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
