package java101;
import java.util.Scanner;
public class GelismisHesapMakinesi {

	static void sum () {
		
	Scanner keyboard = new Scanner (System.in);
	int number, result = 0, i = 1;
	
	while (true) {
        System.out.print(i++ + ". sayı :");
        number = keyboard.nextInt();
        if (number == 0) {
            break;
        }
        result += number;
    }
    System.out.println("Sonuç : " + result);
}
	
	
		static void subtract () {
			   Scanner scan = new Scanner(System.in);
		        System.out.print("Kaç adet sayı gireceksiniz :");
		        int counter = scan.nextInt();
		        int number, result = 0;

		        
		        for (int i = 1; i <= counter; i++) {
		            System.out.print(i + ". sayı :");
		            number = scan.nextInt();
		            if (i == 1) {
		                result += number;
		                continue;
		            }
		            result -= number;
		        }

		        System.out.println("Sonuç : " + result);
		    }
		        
		        
		
		static void multiply () {
			
			Scanner scan = new Scanner(System.in);
	        int number, result = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". sayı :");
	            number = scan.nextInt();

	            if (number == 1)
	                break;

	            if (number == 0) {
	                result = 0;
	                break;
	            }
	            result *= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }
			
			
		static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Kaç adet sayı gireceksiniz :");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayı :");
	            number = scan.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("Böleni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }
			
		
		static void power() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Taban değeri giriniz :");
	        int base = scan.nextInt();
	        System.out.print("Üs değeri giriniz :");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("Sonuç : " + result);
	    }       
		      
		
		static void factorial() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Sayı giriniz :");
	        int n = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        System.out.println("Sonuç : " + result);
	    }
     
		        
		    static void mod () {
		    	Scanner keyboard = new Scanner (System.in);

		    		int result=0;
		    		
		    	while (true) {
		    		System.out.println("İlk sayıyı giriniz.");
			    	int sayi=keyboard.nextInt();
		    		System.out.println("Mod alınacak sayiyi giriniz.");
		           int number = keyboard.nextInt();
		         
		    	if (number==0) {
		    		System.out.println("İkinci sayı 0 olamaz....");
		    		break;
		    	}
		    	result = sayi%number ;
		    	System.out.println("Sonuç : " + result);
		   }
	   }
		        

		    static void Area() {
		        Scanner scan = new Scanner(System.in);
		        while(true){
		            System.out.println(" dikey uzunluğu giriniz: ");
		            int x = scan.nextInt();
		            System.out.println("yatay uzunluğu giriniz: ");
		            int y = scan.nextInt();
		            if( x == 0 || y == 0) {
		                System.out.println("Uzunluk sıfır olamaz...");
		                break;
		            }
		            System.out.println("The area of rectangle is: "+ x*y );
		        }
		        }


	
	public static void main (String args []) {
	
	System.out.println("Gelismis hesap makinesine hoş geldiniz!");
	int islem;
	do {
	System.out.println("Lütfen işlem seçiniz...");
	System.out.println("1- Toplama İşlemi \n2- Çıkarma İşlemi \n3- Çarpma İşlemi \n"
			+ "4- Bölme İşlemi \n5- Üslü Sayı Hesaplama "
			+ "\n6- Faktöriyel Hesaplama \n7- Mod Alma "
			+ "\n8- Dikdörtgen Alan ve Çevre Hesabı ");
	System.out.println("0- Çıkış Yap");
		Scanner keyboard = new Scanner (System.in);
		islem = keyboard.nextInt();
		
		switch (islem) {
		case 1 : 
			
			sum();
			
			break;
			
		case 2 :
			
			subtract();
			
			break;
			
		case 3 :
			 
			multiply ();
			
			break;
			
       case 4 : 
			
    	   divided ();
    	   
			break;
		case 5 : 
			
			power ();
			
			break;
			
		case 6 :
			
			factorial();
			
			break;
			
        case 7 : 
			
		mod();
		
			break;
			
		case 8 :
			
			Area();
			
			break;
			
		case 0:
			
			System.out.println("Sistemden çıkış yapılıyor...");
			
			break;
		
		 default:
			 
       System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
       
       break;   }
		
	} while(islem !=0);
			
			
	
		
	}
	
	
}
