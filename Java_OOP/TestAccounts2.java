package lab05;
import java.util.Scanner;

public class TestAccounts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner keyboard = new Scanner(System.in);
				double balance;
				long acctNum;
				System.out.println("Enter name for first account: ");
				String isim1 = keyboard.next();
				Account acct1 = new Account (isim1);
				System.out.println("First account ");
				acct1.printInfo();
				
				System.out.println();
				
				System.out.println("Enter name for second account: ");
				String isim2 = keyboard.next();
				Account acct2 = new Account (isim2);
				System.out.println("Second account ");
				acct2.printInfo();
				
				System.out.println();		
				
				
				System.out.println("Enter name for third account: ");
				String isim3 = keyboard.next();
				Account acct3 = new Account (isim3);
				System.out.println("Third account ");
				acct3.printInfo();
				
				System.out.println();		
				
				Account.combine(acct2,acct3);
				
				
				
				
				
				
				
				
			}


		
	}