import java.io.IOException;

public class InvalidAgeException extends IOException {

	//bu da unchecked oldu 
	
	public InvalidAgeException(String message) {
		
		super(message); //mesajı ArithmeticExceptionın constructorına gönderdim.
	}
	
	
	
	@Override

	public void printStackTrace() {
		// TODO Auto-generated method stub
		//super.printStackTrace(); 
		System.out.println("Bu bir invalid age hatasıdır... ");
	}
// kendi exception classımızı oluşturuyoruz.
	//extends ettik
	
	
	
	
}
