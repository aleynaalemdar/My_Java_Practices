import java.util.Scanner;
public class not {
  public static void main (String[]args) {
	// deðiþkenleri oluþtur
  int matematik , fizik,kimya, turkce ,tarih, muzik;
  //Scanner sýnýfýmýzý tanýmladýk
  Scanner keyboard= new Scanner (System.in);
  // kullanýcýdan deðerleri al
  System.out.println("Matematik Notunuz : ");
  matematik=keyboard.nextInt();
  System.out.println("Fizik Notunuz : ");
  fizik=keyboard.nextInt();
  System.out.println("Kimya Notunuz : ");
  kimya=keyboard.nextInt();
  System.out.println("Türkçe Notunuz : ");
  turkce=keyboard.nextInt();
  System.out.println("Tarih Notunuz : ");
  tarih=keyboard.nextInt();
  System.out.println("Müzik Notunuz : ");
  muzik=keyboard.nextInt();
  int toplam= matematik + fizik+ kimya + turkce + tarih + muzik;
  double ortalama = toplam /6.0;
  System.out.println("Ortalamanýz: " + ortalama);
  
  boolean gecme=(ortalama>60);
  boolean kalma=(ortalama<=60);
  
  // String deðiþken = (kriter) ? "Kriter saðlanýrsa çýkacak yazý" : "Kriter saðlanmazsa çýkacak yazý" ;
  
  String durum = (gecme)? "Sýnýfý Geçti" : 	"Sýnýfta Kaldý" ;
  System.out.println(durum);
  
	
   }
}