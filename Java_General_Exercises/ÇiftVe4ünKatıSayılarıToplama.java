import java.util.Scanner;
public class ÇiftVe4ünKatýSayýlarýToplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);
		
		
	/*	Java döngüler ile negatif bir deðer girilene kadar 
	 *  kullanýcýdan giriþleri kabul eden ve girilen
	 *  deðerlerden tek sayýlarý toplayýp ekrana basan
	 *  program */
		
	 /*  int sayi;
	   int toplam=0;
	   
		do  {
			
			System.out.println("Sayý giriniz.");
			 sayi=keyboard.nextInt();
			
			if((sayi%2==1)) {
				toplam+=sayi;
				
		}
			
	   } while (sayi>0); 
	
		
		System.out.println(toplam);
		*/
		
		int sayi;
		int toplam=0;
		do {
		System.out.println("Sayý giriniz.");
		 sayi=keyboard.nextInt();
		if (sayi%4==0) {
			toplam+=sayi;
		}
		
		} while (sayi%2==0);
		
		System.out.println("Toplam = "+toplam);
		
		
		
	}		
		
	}


