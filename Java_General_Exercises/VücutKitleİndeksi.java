import java.util.Scanner;
public class VücutKitleÝndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner keyboard=new Scanner(System.in);
 System.out.println("Lütfen boyunuzu(metre cinsinde) giriniz : ");
 double boy = keyboard.nextDouble()	;
 System.out.println("Lütfen kilonuzu giriniz : ");
 double kilo = keyboard.nextInt();
 double vki=kilo/(boy*boy);
 
 System.out.println("Vücut Kitle Ýndeksiniz : " + vki);
	}

}
