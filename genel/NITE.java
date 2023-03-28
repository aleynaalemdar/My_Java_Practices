package cmpe113;
import java.util.Scanner;

public class NITE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower_limit = 0;
		int upper_limit = 100;
		int x, y = 0;
		
		System.out.print("Enter an integer x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if (lower_limit <= x && x <= upper_limit)
			y = x;
		else
			y = x + 1;
		
		System.out.println("Case 1 --> x: " + x + ", y: " + y);
	
		lower_limit = 0;
		upper_limit = 100;
		y = 0;
	
		if(lower_limit <= x) {
			if(x <= upper_limit)
				y = x;
		}
		else {
			y = x + 1;
		}
		System.out.println("Case 2 --> x: " + x + ", y: " + y);
	
	
		lower_limit = 0;
		upper_limit = 100;
		y = 0;
		
		if(lower_limit <= x) {
			if(x <= upper_limit)
				y = x;
			else 
				y = x + 1;
		} else {
			y = x + 1;
		}
	
		System.out.println("Case 3 --> x: " + x + ", y: " + y);
	 
	
	}

}