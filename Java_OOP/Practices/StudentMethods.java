public class StudentMethods {
	
	public void sortGrade(Student [] s) {
		
		Student temp;
		int min_index;
		
		for (int i = 0; i < s.length; i++) {
			min_index = i;
			for (int j = i+1; j < s.length; j++) {
				if(s[min_index].getGrade() > s[j].getGrade()) {
					min_index = j;
				}
			}
			if(i != min_index) {
				temp = s[min_index];
				s[min_index] = s[i];
				s[i] = temp;
			}
		}
	}

	
	public void sortNumber(Student [] s) {
		
		int min_index;
		Student temp;
		
		for (int i = 0; i < s.length; i++) {
			min_index = i;
			for (int j = i+1; j < s.length; j++) {
				if(s[min_index].getNumber() > s[j].getNumber()) {
					min_index = j;
				}
			}
			
			if(i != min_index) {
				temp = s[min_index];
				s[min_index] = s[i];
				s[i] = temp;
			}
		}
	}
	
}
	