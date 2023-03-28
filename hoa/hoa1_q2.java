package cmpe223;

import java.util.Arrays;
/*
 * Write a static Java method that returns the second largest element in a given
integer array
 */
public class hoa1_q2 {

	static int secondlargest(int arr[]) {
		 int i, first, second;
		 Arrays.sort(arr);
		 int n=arr.length;
		 for (i = n - 2; i >= 0; i--) {
		 if (arr[i] != arr[n - 1]) {
		 return arr[i];
		 }
		 }
		 return arr[0];
		}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarray [] = {5,7,8,7};//arays.sort ters sıralıyo yani büyükten küçüğe 
		//yani yeni array şöyle oluyo = {8,7,7,5}
 secondlargest(myarray);
 System.out.println( secondlargest(myarray));
	
	}
}
