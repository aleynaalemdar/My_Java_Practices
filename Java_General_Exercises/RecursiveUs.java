package java101;
import java.util.Scanner;
public class RecursiveUs {


		
		
	 public static int getPow(int x, int y){
	        if(y == 0) return 1;
	        return x * getPow(x,y-1);
	    }

	
	
	
	
	public static void main (String args []) {
		
		System.out.println(getPow(3,3));
		
	}
}
