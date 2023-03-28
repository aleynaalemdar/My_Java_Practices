package lab03;

public class Person {
	private String name;
	private String surname;
	private int age;
	private double salary;
	
	// Add getters and setters.
	// Add a constructor

	public Person(String name, String surname, int age, double salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	//
	
	public double creditRiskFee(int age, double capital) {
		return capital;
		
	}
	
	public double calculatePaymentWithInterest(double capital,Person person) {
		return capital;
		
	}
	
   public void applyForLoan(Person p, double capital, int month, String loanType) {
		
	}
   
	public void printCreditResult(Boolean b, double capital, Person person, double installment, int month, String loanType) {
			
		
	}
	
	
	
	

}

