package cmpe113;

import java.util.Scanner;

public class Q6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		int mid;
		System.out.print("Enter a string:");
		
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		if (s.length() % 2 == 0) {
			mid = s.length()/2;
		}
		else {
			mid = s.length()/2+1;
		}
		
		for (int i = s.length()-1; i >= mid; i--) {
			System.out.println(s.charAt(i));
		}
		
		for (int i = 0; i < mid; i++) {
			System.out.println(s.charAt(i));
		}
	}

}
