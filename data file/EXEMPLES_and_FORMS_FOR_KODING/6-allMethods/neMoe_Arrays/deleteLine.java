package neMoe_Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class deleteLine {
	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");

		ar=deleteline(ar, 0);
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");

		int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(ar1));
		System.out.println("---------------");

		ar1=deleteline1(ar1,0 );
		System.out.println(Arrays.toString(ar1));
		System.out.println("---------------");

	}
	public static int [][] deleteline(int[][] ar, int idx) {

		int[][] newAr = (int[][]) Array.newInstance(ar[0].getClass(), ar.length - 1);
		for (int i = 0; i < ar.length; i++) {
			if (i < idx) {
				newAr[i] = ar[i];
			} else if (i > idx) {
				newAr[i - 1] = ar[i];
			}
		}
		return newAr;
	}
	public static int [] deleteline1(int[] ar, int idx) {

		int[] newAr = new int [ar.length-1];
		for (int i = 0; i < ar.length; i++) {
			if (i < idx) {
				newAr[i] = ar[i];
			} else if (i > idx) {
				newAr[i - 1] = ar[i];
			}
		}
		return newAr;
	}
}