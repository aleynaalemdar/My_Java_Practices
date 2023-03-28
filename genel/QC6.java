package cmpe113;
public class QC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
		
		boolean a = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
		boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean c = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		boolean d = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		boolean e = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
