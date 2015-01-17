package arrays;
import java.util.Arrays;

public class BubleSearchInDoubleArray {
	public static void main(String[] args){  
		int[][] ar = { { 1, 3, 2 }, { 10, 32, 23 }, { 101, 322, 33 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		ar=sort(ar);
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
	}
	public static int [][] sort(int [][]ar) {
        int len = ar.length;
        for(int k = 0; k < len; k++)
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < ar[i].length-1; j++) {
                if(ar[i][j] > ar[i][j+1]) {
                    int temp = ar[i][j];
                    ar[i][j] = ar[i][j+1];
                    ar[i][j+1] = temp;
                }
            }
        }
        return ar;
    }
}
