
public class BankAccount_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1 = new BankAccount();
		b1.balance = 100;
		b1.rate = 50;
		
		double cb;

		cb = b1.newBalance();
		System.out.println(cb);

	}

}
