package cmpe113;


public class Break_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting loop:");
		
		for (int n = 0; n < 7; n++)
		{
			System.out.println("in loop: " + n);
			
			if (n == 2)
			{
				continue;
			}
			
			System.out.println("\t survived first guard");
			
			if (n == 4)
			{
				break;
			}
			
			System.out.println("\t survived second guard");
		}
		
		System.out.println("end of loop or exit via break");

	}

}
