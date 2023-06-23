
public class Q1 {
public static void main (String []args) {
	
	/* Write a Java code segment that reverses 
	   the order of a one-dimensional array a[] of double values.
       Create another array to hold the result.

	 */

	
	double [] a = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5};
	 
	
	int N = a.length;
	
	double [] a_temp = new double[N];
	
	for (int i = 0; i < N; i++) {
	       a_temp[N-i-1] = a[i];
	   }
	
	   a = a_temp;
	   
	   
	   
	   for (int i = 0; i < N; i++) {
		   System.out.print(a[i] + " "); }
	
	
   }
}