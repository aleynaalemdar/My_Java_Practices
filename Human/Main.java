
public class Main {

	public static void main(String[] args) {
		HumanBeing kamil = new HumanBeing("kamil",1990);
		kamil.step(5000);
		System.out.println(kamil);
		HumanBeing hayri = new HumanBeing("hayri",1980);
		System.out.println(hayri);
		HumanBeing remzi = new HumanBeing("hayri",1980);
		System.out.println(remzi);
		HumanBeing necati = new HumanBeing("necati",1980);
		System.out.println(necati);
		System.out.println();
		System.out.println(kamil.comparePeople(hayri));
		System.out.println(hayri.comparePeople(remzi));
		System.out.println(hayri.comparePeople(kamil));
		System.out.println(necati.comparePeople(remzi));
		System.out.println();
		System.out.println("World Population : "+ HumanBeing.getWorldPopulation());
		
		
		
		
		
		}
	
	
}
