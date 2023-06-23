
public class Q8 {
	
/*
 * Write a Java program to find the number of occurrences 
 * of each element of an array a[] of int values.
 *  The program output is as shown in Sample Output.
 *   Your code should work for arrays of arbitrary size.
 */
	
	public static void main (String args []) {
	
		int[] a = {1, 1, 3, 81, 3, 25, 81, 1, 81};
		
		for (int i = 0; i < a.length; i++) {
		  int count = 0;
		   for (int j = 0; j < a.length; j++) { //j=0 önemli!!
		   if (a[i] == a[j])
			   count++;
		    }
		System.out.println(a[i] + ":" + count);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
   }
}