import java.util.Scanner;

public class Kuvvetler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);
		/*girilen sayýya kadar olan
		 * 2'nin kuvvetlerini ekrana yazdýran program
		
		System.out.println("Sayý giriniz.");
		int sayi = keyboard.nextInt();
		
		for (int i =1 ; i<=sayi ; i*=2) { //kuvvet bulmak için
		 System.out.println(i); 
		}
		
	*/	
//Java döngüler ile girilen sayýya kadar olan 4 ve 5'in
//kuvvetlerini ekrana yazdýran program
		
		int sayi;
        System.out.print("Sayý Giriniz.");
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
