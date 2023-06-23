package cmpe113;
public class Q8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = { 0, 1, 5, 3, 18, 3, 25, 122, 123, 1, 0, -25, 15, 11, 17, 81, 1, 1, 5, 61, 18, 1, 122, 0 };
		int [] b = new int[a.length*2];
		int i, j, index, count;
		boolean isFound;

		index = 0;
		
		for (i = 0; i < a.length; i++)
		{
			count = 1;
			
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}	

			isFound = false;
			
			for(int k = 0; k < index && !isFound; k = k + 2)
			{
				if (b[k] == a[i])
				{
					isFound = true;					
				}
			}
			
			if(!isFound)
			{
				b[index] = a[i];
				b[index+1] = count;
				index = index+2;
			}
		}
		
		for(index = 0; index < b.length; index = index+2)
		{
			if (b[index+1] != 0) 
			{
				System.out.println(b[index] + " " + b[index+1]);
			}
		}
	}

}
