
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
	 * . Write a Java code segment that reverses 
	 * the order of a one-dimensional array a[]
	 *  of double values.
     Do not create another array to hold the result.
	 */
		
		
		double [] a = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5};
		
		int N = a.length;
		for (int i = 0; i < N/2; i++) {
		double temp = a[N-1-i]; a[N-1-i] = a[i];
		a[i] = temp;
		}
		for (int i = 0; i < N; i++) {
		System.out.print(a[i] + " "); 
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
