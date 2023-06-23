import java.util.Scanner;
public class ThrowAnahtarKelimesi {

	/*
	 * 
	 * istediğimiz zaman kendi exceptionlarımızı fırlatabiliriz.
	 * 
	 * 
	 */
	
	public static void mekankontrol(int yas) {
		if (yas < 18) {
			// exception oluşsun istiyorum.
			throw new ArithmeticException();//ÖNEMLİ !!!!!!!!!
		//	throw new ArrayIndexOutOfBoundsException(); //unreachable dedi
		}
		else {
			System.out.println("mekana hoşgeldiniz.");
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen yaşınızı giriniz.");
		int yas=scanner.nextInt();
		
			mekankontrol(yas);
		
	//BÖYLE YAPARSAN KODUN ÇALIŞMAZ!!! 
	 
	
	//çünkü exception fırlattın artık.
		System.out.println("ggg");
		/*
		 * Output=
		 * 
		 * Lütfen yaşınızı giriniz.
17
Exception in thread "main" java.lang.ArithmeticException
	at ThrowAnahtarKelimesi.mekankontrol(ThrowAnahtarKelimesi.java:14)
	at ThrowAnahtarKelimesi.main(ThrowAnahtarKelimesi.java:26)
		 * 
		 */

			//kodun çalışması için bunu yap=
			
			/*try {
				mekankontrol(yas);
			}
			catch(ArithmeticException e) {
				System.out.println("18 yaşından küçükler mekana giremez");
			}
		
			System.out.println("ggg");
		/*Output=
				Lütfen yaşınızı giriniz.
				17
				ggg
				18 yaşından küçükler mekana giremez
				ggg	*/
	}
	//throw anahtar kelimesi kendi istediğimiz zamanda exception fırlatmak için
}
