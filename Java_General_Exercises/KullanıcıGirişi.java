import java.util.Scanner;
public class KullanıcıGirişi {

	public static void main(String[] args) {
		
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Kullanıcı adınız : ");
     String userName =keyboard.nextLine();
     System.out.println("Şifreniz : ");
     String password=keyboard.nextLine();
   
   if (password.equals("12345")&&(!userName.equals("Aleynaalemdar"))){
     System.out.println("Kullanıcı adınız yanlış");
     System.out.println("Kullanıcı adınızı sıfırlamak ister misiniz?; "
     		+ "evet için 1,hayır için 2 giriniz. ");
             int a = keyboard.nextInt();
             
             
     if (a==1) {
     System.out.println("Yeni kullanıcı adı giriniz.");
     keyboard.nextLine();
     String newUserName =keyboard.nextLine();
     
     if (newUserName.equals("Aleynaalemdar")) {
    	 System.out.println("Yeni kullanıcı adınız eskisiyle aynı olamaz."
    	 		+ "Lütfen başka bir kullanıcı adı giriniz.");}
    	 else 
    		 System.out.println("Kullanıcı adı oluşturuldu."); }
    	  
     if (a==2) {
    	 System.out.println("Sistemden çıkış yapılıyor...");}
     
    if (!(a==2) && !(a==1)) {
     
     System.out.println("Yanlış giriş yaptınız,tekrar deneyiniz.");
     }
     
  }		
   
   if (!(password.equals("12345"))&&(userName.equals("Aleynaalemdar"))){
	     System.out.println("Şifreniz yanlış");
	     System.out.println("Şifrenizi sıfırlamak ister misiniz?; "
	     		+ "evet için 1,hayır için 2 giriniz. ");
	             int a = keyboard.nextInt();
	             
	             
	     if (a==1) {
	     System.out.println("Yeni bir şifre giriniz.");
	     keyboard.nextLine();
	     String newPassword =keyboard.nextLine();
	     
	     if (newPassword.equals("Aleynaalemdar")) {
	    	 System.out.println("Yeni şifreniz eskisiyle aynı olamaz."
	    	 		+ "Lütfen başka bir şifre giriniz.");}
	    	 else 
	    		 System.out.println("Şifre oluşturuldu."); }
	    	  
	     if (a==2) {
	    	 System.out.println("Sistemden çıkış yapılıyor...");}
	     
	    if (!(a==2) && !(a==1)) {
	     
	     System.out.println("Yanlış giriş yaptınız,tekrar deneyiniz.");
	     }
	     
	  }		
   
   if (!((password.equals("12345"))||(userName.equals("Aleynaalemdar")))){
   System.out.println("Şifreniz ve kullanıcı adınız yanlış...");
   System.out.println("Değiştirmek ister misiniz?");
   System.out.println("Evet için 1 , hayır için 2 giriniz...");
   int b =keyboard.nextInt();
   if (b==1) {
	   System.out.println("Yeni şifrenizi giriniz.");
	   String yenisifre=keyboard.nextLine();
	   keyboard.nextLine();
	   System.out.println("Yeni kullanıcı adınızı giriniz.");
	   String yenikullaniciadi=keyboard.nextLine();
	   	System.out.println("Şifreniz ve kullanıcı adınız değiştirildi.");
   }
	     if (b==2) {
	    	 System.out.println("Sistemden çıkış yapılıyor...");}
	     
	    if (!(b==2) && !(b==1)) {
	     
	     System.out.println("Yanlış giriş yaptınız,tekrar deneyiniz.");
	     }
   }
   

   
   }
}

