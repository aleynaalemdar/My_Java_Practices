import java.util.Scanner;

public class GirilenSay�yaKadarOlan {
public static void main (String []args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Say� Giriniz : ");
		int sayi = keyboard.nextInt();
		
		/*FOR �LE ��FT SAYILARI BULMAK
		  for (int i = 1 ; i<=sayi ; i++) {
			if (i%2==0) {
		System.out.println(i);
			}
		
		}
		*/
		
		/* WH�LE �LE ��FT SAYILARI BULMAK
		int i = 1;
		while (i<=sayi) {
			if (i%2==0) {
				System.out.println(i);}
			i++;
		}
		*/ 
		
		/* FOR �LE 3 VE 4 E B�L�NEN SAYILARIN ORTALAMASINI BULMAK
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
		
		//WH�LE �LE 3 VE 4E B�L�NEN SAYILARIN ORTALAMASINI BULMAK
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
