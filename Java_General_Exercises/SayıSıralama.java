import java.util.Scanner;
public class Say�S�ralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner keyboard= new Scanner(System.in);

	System.out.println("L�tfen bir say� giriniz.");
	 int a = keyboard.nextInt();
	 System.out.println("L�tfen ikinci say�y� giriniz.");
	 int b = keyboard.nextInt();
	 System.out.println("L�tfen ���nc� say�y� giriniz.");
	 int c = keyboard.nextInt();
	
	if ((a>b)&&(a>c)) {
		if (b>c) {
		System.out.println("a>b>c");
	}
		else {
			System.out.println("a>c>b");
		}
	}

	else if ((b>a)&&(b>c)) {
		if (a>c) {
		System.out.println("b>a>c");
	}
		else {
			System.out.println("b>c>a");
		}}
	

	else if ((c>b)&&(c>a)) {
		if (b>a) {
		System.out.println("c>b>a");
	}else {
		System.out.println("c>a>b");
		}
	}
	
	
	
	
	
	
	}

}
