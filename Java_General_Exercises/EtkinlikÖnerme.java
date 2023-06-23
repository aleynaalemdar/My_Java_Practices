import java.util.Scanner;
public class EtkinlikÖnerme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Sýcaklýk giriniz :");
        int sicaklik = keyboard.nextInt();
		
        if (5>sicaklik) {
			System.out.println("Kayak yapabilirsiniz.");
		}
        else {
        
		if (sicaklik>25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
		if (5<=sicaklik) {
			if  (sicaklik <= 15) {
		System.out.println("Sinemaya gidebilirsiniz.");
		}}
			
		if (15<sicaklik ) {
			if (sicaklik <= 25) {
		System.out.println("Pikniðe gidebilirsiniz.");
		}}
		
        }
		
		
		
		
		
		
		
	}

}
