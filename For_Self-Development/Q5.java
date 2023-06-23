
public class Q5 {
/*
 * Write a Java code segment that finds the maximum, 
 * the minimum, and the average value of a one-dimensional array a[]
 *  of int values and prints these values as shown in Sample Output. Your code should work for arrays of arbitrary size.
 * 
 * 
 * 
 */
	public static void main (String [] args) {
		

    int[] a = {10, 5, 15, 2, 40, -6};
    
    int max = a[0];
    int min = a[0]; 
    double sum = 0;
    
    for (int i = 0; i < a.length; i++) {
    if (a[i] < min)
    	min = a[i];
    
    if (a[i] > max)
    	max = a[i];
       
    sum = sum + a[i];
        }
    
    double average = sum / a.length;
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    System.out.println("Average: " + average);
	
	
	
}
}