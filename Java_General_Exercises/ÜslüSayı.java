import java.util.Scanner;
public class �sl�Say� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,k;
Scanner keyboard = new Scanner (System.in);
System.out.println("�ss� al�nacak say�y� giriniz:");
n =keyboard.nextInt();
System.out.println("�s olacak say�y� giriniz:");
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
