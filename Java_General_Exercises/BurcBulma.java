import java.util.Scanner;
public class BurcBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);

System.out.println("Do�du�unuz ay� giriniz.");
System.out.println("Ocak i�in 1,�ubat i�in 2, Mart i�in 3"); 
System.out.println("Nisan i�in 4"+",May�s i�in 5,Haziran i�in 6");
System.out.println("Temmuz i�in 7"+",A�ustos i�in 8,Eyl�l i�in 9");
System.out.println("Ekim i�in 10"+",Kas�m i�in 11, Aral�k i�in 12 giriniz.");
	int ay =keyboard.nextInt()	;
	
	System.out.println("Do�du�unuz g�n� giriniz.");
	int g�n = keyboard.nextInt();
	
	if(1<=ay && ay<=12) {{
	if (ay==1) {
		if (21<g�n && g�n<=31) {
			System.out.println("Kova burcusunuz.");}
		else if (1<=g�n && g�n<=21 ) {
				System.out.println("O�lak burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	if (ay==2) {
		if (19<g�n && g�n<=28) {
			System.out.println("Bal�k burcusunuz.");}
		else if (1<=g�n && g�n<=19 ) {
				System.out.println("Kova burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	if (ay==3) {
		if (20<g�n && g�n<=31) {
			System.out.println("Ko� burcusunuz.");}
		else if (1<=g�n && g�n<=20 ) {
				System.out.println("Bal�k burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	
	if (ay==4) {
		if (20<g�n && g�n<=30) {
			System.out.println("Bo�a burcusunuz.");}
		else if (1<=g�n && g�n<=20 ) {
				System.out.println("Ko� burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==5) {
		if (21<g�n && g�n<=31) {
			System.out.println("�kizler burcusunuz.");}
		else if (1<=g�n && g�n<=21 ) {
				System.out.println("Bo�a burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==6) {
		if (22<g�n && g�n<=30) {
			System.out.println("Yenge� burcusunuz.");}
		else if (1<=g�n && g�n<=22 ) {
				System.out.println("�kizler burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==7) {
		if (22<g�n && g�n<=31) {
			System.out.println("Aslan burcusunuz.");}
		else if (1<=g�n && g�n<=22 ) {
				System.out.println("Yenge� burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==8) {
		if (22<g�n && g�n<=31) {
			System.out.println("Ba�ak burcusunuz.");}
		else if (1<=g�n && g�n<=22 ) {
				System.out.println("Aslan burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==9) {
		if (22<g�n && g�n<=30) {
			System.out.println("Terazi burcusunuz.");}
		else if (1<=g�n && g�n<=22 ) {
				System.out.println("Ba�ak burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==10) {
		if (22<g�n && g�n<=31) {
			System.out.println("Akrep burcusunuz.");}
		else if (1<=g�n && g�n<=22 ) {
				System.out.println("Terazi burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	
	if (ay==11) {
		if (21<g�n && g�n<=30) {
			System.out.println("Yay burcusunuz.");}
		else if (1<=g�n && g�n<=21 ) {
				System.out.println("Akrep burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	
	if (ay==12) {
		if (21<g�n && g�n<=31) {
			System.out.println("O�lak burcusunuz.");}
		else if (1<=g�n && g�n<=21 ) {
				System.out.println("Yay burcusunuz.");}
		else {
			System.out.println("G�n� hatal� girdiniz.");
		}
}
	}
	}
	else{
        System.out.println("Ay� yanl�� girdiniz");}
	
	
	
	
	
	
	}
		
	
	}


