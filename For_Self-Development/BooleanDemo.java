package cmpe113;

import java.util.Scanner;

public class BooleanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter nonnegative numbers.");
		System.out.println("Place a negative number at the end");
		System.out.println("to serve as an end marker.");
		
		int sum = 0;
		boolean areMore = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(areMore)
		{
			int next = keyboard.nextInt();
			if (next < 0)
				areMore = false;
			else
				sum = sum + next;
		}
		System.out.println("The sum of numbers is " + sum);

	}

}
