package cmpe113;

public class Q1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] a = {1.0, 1.1, 1.2, 7.9, 8.8, 1.3, 1.4, 1.5};
		
		double [] b = new double[a.length];
		
		for (int i = a.length-1; i >= 0; i--)
		{
			b[a.length-1-i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");			
		}

		
		
	}

}
