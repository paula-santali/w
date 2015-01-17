package arrays;
import java.util.Arrays;
 
public class randomget {
    
    public static void main(String[] args) {
   int [][]ar=addMass();
   System.out.println(Arrays.deepToString(ar));
   ar=BubleSearchInDoubleArray.sort(ar);
   System.out.println("------------------------------------------------------------------------------------------------------------");
   System.out.println(Arrays.deepToString(ar));
    }
   
    public static int[][] addMass() {
        int[][] iarray = new int[5][5];
        for (int i = 0; i < iarray.length; i++) {
            for (int j = 0; j < iarray.length; j++) {
                iarray[i][j] = (int) Math.round(Math.random()*100);
            }
                
        }
		return iarray;
    }
}