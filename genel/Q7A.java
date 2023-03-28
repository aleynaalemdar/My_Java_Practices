package cmpe113;

import java.util.Scanner;

public class Q7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {2, 7, 4, -5, 11, 5, 20};
		
		int number;
		boolean noMatch;
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		noMatch = false;

		for (int i = 0; i < a.length; i++) {			
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == number) {
					System.out.println(number + " = " + a[i] + " + " + a[j]);
					noMatch = true;
				}
				
			}
		}
		if(!noMatch)
			System.out.println("No match found!");

	}

}
