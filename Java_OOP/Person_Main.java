
public class Person_Main {
public static void main(String[] args) {

	Person Burak = new Person();

	// please observe the code behavior before and after object assignments 
	// "Orhan = Burak (line 22)"" and "Orhan = Yuksel" (line 30) 
	
	Burak.name = "Burak Ekici";
	Burak.age  = 35;
	
	System.out.println("Burak's full name: " + Burak.name);
	System.out.println("Burak's age: " + Burak.age);
	System.out.println("Burak's birth year: " + Burak.yearOfBirth());
	
	Person Orhan = new Person();
	
	System.out.println("The object Orhan's unique idendifier (hashcode): " + Orhan);
	System.out.println("The object Burak's unique idendifier (hashcode): " + Burak);
	
	Orhan = Burak;
	
	System.out.println("The object Orhan's unique idendifier (hashcode): " + Orhan);
	System.out.println("The object Burak's unique idendifier (hashcode): " + Burak);
	System.out.println("Orhan's age: " + Orhan.age);
	
	Person Yuksel = new Person();

	Orhan = Yuksel;

	System.out.println("The object Yuksel's unique idendifier (hashcode): " + Yuksel);
	System.out.println("The object Orhan's unique idendifier (hashcode): " + Orhan);
	
	Yuksel.age = 20;
	System.out.println("Burak's age: " + Burak.age);
	System.out.println("Orhan's age:" + Orhan.age);
	
	
}

}
