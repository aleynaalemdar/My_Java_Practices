import java.util.Scanner;
public class KdvTutarı {
public static void main (String []args) {
	double tutar, oran_1 = 0.18 ;
    double oran_2 = 0.08, kdvliFiyat;  
    Scanner keyboard = new Scanner(System.in);  
    System.out.print("Lütfen tutarı giriniz:");
    tutar = keyboard.nextDouble();

     kdvliFiyat = tutar < 1000 ? (tutar * oran_1 + tutar) : (tutar * oran_2 + tutar);

    System.out.println("Tutarı giriniz: " + tutar);
   // System.out.println("1000 TL'ye kadar olan KDV Tutarı: " + oran_1 * tutar);
    System.out.println("1000 TL'ye kadar olan KDV Oranı: " + oran_1);
    //System.out.println("1000 TL ve sonrası için KDV Tutarı: " +  tutar * oran_2);
    System.out.println("1000 TL ve sonrası için KDV Oranı: " + oran_2);


    System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliFiyat);


	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}
