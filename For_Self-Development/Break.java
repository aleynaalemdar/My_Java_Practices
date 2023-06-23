package cmpe113;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j = 0; j <= 5; j++)
		{
			System.out.print("i: ");
			for (int i = 0; i <= 10; i++) 
			{
				if (i >= 5 && i < 8) 
					break; // try it out with "continue" as well.
				else
					System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("j: " + j);
		}
		
	}

}
