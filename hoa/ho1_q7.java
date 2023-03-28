package cmpe223;

import java.util.Arrays;

public class ho1_q7 {
	
/*
 * Write a static method that checks whether the given array of double values is
sorted in ascending order. 	
 */
	
	public static boolean boo(int arr[],int n){
		
		 boolean check=false;
		 
		 for(int i=0;i<arr.length-1;i++){
		 if(arr[i]<arr[i+1]){
		 check=true;
		 }
		 else 
			 check=false;
       }
		 
		 return check;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int array []= {6,7,8,9,0};
	
	System.out.println(boo(array,array.length));
	}
}
