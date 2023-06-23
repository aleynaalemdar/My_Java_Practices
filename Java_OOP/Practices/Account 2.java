package lab05;
import java.util.Random;

public class Account {
	Random rand = new Random ();
	private long acctNum=rand.nextLong();
	private double balance=100;
	private String name;

	public double getAcctNumber(){
		return acctNum=rand.nextLong();
		
	}
	
	
	
	public double getBalance(){
		return balance;
		
	}
	


	public Account(String name) {
	this.name=name;
	}


	
	
	public Account (  double balance , String name ,long acctNum) {
		this.name = name;
		this.balance=100;
		this.acctNum=rand.nextLong();
		
	}
	
	
	
	 public Account (double balance, String name) {
	    	this.name=name;
	    	this.balance=balance;
	    	do {
	    		this.acctNum=rand.nextLong();}
	    	while(this.acctNum<0);
	    	}
	    
	

	public void withdraw(double amount){
		if (balance >= amount) {
		
		System.out.println(this.balance = balance-amount);}
		else {
			System.out.println("Insufficient funds");
	}
		}
	
	
	public void deposit(double amount){
		
		System.out.println(this.balance=balance+amount);
	}
	

	public String toString(){
		
		return "Name:" + this.name + "\nAccount Number: " + this.acctNum +
				"\nBalance: " +this.balance;
	}
	
	

	public static void combine (Account acc1, Account acc2) {
		System.out.println("Trying to consolidate second and third accounts.");
	if (!(acc1.name.equals(acc1.name)) || (acc1.acctNum == acc2.acctNum)) {
		System.out.println("Sorry, accounts with different names cannot be consolidated.");
	}
	else if ((acc1.name.equals(acc2.name)) && !(acc1.acctNum == acc2.acctNum)) {
		double x = acc1.balance+ acc2.balance;
		System.out.println("Result account is \nName: " + acc1.name 
		+"\nAcct Number: " + acc1.acctNum + "\nBalance :+ " + x );
	
	}}
	
	
	public void printInfo()	{
		System.out.println("Name: " + this.name + "\nAcct Number: " + this.acctNum + "\nBalance: "+
	this.balance);
			
		
		
		
	}
	
	
	
}
