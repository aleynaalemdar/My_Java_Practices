import java.util.Scanner;

public class Kuvvetler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);
		/*girilen say�ya kadar olan
		 * 2'nin kuvvetlerini ekrana yazd�ran program
		
		System.out.println("Say� giriniz.");
		int sayi = keyboard.nextInt();
		
		for (int i =1 ; i<=sayi ; i*=2) { //kuvvet bulmak i�in
		 System.out.println(i); 
		}
		
	*/	
//Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in
//kuvvetlerini ekrana yazd�ran program
		
		int sayi;
        System.out.print("Say� Giriniz.");
        sayi=keyboard.nextInt();
        System.out.println("4'un Katlari :");
        for (int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Katlari :");
        for (int i=1;i<=sayi;i*=5){
            System.out.println(i);
        }
		
	
		
		
	}

}
