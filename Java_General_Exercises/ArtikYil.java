import java.util.Scanner;
public class ArtikYil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard= new Scanner (System.in);
System.out.println("Y�l Giriniz : ");
int yil = keyboard.nextInt();

if ((yil%400==0)) {
System.out.println(yil + " bir art�k y�ld�r ! ");
}


else if ((yil%4==0)&&!(yil%100==0)) {
System.out.println(yil + " bir art�k y�ld�r ! ");
}
else {
	System.out.println(yil+ " bir art�k y�l de�ildir !");
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
