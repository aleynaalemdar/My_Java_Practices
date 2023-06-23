import java.util.Scanner;
public class EbobEkok {
public static void main(String[]args) {
	
	Scanner keyboard= new Scanner (System.in);
	System.out.println("Lütfen ebob ve ekoku hesaplanacak sayýlardan ilkini giriniz.");
	int sayi1=keyboard.nextInt();
	System.out.println("Lütfen ebob ve ekoku hesaplanacak sayýlardan ikincisini giriniz.");
	int sayi2=keyboard.nextInt();

    int ekok;
	int ebob =1;
	
	/*for (int k = sayi1 ; k>=1 ; k--) {
		if ((sayi1%k == 0 ) && (sayi2%k==0)) {
			ebob=k;
			break;
		}
	}
	
	 for (int j =1; j<=(sayi1*sayi2);j++) {
		 if ((j%sayi1 == 0 )&& (j%sayi2 == 0)) {
			System.out.println(j);
			break;
			}
	 }
	*/
	
	
	int k =sayi1;
	while (k>=1) {
		if ((sayi1%k == 0 ) && (sayi2%k==0)) {
			ebob=k;
			System.out.println("ebob= "+k);
			break;}
			k--;
	}
	
	
	ekok =1 ;
	int y =1;
	while (y<=sayi1*sayi2) {
		if (y%sayi1==0&&y%sayi2==0){
		
			System.out.println("ekok = " + y);
		break;
		}
		y++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}
