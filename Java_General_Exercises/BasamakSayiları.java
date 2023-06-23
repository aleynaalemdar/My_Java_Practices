import java.util.Scanner;
public class BasamakSayilarý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner (System.in);
System.out.println("Bir sayý girin:");
int sayi=keyboard.nextInt();
int basamaksayisi=0;
int sum=0;
for ( int i =0 ; basamaksayisi<=sayi ; i++) {
  
      sum +=sayi%10;
      sayi=sayi/10;
     basamaksayisi++;
     
}	


System.out.println(sum);
System.out.println(basamaksayisi);

	
		

		
		
		
		
		
	}

}
