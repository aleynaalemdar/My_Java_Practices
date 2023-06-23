package cmpe113;

public class Q4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String airport1 [] = { "London", "LA", "Zurich", "Berlin", "Frankfurt", "New York" };
		String airport2 [] = { "Basel", "Istanbul", "LA", "London", "Antalya", "Berlin", "New York" };
		
		String diff [] = new String[airport1.length];
		int index = 0;
		boolean isCommon;
		
		for (int i = 0; i < airport1.length; i++) 
		{
			isCommon = false;
			for (int j = 0; j < airport2.length && !isCommon; j++) 
			{
				if (airport1[i].equals(airport2[j]))
				{
					isCommon = true;
				}
			}
			if(!isCommon)
			{
				diff[index] = airport1[i];
				index++;
			}
		}
		
		for (int i = 0; diff[i] != null; i++) {
			System.out.println(diff[i]);
			
		}
		
		
	}

}
