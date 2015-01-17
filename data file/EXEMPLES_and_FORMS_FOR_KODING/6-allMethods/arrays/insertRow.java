package arrays;
import java.util.Arrays;
public class insertRow {
	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		System.out.println(Arrays.deepToString(insertrow(ar,new int[]{2,3,4})));
		System.out.println("---------------");
}
	
	private static int[][] insertrow(int[][] matrix, int[] row) {
		int [][]mat=new int[matrix.length+1][];
		System.arraycopy(matrix, 0, mat, 0,matrix.length);
		for(int i=0;i<mat.length;i++){
			if(i==mat.length-1){
		mat[i]=row;
		}
		}
		return mat;
	}
	
	
}
