package cmpe113;
public class Q10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 100, 5, 31, 3, 25, 81, 1, 12, 14, 0, 61, 0, 14 };

		int min, min_ind, temp;
		
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			min_ind = i;
			
			for (int j = i+1; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
					min_ind = j;
				}
			}
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			
			if (i != min_ind) {
				temp = a[i];
				a[i] = min;
				a[min_ind] = temp;
				
			}
			

		}
		
		
	}

}
