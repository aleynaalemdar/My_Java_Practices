import java.util.Scanner;
public class U�akBileti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Mesafeyi km t�r�nden giriniz : ");
		int km = keyboard.nextInt();
		
		System.out.print("Ya��n�z� giriniz : ");
		int yas = keyboard.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n"
				+ " , 2 => Gidi� D�n�� ):");
		int yt=keyboard.nextInt();
		if (!(yt==1)&& !(yt==2)){
			System.out.println("Hatal� Veri Girdiniz!");
		
		}
		
		///////////////////////////////////////////////////////////
		else if (yt==1) {
		
		if (km<=0) {
			System.out.println("Hatal� Veri Girdiniz!");
		}
		else {
			double normalTutar= km*0.10;
	
		if(yas<=0){
			System.out.println("Hatal� Veri Girdiniz!");
		}
		else if (12<=yas && yas<=24) {
		
			double fiyat=normalTutar-(normalTutar*(0.1));
			System.out.println("Toplam Tutar = " + fiyat);
			}
		else if (yas>65) {
			
		    double fiyat=normalTutar-(normalTutar*(0.3));
		    System.out.println("Toplam Tutar = " + fiyat);
			}
		else if (0<yas && yas<12) {
			
			double fiyat=normalTutar-(normalTutar*(0.5));
			System.out.println("Toplam Tutar = " + fiyat);
		}
		else {
			
			double fiyat=normalTutar;
			System.out.println("Toplam Tutar = " + fiyat);
		}
	}
		}
		///////////////////////////////////////////////////////
		
		else if (yt==2) {
			
			if (km<=0) {
				System.out.println("Hatal� Veri Girdiniz!");
			}
			else {
				double normalTutar= (km*0.10)*2;
				
		        double indirimOran�=(normalTutar*(0.20));
				
				double yeniFiyat=normalTutar-indirimOran�;
				
		
			if(yas<=0){
				System.out.println("Hatal� Veri Girdiniz!");
			}
			else if (12<=yas && yas<=24) {
			
				double di�er�o=(yeniFiyat*(0.1));
			   double enYeniFiyat = yeniFiyat-di�er�o;
				System.out.println("Toplam Tutar = " + enYeniFiyat);
				}
			else if (yas>65) {
				double di�er�o=(yeniFiyat*(0.3));
				   double enYeniFiyat = yeniFiyat-di�er�o;
					System.out.println("Toplam Tutar = " + enYeniFiyat);
			   
				}
			else if (0<yas && yas<12) {
				double di�er�o=(yeniFiyat*(0.5));
				   double enYeniFiyat = yeniFiyat-di�er�o;
					System.out.println("Toplam Tutar = " + enYeniFiyat);
				
			}
			else {
				
				double EnYeniFiyat=yeniFiyat;
				System.out.println("Toplam Tutar = " + EnYeniFiyat);
			}
		}
			}
		//////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
