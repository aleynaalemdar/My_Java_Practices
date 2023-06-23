package cmpe113;

public class Q3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String airport1 [] = { "London", "LA", "Zurich", "Istanbul", "Berlin", "Frankfurt", "New York" };
		String airport2 [] = { "Basel", "Istanbul", "LA", "Antalya", "Berlin", "New York" };

		String [] common = new String[airport1.length]; 
		int index = 0;
		boolean isCommon;
		
		for (int i = 0; i < airport1.length; i++)
		{	
			isCommon = false;
			
			for (int j = 0; j < airport2.length && !isCommon; j++) 
			{
				if (airport1[i].equals(airport2[j])) {
					common[index] = airport1[i];
					index++;
					isCommon = true;
				} 
			}
		}
		
		for(int i = 0; common[i] != null; i++)
			System.out.println(common[i]);
		
		
		
	}

}
