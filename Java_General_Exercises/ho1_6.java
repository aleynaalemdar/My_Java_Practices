package cmpe223;

import java.util.Arrays;
import java.util.Random;

public class ho1_6 {
/*
 * Write a static method to randomly shuffle
 *  the elements in an array of double
values
 */
	 static void shuffle (double arr [], int n) {

		Random rand =new Random();
			
			
			for (int i = 0; i < arr.length; i++) {
				int randomIndexToSwap = rand.nextInt(arr.length);
				double temp = arr[randomIndexToSwap];
				arr[randomIndexToSwap] = arr[i];
				arr[i] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double arr [] = {4.8,7.9,0,6};
	
		shuffle(arr,arr.length);
		
	}

}
