public class BankAccount {
	
	public double balance;
	public double rate;

	public void setBalance (double Balance) {
		this.balance = Balance;
	}
	
	public double newBalance () {
		double nb = this.balance + (this.rate/100) * this.balance;
		return nb;
	}
	
}
