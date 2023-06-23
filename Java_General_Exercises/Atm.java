import java.util.Scanner;
public class Atm {
public static void main (String []args) {
	
	/*String userName, password;
    Scanner input = new Scanner(System.in);
    int right = 3;
    int balance = 1500;
    int select;
    while (right > 0) {
        System.out.print("Kullanýcý Adýnýz :");
        userName = input.nextLine();
        System.out.print("Parolanýz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
            do {
                System.out.println("1-Para yatýrma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çýkýþ Yap");
                System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                select = input.nextInt();
                if (select == 1) {
                    System.out.print("Para miktarý : ");
                    int price = input.nextInt();
                    balance += price;
                } else if (select == 2) {
                    System.out.print("Para miktarý : ");
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
            System.out.println("Tekrar görüþmek üzere.");
            break;//önemli durmasý ve tekrar sormamasý için
            
        } else {
            right--;
            System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
            } else {
                System.out.println("Kalan Hakkýnýz : " + right);
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
	 
		System.out.print("Kullanýcý Adýnýz :");
        kullanici_adi = keyboard.nextLine();
        System.out.print("Parolanýz : ");
        sifre = keyboard.nextLine();
        
     
      if (kullanici_adi.equals("aleynaalemdar") && sifre.equals("12345")) {
    	  System.out.println("Merhaba,sisteme hoþgeldiniz");
    	  do {
      
      System.out.println("Yapmak istediðiniz iþlemi seçiniz.");
      System.out.println("1-Para yatýrma\n" +
              "2-Para Çekme\n" +
              "3-Bakiye Sorgula\n" +
              "4-Çýkýþ Yap");
        secim=keyboard.nextInt();
        
        switch (secim) {
        case 1 : 
        System.out.println("Lütfen yatýrmak istediðiniz para miktarýný giriniz");
        int miktar=keyboard.nextInt();
        bakiye=+miktar;	
        break;
        case 2: 
        System.out.println("Lütfen çekmek istediðiniz para miktarýný giriniz");
        int miktar2=keyboard.nextInt();
        bakiye=-miktar2;	
        break;
        case 3: 
        System.out.println("Bakiyeniz="+bakiye);	
        break;
        }
      
      } while (secim!=4);
     System.out.println("Tekrar görüþmek üzere.");
       break;//önemli durmasý ve tekrar sormamasý için
	  }
	else {
         hak--;
         System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
         if (hak == 0) {
             System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
         } 
         else {
             System.out.println("Kalan Hakkýnýz : " + hak);
         }
       }    
             
	}   
  }
}