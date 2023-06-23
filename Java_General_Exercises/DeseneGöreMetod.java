package java101;
import java.util.Scanner;

public class DeseneGöreMetod {
	
	 static int p(int a,int b) {
	        if (a > b) {
	            return a;
	        } else {
	            System.out.print(a + " ");
	            return p(a + 5, b);
	        }
	    }
	 
	 
	static int n(int sayi) {
        if (sayi <= 0){
            return sayi;
        }
        else {
            System.out.print(sayi + " ");
            return n(sayi-5);
        }
    }

   
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Sayiyi giriniz : ");
            int number = input.nextInt();

            p(n(number),number);

            if (number == 0){
                break;
            }

            System.out.println("\nCikmak icin 0'i giriniz.");
        }

    }
}