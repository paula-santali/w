package arrays;

import java.util.Arrays;

public class classWorkWishArray {
	
	public static int[][] interfeys(int[][] arIn, int value,int[]inAr,int work) {
		int [][]newAr=new int[0][0];
        int insLine = value,delLine = value,delAr = value;
        
		switch(work){
        case 1:newAr=insertrow(arIn,inAr);break;
        case 2:newAr=insertline(arIn,insLine);break;
        case 3:newAr=deliterow(arIn,delAr );break;
        case 4:newAr=deleteline(arIn,delLine);break;
        default: System.out.println(" Number of Work Incorrect");
        }
return newAr;
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
		/*
		 * matrix[indmatrix]=insertElement(matrix[matrix[indmatrix],matrix[indmatrix].legth,value);
		 * */
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
	public static void main(String[] args) {
		int [][]newAr={{0}};
		int[]insAr={2,3,4};
		System.out.println(Arrays.deepToString(newAr));
		System.out.println("---------------");
		//                                 array,value,array, num work  
		//newAr=classWorkWishArray.interfeys(newAr,   2,  insAr,  1);
		System.out.println("---------------");
		System.out.println(Arrays.deepToString(newAr));
		newAr=classWorkWishArray.interfeys(newAr,   3,  null,  0);
		System.out.println("---------------");
		System.out.println(Arrays.deepToString(newAr));
		
	}
}

