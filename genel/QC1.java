package cmpe113;

import java.util.Scanner;

public class QC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean booleanVar;
		
		System.out.print("Enter a boolean value: ");
		Scanner keyboard = new Scanner(System.in);
		
		booleanVar = keyboard.nextBoolean();
		System.out.println("You entered " + booleanVar);
		
	}

}
