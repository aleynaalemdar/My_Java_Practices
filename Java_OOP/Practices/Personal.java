package lab03;

public class Personal{


Person person;

	public Personal (double rate_, Person person) {
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
	
	double RATIO = 0.3995;

	public double creditRiskFee(int age, double capital) {
		double RF = 0;

		if (age > 55) {

			RF = (age - 55) * 0.02 * capital * (RATIO / 12);

		}
		return RF;
	}

	public double calculatePaymentWithInterest(double capital, Person person) {

		return (capital + creditRiskFee(person.getAge(), capital)) * (1 + RATIO);
	}
	
	public void applyForLoan(Person p, double capital, int month, String loanType) {
		
   	 installment = calculatePaymentWithInterest / month;
   	if (salary<installment){
		 System.out.println("Your Business credit application " + "has been rejected because your salary is"+
"lower than the installments!");

	
else 
	}
	
	public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {

		int toplam = 0;

		for (int sayi = 0; sayi < remainingInstallments.length; sayi++) {

			sayi +=  remainingInstallments[sayi];

		

		}
		System.out.println("New Personal Loan Repayment will be:" + (double) toplam);
		System.out.println("Your new payments will be: " + (double)toplam/24 + " x 24");

	}

}
