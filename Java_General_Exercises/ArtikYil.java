import java.util.Scanner;
public class ArtikYil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard= new Scanner (System.in);
System.out.println("Yýl Giriniz : ");
int yil = keyboard.nextInt();

if ((yil%400==0)) {
System.out.println(yil + " bir artýk yýldýr ! ");
}


else if ((yil%4==0)&&!(yil%100==0)) {
System.out.println(yil + " bir artýk yýldýr ! ");
}
else {
	System.out.println(yil+ " bir artýk yýl deðildir !");
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
