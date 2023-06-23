
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * You are given an array a[] of int values.
 *  Write a Java program which finds the duplicate elements in a 
 *  given array. Assume that each element can occur either one time
 *   or two times. The program output is shown in Sample Output.
 *    Your code should work for arrays of arbitrary size.
 */
		//int[] a = {1, 5, 3, 18, 3, 25, 81, 1, 61}; 
		System.out.println("Duplicate values");
		
		/*for (int i = 0; i < a.length; i++) 
		{
		     for (int j =i+1; j < a.length; j++) 
		     {
		         if (a[i] == a[j]) 
		         {
		      System.out.println(a[i]); 
		         }
		     }
		}
		*/
		//eğer 2den fazla tekrar ediyorsa?
		
		//BULAMADIM SOR !!
		
		int[] a = {1, 5, 3, 18, 3, 25,1, 81, 1, 61};
		
		for (int i = 0; i < a.length; i++) {
			  
			   for (int j =0; j < a.length; j++) { //j=0 önemli!!
			   if (a[i] == a[j]) {
               System.out.println(a[i]);
			   }
		 }
			   }
			 
	

		
	}

}
