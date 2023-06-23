package lab03;

public class Vehicle {

	Person person;

	public Vehicle(double rate_, Person person) {
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
	

	double RATIO = 0.3495;

	public double creditRiskFee(int age, double capital) {
		double RF = 0;

		if ((age >= 35) && (age <= 60)) {

			RF = 0;
			return RF;

		}

		else {
			RF = 0.01 * capital * (RATIO / 12);

			return RF;
		}

	}

	public double calculatePaymentWithInterest(double capital, Person person) {

		return (capital + creditRiskFee(person.getAge(), capital)) * (1 + RATIO);
	}

	public void applyForLoan(Person p, double capital, int month, String loanType) {
		
   	 installment = calculatePaymentWithInterest / month;
   	 System.out.println("Your Business credit application " + "has been rejected because your salary is"+
   			"lower than the installments!");
	}
	
	public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {

		int toplam = 0;

		for (int sayi = 0; sayi < remainingInstallments.length; sayi++) {

			toplam +=  remainingInstallments[sayi];
		;

		}
		System.out.println("New Vehicle Loan Repayment will be:" + (double)toplam);
		System.out.println("Your new payments will be: " + (double) toplam/24 + " x 24");

	}
}