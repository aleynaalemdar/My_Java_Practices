import java.util.Scanner;
public class Atm {
public static void main (String []args) {
	
	/*String userName, password;
    Scanner input = new Scanner(System.in);
    int right = 3;
    int balance = 1500;
    int select;
    while (right > 0) {
        System.out.print("Kullan�c� Ad�n�z :");
        userName = input.nextLine();
        System.out.print("Parolan�z : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
            do {
                System.out.println("1-Para yat�rma\n" +
                        "2-Para �ekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-��k�� Yap");
                System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                select = input.nextInt();
                if (select == 1) {
                    System.out.print("Para miktar� : ");
                    int price = input.nextInt();
                    balance += price;
                } else if (select == 2) {
                    System.out.print("Para miktar� : ");
                    int price = input.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                    }
                } else if (select == 3) {
                    System.out.println("Bakiyeniz : " + balance);
                }
            } while (select != 4);
            System.out.println("Tekrar g�r��mek �zere.");
            break;//�nemli durmas� ve tekrar sormamas� i�in
            
        } else {
            right--;
            System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
            } else {
                System.out.println("Kalan Hakk�n�z : " + right);
            }
        }
    }
	*/
	
    String kullanici_adi,sifre;
    Scanner keyboard=new Scanner(System.in);
    int bakiye= 1500;
    int hak =3;
    int secim;
	
	while (hak>0) {
	 
		System.out.print("Kullan�c� Ad�n�z :");
        kullanici_adi = keyboard.nextLine();
        System.out.print("Parolan�z : ");
        sifre = keyboard.nextLine();
        
     
      if (kullanici_adi.equals("aleynaalemdar") && sifre.equals("12345")) {
    	  System.out.println("Merhaba,sisteme ho�geldiniz");
    	  do {
      
      System.out.println("Yapmak istedi�iniz i�lemi se�iniz.");
      System.out.println("1-Para yat�rma\n" +
              "2-Para �ekme\n" +
              "3-Bakiye Sorgula\n" +
              "4-��k�� Yap");
        secim=keyboard.nextInt();
        
        switch (secim) {
        case 1 : 
        System.out.println("L�tfen yat�rmak istedi�iniz para miktar�n� giriniz");
        int miktar=keyboard.nextInt();
        bakiye=+miktar;	
        break;
        case 2: 
        System.out.println("L�tfen �ekmek istedi�iniz para miktar�n� giriniz");
        int miktar2=keyboard.nextInt();
        bakiye=-miktar2;	
        break;
        case 3: 
        System.out.println("Bakiyeniz="+bakiye);	
        break;
        }
      
      } while (secim!=4);
     System.out.println("Tekrar g�r��mek �zere.");
       break;//�nemli durmas� ve tekrar sormamas� i�in
	  }
	else {
         hak--;
         System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
         if (hak == 0) {
             System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
         } 
         else {
             System.out.println("Kalan Hakk�n�z : " + hak);
         }
       }    
             
	}   
  }
}