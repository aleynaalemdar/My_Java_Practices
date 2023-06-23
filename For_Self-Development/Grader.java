package cmpe113;

import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade = 'I';
		
		System.out.println("Enter your score: ");
		Scanner keyboard = new Scanner(System.in);
		score = keyboard.nextInt();
		
		if (score > 100 || score < 0)
			System.out.println("Invalid score");
		else if (score >= 90) 
			grade = 'A';			
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		System.out.println("Score = " + score);
		System.out.println("Grade = " + grade);

	}

}
