package cmpe113;
import java.util.Scanner;

public class NextLineP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		int n;
		String s1, s2, s3, input;

		input = "42\nand don't you\nforget it.";
		Scanner keyboard = new Scanner(input);
		
		n = keyboard.nextInt();
		s3 = keyboard.nextLine(); // reads the empty string at the end of the line left by the above nextInt command
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		
		System.out.println("n is " + n);
		System.out.println("s3 is " + "\"" + s3 + "\"");
		System.out.println("s1 is " + "\"" + s1 + "\"");
		System.out.println("s2 is " + "\"" + s2 + "\"");

	}

}
