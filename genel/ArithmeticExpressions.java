package cmpe113;

public class ArithmeticExpressions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y = 10;
		
		x = 10 / 2 * ++y; // 1st pre-incrementation, 2nd division, 3rd multiplication, 4th assignment 
		System.out.println("x is " + x);
		
		x = 2 + 5 / 10 * 2;  // 1st division, 2nd multiplication, 3rd addition, 4th assignment 
		System.out.println("x is " + x);

		x = -5 + 21 / 3 * 4; // 1st minus inversion in -(5), 2nd division, 3rd multiplication, 4th addition, 5th assignment 
		System.out.println("x is " + x);
		
		// please try a few more out on your own ...

		x = (y = (10+4)) * 5 / 2; // 1st paranthesis, 2nd multiplication, 3rd division, 4th assignment (x = ...)
		System.out.println("x is " + x);


	}

}
