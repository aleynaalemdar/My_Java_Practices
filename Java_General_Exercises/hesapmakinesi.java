import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2 ;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("�lk say�y� giriniz : ");
		n1 = keyboard.nextInt();
		System.out.println("�kinci say�y� giriniz : ");
		n2 = keyboard.nextInt();
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iminiz : ");
		int select = keyboard.nextInt();
		System.out.println(select);
		switch (select) {
		case 1 :
			System.out.println("Toplam : " + (n1+n2));
		break;
		case 2 :
			System.out.println("��karma : " + (n1-n2));
		break ;
		case 3 :
			System.out.println("�arpma : " + (n1*n2));
		break ;
		case 4 :
			if (n2 != 0) {
			System.out.println("B�lme : " + (n1/n2));
			}
			else 
			{
				System.out.println("Bir say� 0'a b�l�nemez.");
			}
			break ;
			default:
				System.out.println("Yanl�� se�im yapt�n�z.Tekrar deneyiniz.");
	}
}
  }