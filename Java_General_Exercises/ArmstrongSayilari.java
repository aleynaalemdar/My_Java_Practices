import java.util.Scanner;
public class ArmstrongSayilari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
        System.out.print("Say� Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " say�s� bir Armstrong say�d�r.");
        } else {
            System.out.println(number + " say�s� bir Armstrong say�s� de�ildir.");
        }


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Say�s� Bulma ��lemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }
   */
        
        
        /*
        // Bir say�n�n son basama��n� bulma
        // 2451 % 10 = 1
         
        int b = 2451;
        int c = b % 10;

        //2^3� hesaplama
        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */

		
		
		
	}

}
