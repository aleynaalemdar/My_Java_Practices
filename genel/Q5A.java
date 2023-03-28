package cmpe113;
public class Q5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {10, 10, 1, 5, 15, -22 , -56, 2, 400, 509, 40, -6};
		
		int min = a[0];
		int max = a[0];
		int sum = a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max)
				max = a[i];
			else if(a[i] < min)
				min = a[i];
			
			sum = sum + a[i];
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println((double) sum/a.length);

	}

}
