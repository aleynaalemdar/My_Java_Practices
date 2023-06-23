import java.util.Scanner;
public class ÜslüSayý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,k;
Scanner keyboard = new Scanner (System.in);
System.out.println("Üssü alýnacak sayýyý giriniz:");
n =keyboard.nextInt();
System.out.println("Üs olacak sayýyý giriniz:");
k =keyboard.nextInt();
//3^4= 3*3*3*3
		/*int i =1;		
		int toplam=1;
	while (i<=k) {
		toplam*=n;
		i++;
	}
		System.out.println(toplam);
		*/
    int toplam =1;
    for (int i =1; i<=k ; i++) {
    	
    	toplam*=n;
    }
		System.out.println(toplam);
		
		
		
		
	}

}
