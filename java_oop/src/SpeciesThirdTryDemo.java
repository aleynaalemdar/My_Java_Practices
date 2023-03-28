import java.util.Scanner;

public class SpeciesThirdTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeciesThirdTry speciesOfTheMonth = new SpeciesThirdTry();
		
		System.out.println("Enter data on the Species of the month");
		
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the projected number of years:");
		int projectedYears = keyboard.nextInt();
		
		
		int futurePopulation = speciesOfTheMonth.getPopulation(projectedYears);
		
		System.out.println("In " + projectedYears + " years the population will be " + futurePopulation);
		
	
	//	speciesOfTheMonth.name = "Klingon ox";
	//	speciesOfTheMonth.population = 10;
	//	speciesOfTheMonth.growthRate = 15;
	//	System.out.println("The new Species of the Month: ");
	//	speciesOfTheMonth.writeOutput();
	//	System.out.println("In ten years the population will be " + speciesOfTheMonth.getPopulation(10));
		
	}

}
