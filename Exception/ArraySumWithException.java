package lab07;
import java.util.Scanner;
public class ArraySumWithException {

	static int sumArray(int myArray[])
    {
		if (myArray[0] <= 0)
            return 0;
		int remaining [] = new int [myArray.length-1];
	for ( int i = 1 ; i<myArray.length-1 ; i++) {
		remaining [i-1]= myArray[i];
	}
        return (sumArray(remaining) + myArray[0]);
        
    }
	
	
	 static void myMethod(int myArray[]) throws ContainsNegativeException {
		 
	   for (int i = 0 ;i<myArray.length;i++) {
			           if(myArray[i] < 0){
			        	   throw new ContainsNegativeException();
	        
	   //return 0;
	 }
	   }
	 }
	
	
	
	public static void main (String args []) throws ContainsNegativeException {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("How many numbers does the array contain?");
		int value = keyboard.nextInt();
		int myArray[]= new int [value];
		
		for (int i = 0 ; i<value ; i++) {
			System.out.println("Enter " + (i+1) + "th element:");
			myArray[i]=keyboard.nextInt();
			
		}
	/*	for (int i = 0; i<value;i++) {
			System.out.println(myArray[i]);
    }*/
		myMethod(myArray);
		
		System.out.println("The sum of the array elements is : "+sumArray(myArray));
		
	
	}
	
	
	
}