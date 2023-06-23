import java.util.Scanner;

public class SpeciesFourthTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] print = new int[] {0, 1, 2};
		
		int [] balls;
		int round = 3;
		balls = new int[round];
		
		System.out.println(print[1] + print[2] + "\"");
		
		
		
		for (int i = 0; i < print.length; i++) {
			System.out.println(i);
		}
		
		
		SpeciesFourthTry speciesOfTheMonth = new SpeciesFourthTry();
		
		System.out.println("Enter data on the Species of the month");
		
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the projected number of years:");
		int projectedYears = keyboard.nextInt();
		
		
		int futurePopulation = speciesOfTheMonth.getPopulation(projectedYears);
		
		System.out.println("In " + projectedYears + " years the population will be " + futurePopulation);
		
		speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);
		System.out.println("The new Species of the Month: ");
		speciesOfTheMonth.writeOutput();
		futurePopulation = speciesOfTheMonth.getPopulation(projectedYears);
		System.out.println("In " + projectedYears + "years the population will be " + futurePopulation);
		
		SpeciesFourthTry newSpeciesOfTheMonth = new SpeciesFourthTry();
		newSpeciesOfTheMonth.setSpecies("Klingon ox", 10, 16);
		newSpeciesOfTheMonth.writeOutput();
		futurePopulation = newSpeciesOfTheMonth.getPopulation(projectedYears);
		System.out.println("In " + projectedYears + " years the population will be " + futurePopulation);

		boolean b = newSpeciesOfTheMonth.equals(speciesOfTheMonth);
		System.out.println(b);	

	}

}
