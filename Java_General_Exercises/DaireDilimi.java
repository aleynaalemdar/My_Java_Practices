import java.util.Scanner;
public class DaireDilimi {
public static void main (String []args) {
	double pi = 3.14;
	Scanner keyboard =new Scanner (System.in);
	System.out.println("L�tfen dairenin yar��ap�n� giriniz.");
	int r = keyboard.nextInt();
	System.out.println("L�tfen dairenin merkez �l��s�n� \"a\" giriniz.");
	double a = keyboard.nextDouble();
	double alan = ((pi*(r*r)*a)/360);
	System.out.println("Dairenin alan�=" + alan);
}
}