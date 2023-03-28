import java.io.IOException;
import java.util.Scanner;
public class Main_for_invalid {
 public static void mekankontrol(int yas) throws InvalidAgeException {
	 if (yas<18) {
		 throw new InvalidAgeException("hh"); //içine mesaj aldı
		 
	 }
	 else {
		 System.out.println("Mekana hoşgeldiniz.");
	 }
		 
 }
 // CHECKED EXCEPTION FIRLATIOASAN THROWS EKLEMEYİ UNUTMAAAAAA
   public static void main(String[] args)  {
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Yaşınızı giriniz.");
	   int yas= scanner.nextInt();
	   
	 /*  try {
	  mekankontrol(yas);
	   }
	   catch (InvalidAgeException e) {
System.out.println("b");
		  e.printStackTrace();
		  System.out.println(e);
	
   }*/
	 
		   try {
			mekankontrol(yas);
		} 
		   catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   

		   
	   
	   /* output=
			   Yaşınızı giriniz.
			   17
			   b
			   Bu bir invalid age hatasıdır... 
			   InvalidAgeException: hh age
*/
 }
}
