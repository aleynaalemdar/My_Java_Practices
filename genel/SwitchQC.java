package cmpe113;
public class SwitchQC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'a';
			
		switch (letter) {
		case 'A':
		case 'a':
			System.out.println("Some kind of A.");
		case 'B':
		case 'b':
			System.out.println("Some kind of B.");
			break;
		default:
			System.out.println("something else.");
			break;
		}		
	}

}
