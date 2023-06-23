package java101;
import java.util.Scanner;
public class BirIleYüzArasindakiAsalSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int N =100;

//String aS = "";
for (int i = 1; i <= N; i++) {
    int counter = 0;
    for (int j = i; j >= 1; j--) {
        if (i % j == 0) {
            counter ++;
        }
    }
    if (counter == 2) {
      //  aS = aS + i + " ";
    	System.out.print(i+" ");
    }
}
//System.out.println(aS);








}

		
		
	}


