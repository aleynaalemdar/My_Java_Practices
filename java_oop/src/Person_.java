public class Person_ {
	
	private String name;
	private int age;
	
	public int yearOfBirth() {
		return 2022 - age;
	}

	public void setPerson(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printPerson() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Birth year: " + yearOfBirth());
		System.out.println("---------------------");
	}
	
	public boolean isEq(Person_ np) {
		return(name.equalsIgnoreCase(np.name) &&
			   age == np.age
				);
	}
	
}
