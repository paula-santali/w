package arrays;

import java.util.Arrays;
public class insertLine {

	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		ar=insertline(ar, 2);
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");

	}

	private static int[][] insertline(int[][] ar, int value) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = insertElement(ar[i], value);
		
		}
		return ar; 		
	}

	private static int[] insertElement(int[] ar, int value) {
		int []newAr=new int[ar.length+value];
		System.arraycopy(ar, 0, newAr, 0, ar.length);
		for(int i=0;i<newAr.length;i++){
			if(i>=ar.length){			
			newAr[i]=(int) Math.round(Math.random()*100);	
			}
		}
		return newAr;
	}


}
