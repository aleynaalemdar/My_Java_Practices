import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
	System.out.println("Armut Ka� Kilo ? " );
	int armut_kilo = keyboard.nextInt();
	System.out.println("Elma Ka� Kilo ? " );
	int elma_kilo = keyboard.nextInt();
	System.out.println("Domates Ka� Kilo ? " );
	int domates_kilo = keyboard.nextInt();	
	System.out.println("Muz Ka� Kilo ? " );	
	int muz_kilo = keyboard.nextInt();	
	System.out.println("Patl�can Ka� Kilo ? " );	
	int patl�can_kilo = keyboard.nextInt();
	double armut,elma,domates,muz,patl�can;
	armut = 2.14;
	elma = 3.67;
	domates = 1.11;
	muz=0.95;
	patl�can=5.00;
	double tutar = (armut*armut_kilo)+(elma*elma_kilo)+
	(domates*domates_kilo)+(muz*muz_kilo)+
	(patl�can*patl�can_kilo);
	System.out.println("Toplam Tutar : " + tutar + " TL");
	
	
	
	
	
	}
}
