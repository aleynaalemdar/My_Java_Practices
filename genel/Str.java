package cmpe113;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s, s1, s2, s3;	
		char c1, c2, c3;
		int l, i, j;
		boolean b;
		
		s  = "Java is fun.";
		c1 = s.charAt(0);
		c2 = s.charAt(9);
		l = s.length(); 
		c3 = s.charAt(l-1);
		
		
		System.out.println("the first letter in " + "\"" + s + "\""  + " is " +
				"\'" + c1 + "\'");
		System.out.println("the 9th letter in " + "\"" + s + "\""  + " is " +
				"\'" + c2 + "\'");		System.out.println("the length of " + "\"" + s + "\"" + " is " + l);
		System.out.println("the last letter of " + "\"" + s + "\"" + " is " + c3);
		
		// compareTo
		s = "Java";
		s1 = "K++";
		i = s.compareTo(s1);
		System.out.println("comparing " + "\"" + s + "\"" + " and " + 
				"\"" + s1 + "\"" + " gives " + i);

		
		// concat
		s1 = " rocks";
		s2 = s.concat(s1);
		System.out.println("concatenating " + "\"" + s + "\"" + " with " + 
				"\"" + s1 + "\"" + " is " + s2);
		
		// equals
		s1 = "java";
		b = s.equals(s1);
		System.out.println("equality considering cases in between " + "\"" + s + "\"" 
				+ " and " + "\"" + s1 + "\"" + " is " + b);		
		// IgnoreCase
		s1 = "jAvA";
		b = s.equalsIgnoreCase(s1);
		System.out.println("equality ignoring cases in between " + "\"" + s + "\"" + 
				" and " + "\"" + s1 + "\"" + " is " + b);

		
		// indexOf
		s1 = "Java";
		i = s.indexOf(s1);
		System.out.println("index of " + "\"" + s1 + "\"" + " is " + i);
		
		// toLowerCase
		s1 = s.toLowerCase();
		System.out.println("lowered " + "\"" + s + "\"" + " is " + "\"" + s1 + "\"");

		// toUpperCase
		s1 = s.toUpperCase();
		System.out.println("uppered " + "\"" + s + "\"" + " is " + "\"" + s1 + "\"");
	
		// replace
		c1 = 'a';
		c2 = 'o';
		s1 = s.replace(c1, c2);
		System.out.println("substituting all occurences of " + 
				"\'" + c1 + "\'" + " in "  +  "\"" + s + "\"" + " with " +
				"\'" + c2 + "\'" + " yields " + "\"" + s1 + "\"");
	
		// substring to the end
		i = 0;
		s1 = s.substring(i);
		System.out.println("substring of " + "\"" + s + "\"" + " from the index " + i + 
				" on is " + "\"" + s1 + "\"");
		// substring delimited
		i = 2;
		j = 3;
		s1 = s.substring(i, j);
		System.out.println("substring of " + "\"" + s + "\"" + " in between indices " + i +
				" and " + j + " is " + "\"" + s1 + "\"");
		
		// trim
		s1 = "     " + s + "  ";
		s2 = s1.trim();
		System.out.println("trimmed " + "\"" + s1 + "\"" + " is " + "\"" + s2 + "\"");

	
		
	}

}
