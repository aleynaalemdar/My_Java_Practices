

import java.util.Scanner;
public class ucgendealan {
public static void main(String[]args) {
Scanner keyboard= new Scanner(System.in);
System.out.println("Üçgenin kenarlarýndan ilki için bir uzunluk giriniz.");
int kenar1=keyboard.nextInt();
System.out.println("Üçgenin kenarlarýndan ikincisi için bir uzunluk giriniz.");	
int kenar2=keyboard.nextInt();
System.out.println("Üçgenin kenarlarýndan üçüncüsü için bir uzunluk giriniz.");
int kenar3=keyboard.nextInt();	
int çevre = kenar1+kenar2+kenar3;
int x=çevre/2;
double alan = Math.sqrt((x)*(x-kenar1)* (x-kenar2)* (x-kenar3))	;
System.out.println("Üçgenin alaný= " + alan);
	
}
	
}
	