package java101;
import java.util.Scanner;
public class tersucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		System.out.println("basamak sayısı girin.");
		
		int sayi = keyboard.nextInt();
		
		for (int i = 0 ; i<=sayi; i++) {
			for (int k =0 ; k<=i ;k++) {
		
			System.out.print(" ");
      }
			for (int j =2*sayi-1; j >2*i; j--) {
                System.out.print("*");
			
		}
		System.out.println();
		}
		
	
		
		
		
	}

}
