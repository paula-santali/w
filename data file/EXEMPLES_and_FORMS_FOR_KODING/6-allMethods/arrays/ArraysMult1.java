package arrays;
import java.util.Arrays; 
  
  
public class ArraysMult1 { 
  
    /** 
     * @param args 
     */
    public static void main(String[] args) { 
           
        //     ind ->0 1 2 3  
        int ar1[] = {1,4,2,5}; 
        int ind; 
        for( ind = 0; ind < ar1.length ; ind++){ 
            //System.out.print(ar1[ind]); 
        } 
       
          
        //       i ->    0          1         2 
        int ar[][] = {{2,4,7,9},{5,2,4,6},{1,9,2,6}}; 
        //      j->    0 1 2 3   0 1 2 3   0 1 2 3  
        int i,j; 
        for(i = 0; i < ar.length ; i++){ 
            for(j = 0 ; j < ar[0].length;j ++){ 
                System.out.print(ar[i][j]+ " "); 
            } 
            System.out.println(); 
        } 
        /* 
         *  j->    0 1 2 3 
         *  --------------  
         *  i 0    2 4 7 9 
         *    1    5 2 4 6 
         *    2    1 9 2 6 
         *  
         *  
         */
         ar[1][2] = 0; 
         ar[2][1] = 5; 
           
         String str = Arrays.deepToString(ar); 
         System.out.println(str); 
           
         int ar2 [][] = new int[3][4]; 
         ar2[2][3] = -5; 
         ar2[1][1] = 2; 
         ar2[0][2] = 4; 
         str = Arrays.deepToString(ar2); 
         System.out.println(str); 
           
           
         int ar4[] = {3,2,1}; 
         int ar5[] = {13,12,11}; 
         int ar6[] = {9,4,7,8}; 
           
         int ar3[][] = new int[4][]; 
         ar3[0] = ar4; 
         ar3[1] = ar5; 
         ar3[2] = ar6; 
         ar3[3] = ar[1]; 
                       
         str = Arrays.deepToString(ar3); 
         System.out.println(str); 
           
         ar3 = removeFirstLastRow(ar3); 
         str = Arrays.deepToString(ar3); 
         System.out.println(str); 
           
           
         String arCourse[][] = {{"Amir","Alex","Miri"},{"Alex","Vadim","Zoya"},{"Yuliya","Paula","Vladimir"}}; 
         System.out.println(arCourse[0][2]); 
         arCourse[1][1] = "Haim"; 
         str = Arrays.deepToString(arCourse); 
         System.out.println(str); 
              
    } 
      
     private static int[][] removeFirstLastRow(int ar[][]){ 
         int size = ar.length-2; 
         int newAr[][] = new int[size][]; 
         System.arraycopy(ar, 1, newAr, 0, size); 
         return newAr; 
     } 
       
     private static int[][] removeAnyElem(int ar[][], int i , int j){ 
        int size =  ar[i].length; 
        int arTemp[] = new int[size-1];   
         // Do arraycopy 2 times 
         ar[i] = arTemp; 
         return ar; 
     } 
  
} 