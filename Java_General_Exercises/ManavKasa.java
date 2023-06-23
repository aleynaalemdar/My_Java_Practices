import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
	System.out.println("Armut Kaç Kilo ? " );
	int armut_kilo = keyboard.nextInt();
	System.out.println("Elma Kaç Kilo ? " );
	int elma_kilo = keyboard.nextInt();
	System.out.println("Domates Kaç Kilo ? " );
	int domates_kilo = keyboard.nextInt();	
	System.out.println("Muz Kaç Kilo ? " );	
	int muz_kilo = keyboard.nextInt();	
	System.out.println("Patlýcan Kaç Kilo ? " );	
	int patlýcan_kilo = keyboard.nextInt();
	double armut,elma,domates,muz,patlýcan;
	armut = 2.14;
	elma = 3.67;
	domates = 1.11;
	muz=0.95;
	patlýcan=5.00;
	double tutar = (armut*armut_kilo)+(elma*elma_kilo)+
	(domates*domates_kilo)+(muz*muz_kilo)+
	(patlýcan*patlýcan_kilo);
	System.out.println("Toplam Tutar : " + tutar + " TL");
	
	
	
	
	
	}
}
