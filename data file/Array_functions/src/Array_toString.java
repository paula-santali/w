import java.util.Arrays;


public class Array_toString {


public static void main(String[] args) {
	String str[]={"a","c","f","e"};
	String res;
	res=arrayToString(str);
	System.out.println(res);

	int ar[]={1,8,3,7,5};
	Arrays.sort(ar);
	ar=insertElement(ar,4);
	System.out.println(Arrays.toString(ar));
	//for(int i=0;i<ar.length;i++){si asa putem scrii cu ajutorul ciklului for
		//System.out.print(ar[i]+" ");
	int ar1[]={1,2,3,4,6,9};
	ar1=insertDelete(ar1,2);
	System.out.println(Arrays.toString(ar1));
	
	}
private static String arrayToString(String[]ar){//functia care scrie literele ->acfe//
	int i;
	String res=" ";

	for(i=0;i<ar.length;i++){
		res=res +ar[i]+" ";
		}
		return res;
	}	
	private static  int[] insertElement(int[]sortedArr,int number){//functia care adauga un element in masiv//
		//fara ca sa stricam sotrirovka//
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

	private static int[] insertDelete(int[]ar,int ind){
		int ar1[]=new int[ar.length-1];
		System.arraycopy(ar,0, ar1, 0, ind);
		System.arraycopy(ar, ind+1, ar1,ind, ar.length-ind-1);
	
     return ar1;
}
}