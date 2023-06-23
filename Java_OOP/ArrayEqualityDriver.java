public class ArrayEqualityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = new int [5];
		int [] array2 = new int [5];
		
		System.out.println(array1);
		System.out.println(array2);
		
		ArrayEquality aeq = new ArrayEquality();
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i;
		}
		
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(array1);
		System.out.println(array2);
		
		System.out.println(aeq.isEq(array1, array2));
		System.out.println(array1 == array2);
		
	}

}
