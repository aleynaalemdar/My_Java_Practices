
public class TryCatchBlokları {

	public static void main(String[] args) {
	
	/*
	try{
	//EXCEPTION OLUŞTURABİLECEK KODLAR
	 }
	 
	catch(Exception_Türü e){
	
	// Exception durumunda yapılacak işlemler
	 
	  }
	 
	
	 */
	
	try { 
		
		int [] b = {5,7,8};
		int c =b[6];
		int a = 30/0; //ArithmeticExceptio
				
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("indexxxx");
		} //BİR CATCHE GİRDİKTEN SONRA DİĞERİNE GİRMİYOR!!
	catch (ArithmeticException e)	{ //Exception e de yazabilirdik
		System.out.println("Bir sayı sıfıra bölünemez.");
	}
		
System.out.println("ghg");
	try { 

		int [] a = {1,2,3,4} ; //ArrayIndexOutOfBoundsException
		int b = a[6];
		System.out.println(b);
	}
		
	catch (ArrayIndexOutOfBoundsException e)	{ //Exception e de yazabilirdik
		System.out.println("Arrayin sınırlarını aştınız.");
	}	
	System.out.println("burası çalışıyor.")	;
		
  }
	
}

