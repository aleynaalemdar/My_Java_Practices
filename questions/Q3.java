
public class Q3 {
	public static void main(String[] args){
		
		/*
		 * You are given two String arrays airport1 and airport2.
		 *  Each array keeps departure cities from an airport.
		 *   Write a Java program which finds common cities of both arrays,
		 *    keeps them in a separate array and finally prints these cities
		 *     as shown in Sample Output. 
		 *     Your code should work for arrays of arbitrary size.
		 */
		
		
		
		
		String[] airport1 = {"London", "LA", "Zurich",
		"Berlin","Frankfurt", "New York"};
		
		String[] airport2 = {"Basel", "Istanbul", "LA", "Antalya",
		"Berlin", "New York"};
		int count = 0;
		for(int i = 0; i < airport1.length; i++)
		{
		for(int j = 0; j < airport2.length; j++)
		{
		if(airport1[i].equals(airport2[j]))
		count++;
		} }
		String[] common = new String[count];
		
		int increment = 0;
		for(int i = 0; i < airport1.length; i++) {
		for(int j = 0; j < airport2.length; j++)
		{
		if(airport1[i].equals(airport2[j])) {
		} }
		     common[increment] = airport1[i];
		     increment++;
		}
		System.out.println(count+ " cities are in common departures of airport 1 and 2"); System.out.println("These common cities are:");
		for(int i = 0; i < common.length; i++)
		{
		System.out.println(common[i]); }

		
		
		
		}
}
