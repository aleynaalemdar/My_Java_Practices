package cmpe223;

public class ho1_q5 {
/*
 * Write a static Java method to reverse the elements of a given array,
 *  without
using the temporary array
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	
	static void reverse(int a[], int n) {
		 for (int i = 0; i < n / 2; i++) {
		 int t = a[i];
		 a[i] = a[n - i - 1];
		 a[n - i - 1] = t;
		 }
		} 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
