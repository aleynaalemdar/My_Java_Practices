public class PetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet p1 = new Pet(5);
		p1.printPet();
		
		Pet p2 = new Pet("Dog", 10);
		p2.printPet();
		
		Pet p3 = new Pet("Cat", 7, 3.4);
		p3.printPet();
		
		System.out.println(p1.isEq(p1));

	}

}
