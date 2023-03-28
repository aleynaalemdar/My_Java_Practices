public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acct1 = new Account("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account("Jane Smith", 69713, 40.00);
		Account acct3 = new Account("Edward Demsey", 93757, 759.32);
		
		acct1.deposit(25.85);
		
		double smithBalance = acct2.deposit(500.00);
		System.out.println("Smith balance after deposit: " + smithBalance);
		
		System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
		
		acct1.addinterest();
		acct2.addinterest();
		acct3.addinterest();
		
		System.out.println();
		acct1.printAccount();
		acct2.printAccount();
		acct3.printAccount();
		
	}

}
