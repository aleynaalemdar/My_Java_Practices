package cmpe113;

import java.util.ArrayList;

public class Q9A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 1, 1, 5, 3, 1, 18, 15, 18, 3, 25, 81, 5, 18, 3, 61, 61, 61 };
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		

	
		boolean isDuplicate;
		boolean exit;
		
		for (int i = 0; i < a.length; i++) {
			isDuplicate = false;
			exit = false;
			
			for (int j = i+1; j < a.length && !isDuplicate; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
				}
			}

			for (int j = 0; j < b.size() && !exit; j++) {
				if(b.get(j) == a[i]) {
					exit = true;
				}	
			}
			
			if (!exit && isDuplicate) {
				b.add(a[i]);
			}
		}
		System.out.println(b);
	}	

}
