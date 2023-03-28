package cmpe113;

import java.util.Scanner;

public class WP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUM_GAMES = 12;
		
		int won;
		double ratio;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of games won (0 to " + NUM_GAMES + "): ");
		
		won = scan.nextInt();
		
		while (won < 0 || won > NUM_GAMES) {
			System.out.print("Invalid input. Please reenter: ");
			won = scan.nextInt();
		}
		
		ratio = (double) won / NUM_GAMES;
		System.out.println();
		System.out.println("Winning percentage: " + (ratio*100) + "%");
		

	}

}
