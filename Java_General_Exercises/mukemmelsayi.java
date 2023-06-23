package java101;
import java.util.Scanner;
public class mukemmelsayi {
public static void main (String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	int sayi;
    int sum=0;
	

	System.out.println("Lütfen bir sayı giriniz:");
    sayi=keyboard.nextInt(); 
    
    
    for (int i = 1; i < sayi; i++) {
    	if (sayi % i == 0) {
            sum += i ;
        }
    }
    if (sum == sayi){ 
        System.out.println(sayi+" Mükemmel sayıdır.");
    }else {
        System.out.println(sayi+" Mükemmel sayı değildir.");
	 
	}
    
	
	

	
	
	
	
	
	
	
 }
}