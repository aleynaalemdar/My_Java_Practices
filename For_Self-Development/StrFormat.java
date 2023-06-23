package cmpe113;
public class StrFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		double balance = 155.2;
		String name = "Eray";
		System.out.format("Name: %s, age : %d ,balance: %2f %n ",name,age,balance);
		
		
		
		String month = "October";
		int day = 27;
		int year = 2021;
		double percent = ((double) (365 - 300) / 365) * 100;
		
		System.out.format("Today is %n%s %d, %d%n", month, day, year);
		System.out.format("%.4f percent of the year remains", percent);
	}

}
