
public class ArrayAction {
public static void printArray( int ar[]){
	int i;
	for(i=0;i<ar.length;i++){
    System.out.print(ar[i]+"\t");
	}
}

 public static void printArrayEvens(int ar[]){
int i;
for(i=0;i<ar.length;i++){
	if(ar[i]%2==0)
	System.out.print(ar[i]+"\t");
}

}
 
public static int minInd(int ar[]){
	int i,min;
	for(i=0,min=ar[0];i<ar.length;i++){
		if(ar[i]<min){
			min=ar[i];
		}
	}
	return min;
}
public static void reversArray(int ar[]){
	int i;
	for(i=ar.length-1;i>=0;i--){
		System.out.print(ar[i]+"\t");
	}
}
}