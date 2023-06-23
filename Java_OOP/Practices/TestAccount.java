package lab05;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args){
		String name;
		double balance;
		long acctNum;
		Account acct;
	Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter account holder's first name");
		
		// a.Read the account holder�s name and create acct
		name = keyboard.next();
		acct= new Account(name);
		System.out.println("Account for "+ name + ":");
		System.out.println(acct);
		
		
		System.out.println("\nEnter initial balance");
		//b.Read the initial balance for the account holder and create a new account
		balance= keyboard.nextDouble();
		acct= new Account (balance,name);
		System.out.println("Account for "+name+":");
		System.out.println(acct);
	
		//c.Prompt for and read the account number for the account holder and create a new account with this account number
		System.out.println("\nEnter account number");
		acctNum = keyboard.nextLong();
		acct= new Account(acctNum,name);
		System.out.println("Account for "+name+":");
		System.out.println(acct);
		
		System.out.print("\nDepositing 100 into account, balance is now ");
		//d.Deposit 100$ into account and prints the new balance
		acct.deposit(100);
		
		System.out.print("\nWithdrawing $25 ,balance is now ");
		//e. Withdraw 25$ and print the new balance
	
		acct.withdraw(25);
	}
}