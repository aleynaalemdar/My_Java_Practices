import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2 ;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ýlk sayýyý giriniz : ");
		n1 = keyboard.nextInt();
		System.out.println("Ýkinci sayýyý giriniz : ");
		n2 = keyboard.nextInt();
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz : ");
		int select = keyboard.nextInt();
		System.out.println(select);
		switch (select) {
		case 1 :
			System.out.println("Toplam : " + (n1+n2));
		break;
		case 2 :
			System.out.println("Çýkarma : " + (n1-n2));
		break ;
		case 3 :
			System.out.println("Çarpma : " + (n1*n2));
		break ;
		case 4 :
			if (n2 != 0) {
			System.out.println("Bölme : " + (n1/n2));
			}
			else 
			{
				System.out.println("Bir sayý 0'a bölünemez.");
			}
			break ;
			default:
				System.out.println("Yanlýþ seçim yaptýnýz.Tekrar deneyiniz.");
	}
}
  }