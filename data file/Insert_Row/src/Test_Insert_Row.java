import java.util.Arrays;


public class Test_Insert_Row {

	
	public static void main(String[] args) {
	int[][] ar={{1,8,7,8},{2,3,4,5},{2,4,5,9}};
	int ar2[]={1,9,8,3};
	ar=insertRow(ar,ar2);
	System.out.println(Arrays.deepToString(ar)); 
	ar=insertline(ar, 9);
	System.out.println(Arrays.deepToString(ar));
	ar=deleteRow(ar,ar2);
	System.out.println(Arrays.deepToString(ar));
	ar=deleteColumn(ar,4);
	System.out.println(Arrays.deepToString(ar));
	

	}
public static  int[][] insertRow(int[][]matrix,int[]row){
	int ar1[][]=new int[matrix.length+1][];
	System.arraycopy(matrix, 0, ar1, 0, matrix.length);
	for(int i=0;i<ar1.length;i++)
	if(i==ar1.length-1){
		ar1[i]=row;
	}
return ar1;
}
	 private static int[][] insertline(int[][] ar, int ind) {
	  for (int i = 0; i < ar.length; i++) {
	   ar[i] = insertElement(ar[i], ind);
	  }
	  return ar;   
	 }

	 private static int[] insertElement(int[] ar, int ind) {
	  int []newAr=new int[ar.length+1];
	  System.arraycopy(ar, 0, newAr, 0, ar.length);
	  return newAr;
	 }
	 private static int[][] deleteRow(int[][]matrix,int[]row){
		 int ar1[][]=new int[matrix.length-1][];
			System.arraycopy(matrix, 0, ar1, 0, matrix.length-1);
	 return ar1;
	 }
	 private static int[][]deleteColumn(int[][]matrix,int ind){
		 int ar1[][]=new int[matrix.length][];
		 int i,j;
			for(i = 0; i < matrix.length-1 ; i++){
				for(j = 0 ; j < matrix.length-1;j ++){
					if (i==j){
						System.out.print(matrix[i][j]+ " ");	
					}
				
				}
			}
			return ar1;
	 } 
}