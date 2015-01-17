package arrays;
import java.util.Arrays;


public class InsertElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int [] ar = {10,20,30,5,40};
Arrays.sort(ar);

int index = Arrays.binarySearch(ar, 5);

System.out.println(Arrays.toString(ar));
Arrays.copyOf(ar,5);
ar = insertElement(ar,3,27);
ar = insertElement(ar,27);
System.out.println(Arrays.toString(ar));
System.out.println(index);

	}

	private static int[] insertElement(int[] ar, int ind, int value) {
	int [] newar=new int[ar.length+1];
	System.arraycopy(ar, 0, newar, 0, ind);
	newar[ind]=value;
	System.arraycopy(ar,ind,newar,ind+1,ar.length-ind);
		return newar;
	}
	private static  int[] insertElement(int[]sortedArr,int number){
		  int newAr[]=new int[sortedArr.length+1];
		  int ind=Arrays.binarySearch(sortedArr,number);
		  if(ind>=0)
		   return sortedArr;
		  else if(ind<0){
		   ind=-(ind+1);

		   System.arraycopy(sortedArr, 0, newAr, 0, ind);
		   newAr[ind]=number;
		   System.arraycopy(sortedArr,ind,newAr,ind+1,sortedArr.length-ind); 
		   
		   }
		  
		  return newAr; 
		 }
}
