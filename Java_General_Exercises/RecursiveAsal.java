package java101;
import java.util.Scanner;
public class RecursiveAsal {

	/*
		int sayi = scan.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
		 //NORMALDE ASAL SAYI BULMAK İÇİN
		
		 */
		
	private static int isPrime(int sayi, int i) {
        if (i==1){
            return 1;
        }else {
            if (sayi%i==0){
                return 0;
            }
            else return isPrime(sayi,i-1);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, prime ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        number= scanner.nextInt();

        prime=isPrime(number,number/2);

        if (prime==1){
            System.out.println(number+" sayisi asaldir");
        }else {
            System.out.println(number+" sayisi asal değildir");
        }
    }
		
		
		
		
		
		
		
		

	}


