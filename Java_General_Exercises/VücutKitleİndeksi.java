import java.util.Scanner;
public class V�cutKitle�ndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner keyboard=new Scanner(System.in);
 System.out.println("L�tfen boyunuzu(metre cinsinde) giriniz : ");
 double boy = keyboard.nextDouble()	;
 System.out.println("L�tfen kilonuzu giriniz : ");
 double kilo = keyboard.nextInt();
 double vki=kilo/(boy*boy);
 
 System.out.println("V�cut Kitle �ndeksiniz : " + vki);
	}

}
