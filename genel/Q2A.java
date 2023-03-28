package cmpe113;
public class Q2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] a = {1.0, 1.1, 1.2, 1.3, 9.7, 66.7, 1.4, 1.5, 1.6};
		
		double temp;
		int mid = a.length/2;
		
		for (int i = 0, j = a.length - 1; i < mid; i++, j--)
		{
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		

	}

}
