package cmpe113;
import java.util.Scanner;

public class BMSDW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, number;
		System.out.print("Enter a number: ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		
		count = 1;
		do 
		{
			System.out.print(count + ", ");
			count++;
		} while (count <= number);
		
		System.out.println();
		System.out.println("Buckle my shoe.");
	}

}
