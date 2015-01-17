package arrays;
import java.util.Arrays;


public class deleteLine {

	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3,4,5,6,7,8,9 }, { 11, 22, 33,44,55,66,77,88,99 }, { 111, 222, 333,444,555,666,777,888,999 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		ar=deleteline(ar, 0);
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");

	}

	private static int[][] deleteline(int[][] ar, int value) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = deleteElement(ar[i], value);
		}
		return ar; 		
	}

	private static int[] deleteElement(int[] ar, int index) {
		int []mat=new int[ar.length-1];
		if(index>0){
			System.arraycopy(ar, 0, mat, 0, ar.length-1);
			System.arraycopy(ar, index+1, mat, index, ar.length-index-1);
			return mat;
		}else{
			System.arraycopy(ar, 1, mat, 0, ar.length-1);
			System.arraycopy(ar, index+1, mat, index, ar.length-index-1);
		}
		return mat;
	}



}
