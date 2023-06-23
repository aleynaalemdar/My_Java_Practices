import java.util.Scanner;
public class Taksimetre {
public static void main (String args []) {
	Scanner keyboard= new Scanner (System.in);
	System.out.println("Mesafeyi Km cinsinden giriniz.");
	int km = keyboard.nextInt();
	double a = (km*2.20) +10  ;
	double tutar = (a<20)?  20 : a ;
	System.out.println("Ödemeniz gereken ücret = "+ tutar +" TL'dir." );
	
	
	
	
	
	
	
}
}