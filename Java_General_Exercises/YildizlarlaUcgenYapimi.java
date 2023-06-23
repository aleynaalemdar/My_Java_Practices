import java.util.Scanner;
public class YildizlarlaUcgenYapimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Bir sayý giriniz.");
	int sayi=keyboard.nextInt();	
		
		for (int i=1 ;i<=sayi ; i++ ) {
			for (int j=1 ; j<=(sayi-i);j++) {
			System.out.print(" ");	
			}
			for (int k = 1; k<=(2*i-1); k++) {
		System.out.print("*");
			
		}
				System.out.println();
			}
		
	

		for (int i=sayi-1 ;i>=0 ; i-- ) {
			for (int j=1 ; j<=(sayi-i);j++) {
			System.out.print(" ");	
			}
			for (int k = 1; k<=(2*i-1); k++) {
		System.out.print("*");
			
		}
				System.out.println();
			}
		
		
		
	}

}
