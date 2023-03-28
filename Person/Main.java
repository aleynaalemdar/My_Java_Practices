package lab03;
public class Main{
public static void main(String[] args) {

	
	Person person1 = new Person("Ali", "Irmak", 36, 5000);
	Person person2 = new Person("Veli", "Kaya", 61, 3500);
	
	//----------------------------------------------------------
	person1.applyForLoan(person1, 100000, 6, "Business");
	person1.applyForLoan(person1, 10000, 6, "Business");
	person2.applyForLoan(person2, 50000, 12, "Vehicle");
	person2.applyForLoan(person2, 50000, 24, "Vehicle");
	person1.applyForLoan(person2, 50000, 12, "Personal");
	person1.applyForLoan(person2, 50000, 24, "Personal");
	
	//-------------------------------------------------------------
	
	
	
	
	
	
	Business business1 = new Business(0,person2);
	 Vehicle vehicle1 = new Vehicle(0,person2);
	 Personal personal1 = new Personal(0,person2);
	 
	 
	 business1.restructuringLoan(12, person1, 1244.00,1244.00,1244.00,1244.00);
	 vehicle1.restructuringLoan(24, person1, 800.00, 800.00, 800.00, 800.00, 800.00, 800.00,
	800.00);
	 personal1.restructuringLoan(24, person2, 650.00, 650.00, 650.00, 650.00, 650.00, 650.00,
	650.00);


}
}
