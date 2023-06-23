import java.util.Scanner;

public class GirilenSayýyaKadarOlan {
public static void main (String []args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Sayý Giriniz : ");
		int sayi = keyboard.nextInt();
		
		/*FOR ÝLE ÇÝFT SAYILARI BULMAK
		  for (int i = 1 ; i<=sayi ; i++) {
			if (i%2==0) {
		System.out.println(i);
			}
		
		}
		*/
		
		/* WHÝLE ÝLE ÇÝFT SAYILARI BULMAK
		int i = 1;
		while (i<=sayi) {
			if (i%2==0) {
				System.out.println(i);}
			i++;
		}
		*/ 
		
		/* FOR ÝLE 3 VE 4 E BÖLÜNEN SAYILARIN ORTALAMASINI BULMAK
		  int sum =0;
		  double ort=0;
		  int sayac=0;
		  
		 for (int i = 0 ; i<=sayi ;i++) {
		if ((i%3==0)&&(i%4==0)&&(i!=0)) {
      
		  sayac++;
		  sum = sum+i;
		  ort=(double) sum/sayac;
		
		}
		 }
			
		 System.out.println(ort);
		*/
		
		//WHÝLE ÝLE 3 VE 4E BÖLÜNEN SAYILARIN ORTALAMASINI BULMAK
		 int sum =0;
		 double ort=0;
		 int sayac=0;
		 int i =0;
		 
		while (i<=sayi) {
			if ((i%3==0)&&(i%4==0)&&(i!=0)) {
			      
				  sayac++;
				  sum = sum+i;
				  ort=(double) sum/sayac;
				
				}
			i++;
		}
	System.out.println(ort);
		
		
		
		
		
 }

}
