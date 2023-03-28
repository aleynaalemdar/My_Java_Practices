public class ArrayEquality {

	
	public boolean isEq(int [] a, int [] b) {
		if(a.length != b.length) {
			return false;
		}
		else{
			for (int i = 0; i < b.length; i++) {
				if(a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
