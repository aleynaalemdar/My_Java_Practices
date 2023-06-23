package cmpe113;
import java.util.Scanner;
public class NextLine {

	public static void main(String[] args) {

		int x;
		String s1, s2, s3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer followed by some text: ");
		x = sc.nextInt();
		s2 = sc.next(); // try removing this line and line #20 and observe the content of s1
		s1 = sc.nextLine();
		
		System.out.println("The integer you entered: " + x);
		System.out.println("The text following the integer input: " + "\"" + s2 + "\"");	
		System.out.println("The rest of the line: " + "\"" + s1 + "\"");
			
	
		
	}

}
