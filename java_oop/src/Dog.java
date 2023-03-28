public class Dog {
	
	public String name;
	public String breed;
	public int age;
	
	public void writeOutput() {
		System.out.println("Name: " + name);/////önemli
		System.out.println("Breed: " + breed);
		System.out.println("Age in calendar years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears());
	}
	
	public void setAge (int value) {
		age = value;
	}

	public int getAgeInHumanYears() {
		int humanYears = 0;
		if (age <= 2) {
			humanYears = age * 11;
		}
		else {
			humanYears = 22 + (age - 2) * 5;
		}
		
		return humanYears;
	}
}
