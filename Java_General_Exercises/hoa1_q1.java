package cmpe223;

public class hoa1_q1 {

	

		//write a static java method that returns the largest
		//element in a given integer array
		
		
	 static int largest() {
			 int arr[] = {3, 32, 5, 4, 2, 9};
			 int max = arr[0];
			 for (int i = 1; i < arr.length; i++) {
			 if (arr[i] > max) {
			 max = arr[i];
			 }
	 }
			 return max;
	 }
	
	 public static void main(String []args) {
		 
		System.out.println(largest());
		 
		 
     }
	

}