

import java.util.Scanner;
public class ucgendealan {
public static void main(String[]args) {
Scanner keyboard= new Scanner(System.in);
System.out.println("��genin kenarlar�ndan ilki i�in bir uzunluk giriniz.");
int kenar1=keyboard.nextInt();
System.out.println("��genin kenarlar�ndan ikincisi i�in bir uzunluk giriniz.");	
int kenar2=keyboard.nextInt();
System.out.println("��genin kenarlar�ndan ���nc�s� i�in bir uzunluk giriniz.");
int kenar3=keyboard.nextInt();	
int �evre = kenar1+kenar2+kenar3;
int x=�evre/2;
double alan = Math.sqrt((x)*(x-kenar1)* (x-kenar2)* (x-kenar3))	;
System.out.println("��genin alan�= " + alan);
	
}
	
}
	