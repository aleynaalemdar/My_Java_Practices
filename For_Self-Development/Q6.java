import java.util.Scanner;
public class Q6 {

/*
 *Write a Java program that reads a text and assigns
 * all the characters in the given text to an array by using a loop.
 *  Then, the program divides array into 2 part from the middle
 *  , then takes the reverse of second part. After that relocates
 *   the parts into each other. At the final gives the output of 
 *   the newly allocated array. The sample output is like this.
 *
 */
	public static void main (String args []) {
		Scanner keyboard = new Scanner(System.in);
		String kelime = keyboard.next();
	  
		char myArray[]=new char[kelime.length()];
		
		for (int i =0; i<kelime.length();i++) {
			
		char c = kelime.charAt(i);
		myArray[i]=c;
	
		}
		
		char temp[]= new char [kelime.length()];
		
		
		for (int i =0; i<kelime.length()/2 ; i++) {
			temp[i]=myArray[kelime.length()-1-i];
		
		}
		
		
		for (int i = kelime.length()/2 ; i<kelime.length() ; i++) {
			
			temp[i]=myArray[i-kelime.length()/2];
			
		
			}
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println("Char " + (i+1) + ":" + temp[i] ); }
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
