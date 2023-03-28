import java.util.Scanner;
public class Q7 {
/*
 * 
 *  Write a Java program to find all pairs of elements in an array
 *   a[] of int values whose sum is equal to a specified number
 *   . The program prints these values as shown in Sample Output.
 *    Your code should work for arrays of arbitrary size.
 * 
 */
	
	
	public static void main (String args []) {
	
		int[] a = {2, 7, 4, -5, 11, 5, 20};
	
	Scanner keyboard=new Scanner (System.in);
		
	System.out.println("Enter a number:")	;
	int n= keyboard.nextInt();
    System.out.println("Pairs of elements with the sum "+n);
    int l = a.length;
		for (int i = 0 ; i<l ; i++ ) {
			for (int j=i+1; j<l ; j++) { //j=i+1 önemli!!!
				if (a[i]+a[j]==n) {
					System.out.println(a[i]+ "+" + a[j]+ " = " + n);
				}
			}
		}
    
		
		
		}}