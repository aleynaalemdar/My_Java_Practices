public class Account {
	
	private final double RATE = 0.035;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	// Sets up the account by defining its owner, account number,
	// and initial balance.
	public Account (String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	// Deposits the specified amount into the account. Returns the
	// new balance.
	public double deposit (double amount) {
		balance = balance + amount;
		return balance;
	}
	// Withdraws the specified amount from the account and applies
	// the fee. Returns the new balance.
	public double withdraw (double amount, double fee) {
		balance = balance - amount - fee;
		return balance;
	}
	 //Adds interest to the account and returns the new balance
	public double addinterest() {
		balance = balance + (balance * RATE);
		return balance;
	}
	// Returns the current balance of the account.
	public double getBalance() {
		return balance;
	}
	
	public void printAccount () {
		System.out.println(acctNumber + "\t" + name + "\t" + balance);
		
	}
	// Returns a one-line description of the account as a string.
	public String toString() {
		return(acctNumber + "\t" + name + "\t" + balance);
	}
	
}
