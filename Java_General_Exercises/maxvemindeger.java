package java101;
import java.util.Scanner;
public class maxvemindeger {
public static void main (String []args) {
	
Scanner keyboard= new Scanner (System.in);
System.out.println("Kaç tane sayı gireceksiniz?");
int sayi= keyboard.nextInt();

int counter , min =0 , max =0;

for (int i =1 ; i<=sayi ; i++) {
System.out.println(i+". Sayıyı giriniz: ");
int number = keyboard.nextInt();


if (i == 1) {
    max = number;
    min = number;
  
}


if (number > max) {
    max = number;
   
}
if (number < min) {
    min = number;
    
}
 
}
	

System.out.println("En buyuk sayi: " + max);
System.out.println("En kucuk sayi: " + min);	
	
	
	
 }
	
}
