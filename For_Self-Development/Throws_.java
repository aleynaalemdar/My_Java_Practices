import java.io.IOException;
import java.util.Scanner;

public class Throws_ {
	//runtime exceptionlar checked exceptionlardır... java öngörmüyo
	
	//diğerleri unchecked kendin yakala
	


		
		public static void mekankontrol(int yas) throws IOException {
			if (yas < 18) {
				// exception oluşsun istiyorum.
				throw new IOException(); //checked olunca throws kullan!!
			}
			else {
				System.out.println("mekana hoşgeldiniz.");
			}
		}
		public static void main(String[] args) throws IOException {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Lütfen yaşınızı giriniz.");
			int yas=scanner.nextInt();
			try {
				mekankontrol(yas); //eğer mainin içine throws koyarsam olur
				//ama bu şekilde bırakırsam yine hata fırlar program çalışmaz
			}
			catch (IOException e) {
				System.out.println("g");
			}
			 // böyle kullanamazsın ! çünkü checked exception fırlatıyo
			// surround with try catch or add throws declaration
			System.out.println("ggg");
		
				try {
					mekankontrol(yas);
				}
				catch(IOException e) {
					System.out.println("18 yaşından küçükler mekana giremez");
				}
			
				System.out.println("ggg");
	/*	output=
				Lütfen yaşınızı giriniz.
				18
				ggg
				mekana hoşgeldiniz.
				ggg */

			
		}
		
}

