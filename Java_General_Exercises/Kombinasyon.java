import java.util.Scanner;
public class Kombinasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Küme kaç elemanlý?");
/*FAKTÖRÝYEL
int sayi=keyboard.nextInt();
int total =1 ;
		for ( int i=1 ; i<=sayi; i++) {
		total=total*i;
		}
		System.out.println("Faktöriyel:"+total);
		*/

		int N=keyboard.nextInt();
		System.out.println("Oluþturulcak gruplar kaç elemanlý?");		
		int r = keyboard.nextInt();
		
		int nfak=1;
        for (int i =1 ; i<=N ; i++) {
        	nfak=nfak*i;
        }
        
		int rfak=1;
		 for (int i =1 ; i<=r ; i++) {
	        	rfak=rfak*i;
	        }
		
		int afak=1;
		for (int i =1 ; i<=(N-r) ; i++) {
			afak=afak*i;
		}
		 
		int formül = nfak/(rfak*afak);
		 
		 
		System.out.println(formül);
		 
		 
		 
		 
	}

}
