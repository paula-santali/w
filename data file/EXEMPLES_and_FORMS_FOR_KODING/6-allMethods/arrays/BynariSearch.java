package arrays;
public class BynariSearch {
public static int bynariSearch(int ar[],int value){
	int i,j,mid;
	for(i=0,j=ar.length-1;i<=j;){
		mid=(i+j)/2;
if(ar[mid]==value)
		return 1;
if(value>ar[mid])
		i=mid+1;
if(value<ar[mid])
		j=mid-1;
}
return 0;
}

/*public static void sortArray(int ar[]){
		int res;
		do{
		res=arrays.max_to_end(ar);
	}while(res!=0);
}
public static int max_to_end(int ar[]){
	int i,tmp,flaq=0;
	for(i=0;i<ar.length-1;i++){
	if(ar[i]>ar[i+1]){
	tmp=ar[i+1];
	ar[i+1]=ar[i];
	ar[i]=tmp;
	flaq=1;
}
}
return flaq;
}
*/
public static void main(String[] args) {
	int res;
	int ar[]={12,34,14,56,78,45,92,34,56,21,67,83};
	//sortArray(ar);
	res=bynariSearch(ar,21);
	if(res==0){
	System.out.println("Value isnot found");
}else{
	System.out.println("Value is found");
}
}
}
