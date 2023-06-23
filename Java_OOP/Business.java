package lab03;
public class Business{
	Person person;

	public Business (double rate_, Person person) {
		super();
		RATIO = rate_;
		this.person = person;

	}
	public void setPerson(Person person) {
		this.person = person;
	}

	
	public void setRate(double rate) {
		this.RATIO = rate;
	}

	public Person getPerson() {
		return person;
	}

	public double getRate() {
		return RATIO;
	}

	
	double RATIO = 0.3305;

	public double creditRiskFee(int age, double capital) {
		double RF = 0;

		if (age > 53) {

			RF = (age - 53) * 0.01 * capital * (RATIO / 12);

		}
		return RF;
	}

	public double calculatePaymentWithInterest(double capital, Person person) {

		return (capital + creditRiskFee(person.getAge(), capital)) * (0.83 + RATIO);
	}
	
     public void applyForLoan(Person p, double capital, int month, String loanType) {
		
    	 installment = calculatePaymentWithInterest / month;
    	 if (salary<installment){
    		 System.out.println("Your Business credit application " + "has been rejected because your salary is"+
    				 "lower than the installments!");
		
else 
	
")
    	 }
	}
	

	public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {

		int toplam = 0;

		for (int sayi = 0; sayi < remainingInstallments.length; sayi++) {

			toplam +=  remainingInstallments[sayi];
			

		}
		System.out.println("New Business Loan Repayment will be:" + (double)toplam);
		System.out.println("Your new payments will be: " + (double)toplam/12 + " x 12");

	}

}