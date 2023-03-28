public class Pet {
	
	private String name;
	private int age;
	private double weight;
	
	public void setPet(String n, int a, double w) {
		name = n;
		age = a;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void printPet() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight:" + weight);
		System.out.println("-----------------------");
	}
	
	public Pet(int a) {
		name = "not yet assigned";
		age = a;
		weight = 0;
	}
	
	public Pet(String n, int a) {
		name = n;
		age = a;
		weight = 0;
	}
	
	public Pet(String n, int a, double w) {
		setPet(n, a, w);
	}
	
	public boolean isEq(Pet p) {
		return(name.equalsIgnoreCase(p.name) &&
				age == p.age &&
				weight == p.weight
				);
	}
	
	

}
