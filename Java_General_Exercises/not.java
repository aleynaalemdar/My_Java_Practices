import java.util.Scanner;
public class not {
  public static void main (String[]args) {
	// de�i�kenleri olu�tur
  int matematik , fizik,kimya, turkce ,tarih, muzik;
  //Scanner s�n�f�m�z� tan�mlad�k
  Scanner keyboard= new Scanner (System.in);
  // kullan�c�dan de�erleri al
  System.out.println("Matematik Notunuz : ");
  matematik=keyboard.nextInt();
  System.out.println("Fizik Notunuz : ");
  fizik=keyboard.nextInt();
  System.out.println("Kimya Notunuz : ");
  kimya=keyboard.nextInt();
  System.out.println("T�rk�e Notunuz : ");
  turkce=keyboard.nextInt();
  System.out.println("Tarih Notunuz : ");
  tarih=keyboard.nextInt();
  System.out.println("M�zik Notunuz : ");
  muzik=keyboard.nextInt();
  int toplam= matematik + fizik+ kimya + turkce + tarih + muzik;
  double ortalama = toplam /6.0;
  System.out.println("Ortalaman�z: " + ortalama);
  
  boolean gecme=(ortalama>60);
  boolean kalma=(ortalama<=60);
  
  // String de�i�ken = (kriter) ? "Kriter sa�lan�rsa ��kacak yaz�" : "Kriter sa�lanmazsa ��kacak yaz�" ;
  
  String durum = (gecme)? "S�n�f� Ge�ti" : 	"S�n�fta Kald�" ;
  System.out.println(durum);
  
	
   }
}