package lab07;

import java.util.Scanner;

public class IsStringSorted {

	
 static boolean isSorted (String aleyna) {
	 
		char a  =  aleyna.charAt(0);
		char b = aleyna.charAt(1);
		
		aleyna = aleyna.substring(0, aleyna.length()-1);
		
		while (aleyna.length()>=0 ) { //outofbound exception hatasını çözemedim hocam farklı yollar denesem de...
				if (a<b) {
System.out.println("The string is sorted in lexicographically ascending order");
    return (isSorted(aleyna));
				
				}
				else {
System.out.println("The string is not sorted in lexicographically ascending order.");
      return (isSorted(aleyna));
      }
				}
		return true;
	
 
}
 
	
  static void isAllLetter(String aleyna) throws StringContainsNonLetter{
		
	 
		String sayi;

		if (aleyna.contains("[a-zA-Z]+") == false && aleyna.length() > 2) {
		    sayi = aleyna; 
		}
		        	   throw new StringContainsNonLetter();
				 }
			           
	
	
public static void main (String args []) throws  StringContainsNonLetter {
	
	Scanner keyboard = new Scanner (System.in);
	
	System.out.println("Enter a string:");
	
	String aleyna = keyboard.nextLine();
   System.out.println(isSorted(aleyna));
      isAllLetter(aleyna);

	}

	
}
