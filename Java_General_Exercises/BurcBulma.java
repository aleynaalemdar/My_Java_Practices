import java.util.Scanner;
public class BurcBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);

System.out.println("Doðduðunuz ayý giriniz.");
System.out.println("Ocak için 1,Þubat için 2, Mart için 3"); 
System.out.println("Nisan için 4"+",Mayýs için 5,Haziran için 6");
System.out.println("Temmuz için 7"+",Aðustos için 8,Eylül için 9");
System.out.println("Ekim için 10"+",Kasým için 11, Aralýk için 12 giriniz.");
	int ay =keyboard.nextInt()	;
	
	System.out.println("Doðduðunuz günü giriniz.");
	int gün = keyboard.nextInt();
	
	if(1<=ay && ay<=12) {{
	if (ay==1) {
		if (21<gün && gün<=31) {
			System.out.println("Kova burcusunuz.");}
		else if (1<=gün && gün<=21 ) {
				System.out.println("Oðlak burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	if (ay==2) {
		if (19<gün && gün<=28) {
			System.out.println("Balýk burcusunuz.");}
		else if (1<=gün && gün<=19 ) {
				System.out.println("Kova burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	if (ay==3) {
		if (20<gün && gün<=31) {
			System.out.println("Koç burcusunuz.");}
		else if (1<=gün && gün<=20 ) {
				System.out.println("Balýk burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	
	if (ay==4) {
		if (20<gün && gün<=30) {
			System.out.println("Boða burcusunuz.");}
		else if (1<=gün && gün<=20 ) {
				System.out.println("Koç burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==5) {
		if (21<gün && gün<=31) {
			System.out.println("Ýkizler burcusunuz.");}
		else if (1<=gün && gün<=21 ) {
				System.out.println("Boða burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==6) {
		if (22<gün && gün<=30) {
			System.out.println("Yengeç burcusunuz.");}
		else if (1<=gün && gün<=22 ) {
				System.out.println("Ýkizler burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==7) {
		if (22<gün && gün<=31) {
			System.out.println("Aslan burcusunuz.");}
		else if (1<=gün && gün<=22 ) {
				System.out.println("Yengeç burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==8) {
		if (22<gün && gün<=31) {
			System.out.println("Baþak burcusunuz.");}
		else if (1<=gün && gün<=22 ) {
				System.out.println("Aslan burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==9) {
		if (22<gün && gün<=30) {
			System.out.println("Terazi burcusunuz.");}
		else if (1<=gün && gün<=22 ) {
				System.out.println("Baþak burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==10) {
		if (22<gün && gün<=31) {
			System.out.println("Akrep burcusunuz.");}
		else if (1<=gün && gün<=22 ) {
				System.out.println("Terazi burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	
	if (ay==11) {
		if (21<gün && gün<=30) {
			System.out.println("Yay burcusunuz.");}
		else if (1<=gün && gün<=21 ) {
				System.out.println("Akrep burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	
	if (ay==12) {
		if (21<gün && gün<=31) {
			System.out.println("Oðlak burcusunuz.");}
		else if (1<=gün && gün<=21 ) {
				System.out.println("Yay burcusunuz.");}
		else {
			System.out.println("Günü hatalý girdiniz.");
		}
}
	}
	}
	else{
        System.out.println("Ayý yanlýþ girdiniz");}
	
	
	
	
	
	
	}
		
	
	}


