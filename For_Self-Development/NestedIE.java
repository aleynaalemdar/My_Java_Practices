package cmpe113;
public class NestedIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f, h, g;
		
		a = 6; b = 5; c = 7; d = 6;	e = 7; f = 3; h = 1; g = 5;
		
		if(a>b) 
			if (c>d) 
				e = f;
			else 
				g = h;

		System.out.println("First form  -- e is: " + e);
		System.out.println("First form  -- g is: " + g);
		
		System.out.println("\n");
		
		a = 6; b = 5; c = 7; d = 6;	e = 7; f = 3; h = 1; g = 5;

		if(a>b) {
			if (c>d) 
				e = f;
		}
			else 
				g = h;
		
		System.out.println("Second form -- e is: " + e);
		System.out.println("Seconf form -- g is: " + g);


	}

}
