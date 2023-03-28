
public class Person_Driver {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Person_ burak = new Person_();
			burak.printPerson();
			
			burak.setPerson("Burak Ekici", 36);
			burak.printPerson();
			
			Person_ orhan = new Person_();
			orhan.printPerson();
			orhan.setPerson("Orhan Erduran", 20);
			orhan.printPerson();
			
			burak = orhan;
			
			burak.printPerson();
			
			if(burak.isEq(orhan))
				System.out.println("same");
			else
				System.out.println("diff");

		}

	}
