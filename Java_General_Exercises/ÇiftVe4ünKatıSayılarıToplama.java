import java.util.Scanner;
public class �iftVe4�nKat�Say�lar�Toplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);
		
		
	/*	Java d�ng�ler ile negatif bir de�er girilene kadar 
	 *  kullan�c�dan giri�leri kabul eden ve girilen
	 *  de�erlerden tek say�lar� toplay�p ekrana basan
	 *  program */
		
	 /*  int sayi;
	   int toplam=0;
	   
		do  {
			
			System.out.println("Say� giriniz.");
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
		System.out.println("Say� giriniz.");
		 sayi=keyboard.nextInt();
		if (sayi%4==0) {
			toplam+=sayi;
		}
		
		} while (sayi%2==0);
		
		System.out.println("Toplam = "+toplam);
		
		
		
	}		
		
	}


