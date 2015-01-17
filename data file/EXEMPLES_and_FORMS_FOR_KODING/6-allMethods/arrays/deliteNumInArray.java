package arrays;
import java.util.Arrays;


public class deliteNumInArray {
public static void main(String[] args) {
int ar[]={23,43,45,67,3,5,2,7,86,54,34};
Arrays.sort(ar);
System.out.println("Array Befor delite "+Arrays.toString(ar));
ar=deliteNum(ar,0);
System.out.println("Array After delite "+Arrays.toString(ar));
	}
private static int[] deliteNum(int[] ar, int index) {
	int []arr=new int[ar.length-1];
	System.arraycopy(ar,0,arr,0,index);
	System.arraycopy(ar,index+1,arr,index,ar.length-index-1);
	return arr;
}

}
