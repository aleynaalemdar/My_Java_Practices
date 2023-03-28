package cmpe113;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int success;
		char grade;
		
		System.out.print("Enter a letter: ");
		Scanner sc = new Scanner(System.in);
		grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent grade");
			success = 1;
			break;
		case 'B':
			System.out.println("Very good grade");
			success = 1;
			break;
		case 'C':
			System.out.println("Good grade");
			success = 1;
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low grade");
			success = 0;
			break;
		default:
			System.out.println("Invalid grade");
			success = -1;
		//	break;
		}
		
		if (success == 1) {
			System.out.println("Passed");
		}
		else if (success == 0) {
			System.out.println("Failed");
		}
		else {
			System.out.println("No decision made");
		}
	}

}
