package cmpe113;
import java.util.Scanner;

public class GasMilage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miles;
		double gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles / gallons;
		
		System.out.println("Miles Per Gallon: " + mpg);
		
	}

}