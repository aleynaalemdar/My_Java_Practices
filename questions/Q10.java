
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
	 * You are given an array a[] of int values.
	 *  Write a Java program which sorts the array elements in 
	 *  increasing order using selection sort algorithm.
	 *   Your code should work for arrays of arbitrary size.
	 *   
The selection sort algorithm sorts an array by repeatedly
finding the minimum element from unsorted part and putting 
it at the beginning. 
The algorithm maintains two subarrays in a
given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element from the
unsorted subarray is picked and moved to the sorted subarray.
	 * 
	 * 
	 * 	
	 */
		//SELECTION SORT ALGORITHM
		
		int[] a = {100, 5, 31, 18, 3, 25, 81, 1, 61};
		
		for (int i = 0; i < a.length; i++) {
			
		     int minInd = i;
		     
		     for (int j = i+1; j < a.length; j++)
		      {
		       if (a[j] < a[minInd]) 
		       {
		         minInd = j; }
		       }
		      if (minInd != i) 
		      {
		      int temp = a[i];
		      a[i] = a[minInd]; 
		      a[minInd] = temp;
		      }
		      
		   }
		for (int i = 0; i < a.length; i++)
		{
		System.out.print(a[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
