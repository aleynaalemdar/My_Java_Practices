package cmpe223;

import java.util.Arrays;
/*
 * Write a static Java method that multiplies two given matrices (which have
elements of type double
 */
public class ho1_q3 {

	static void multiplyMatrix(
			 int row1, int col1, double arr1[][],
			 int row2, int col2, double arr2[][])
			{
			 double arr_final[][] = new double[row1][col2];
			 for (int i = 0; i < row1; i++) {
			 for (int j = 0; j < col2; j++) {
			 for (int k = 0; k < row2; k++) 
			 arr_final[i][j] += arr1[i][k] * arr2[k][j];
			 }
			 }
			 System.out.println(Arrays.deepToString(arr_final));
			}
	/*
	Use below to print 2D array
int[][] array = new int[rows][columns];
System.out.println(Arrays.deepToString(array));
    Use below to print 1D array
int[] array = new int[size];
System.out.println(Arrays.toString(array));
	 */

	
	public static void main(String[] args) {
	    int row=7;
		int col=6;
		double arry[][]= new double [row][col];
		int row1=2;
		int col1=3;
		double arry1[][]= new double [row1][col1];
		
		
		multiplyMatrix(row,col,arry,row1,col1,arry1);

	}

}
