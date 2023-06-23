package java101;

public class PalindromSayi {

	static boolean isPalindrom(int sayi) {
		int temp = sayi; 
		int reverseNumber= 0;
		int lastNumber;
		while (temp!=0) {
			
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
			
		}
		
		if (sayi==reverseNumber) {
			return true;
		}
		else
		   return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(isPalindrom(799)); 
		
		
	}

}
