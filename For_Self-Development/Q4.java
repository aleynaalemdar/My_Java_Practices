
public class Q4 {

	/*
	 * 
	 * You are given two String arrays airport1 and airport2. 
	 * Each array keeps departure cities from an airport.
	 *  Write a Java program which finds the cities in airport1 but not 
	 *  in airport2, keeps them in a separate array and finally 
	 *  prints these cities as shown in Sample Output.
	 *   Your code should work for arrays of arbitrary size.
	 * 
	 * 
	 */
	public static void main(String[] args){
		
		String[] airport1 = {"London", "LA", "Zurich", "Berlin","Frankfurt", "New York"};
		
		String[] airport2 = {"Basel", "Istanbul", "LA", "Antalya", "Berlin", "New York"}; int count = 0;
		
		for(int i = 0; i < airport1.length; i++)
		{
		boolean isCommon = false;
		   for(int j = 0; j < airport2.length; j++) {
		       if(airport1[i].equals(airport2[j]))
			      isCommon = true;
		}
		if (!isCommon)
		count++;
		}
		
		String[] difference = new String[count]; 
		
		int increment = 0;
		for(int i = 0; i < airport1.length; i++) {
		   boolean isCommon = false;
		   
		   for(int j = 0; j < airport2.length; j++)
		    {
		        if(airport1[i].equals(airport2[j]))
		        isCommon = true;
		}
		      if (!isCommon)
		       {
		    difference[increment] = airport1[i];
		    increment++;
		}
		 }
		System.out.println(count+ " cities are in airport 1 but not in airport 2");
		System.out.println("These cities are:");
		
		for(int i = 0; i < difference.length; i++)
		{
		System.out.println(difference[i]); }
	
	
	
	}
}

	
	
	

