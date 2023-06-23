public class SpeciesFirstTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
		
		System.out.println("Enter data on the Species of the month");
		
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();
		
		int futurePopulation = speciesOfTheMonth.getPopulationIn10();
		
		System.out.println("In ten years the population will be " + futurePopulation);
		
		speciesOfTheMonth.name = "Klingon ox";
		speciesOfTheMonth.population = 10;
		speciesOfTheMonth.growthRate = 15;
		System.out.println("The new Species of the Month: ");
		speciesOfTheMonth.writeOutput();
		System.out.println("In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());

	}

}
