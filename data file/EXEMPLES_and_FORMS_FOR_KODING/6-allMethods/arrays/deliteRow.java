package arrays;

import java.util.Arrays;
public class deliteRow {
	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 },{4444,4444,4444} };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		ar=deliterow(ar,0 );
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
}	
	
	private static int[][] deliterow(int[][] matrix, int indexRow) {
		int [][]mat=new int[matrix.length-1][];
		if(indexRow>0){
			System.arraycopy(matrix, 0, mat, 0, matrix.length-indexRow);
			System.arraycopy(matrix, indexRow+1, mat, indexRow, matrix.length-indexRow-1);
			return mat;
		}else{
			System.arraycopy(matrix, 1, mat, 0, matrix.length-1);
			System.arraycopy(matrix, indexRow+1, mat, indexRow, matrix.length-indexRow-1);
		}
		return mat;
	}
}
