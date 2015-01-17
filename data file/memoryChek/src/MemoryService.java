
 public class MemoryService {
public static boolean isAvailable(int size){
    boolean result=true;
    try{
    Object [] array=new Object [size];
    }catch (OutOfMemoryError e){
        result=false;
    }
    return result;
}
public static int getMaxAvailableMemory(){
    int left=0;
    int right=Integer.MAX_VALUE;
    int result=0;
    int size;
    while(left <= right){
        size=(right+left)/2;
        if(isAvailable(size))
        {
        	System.out.println(size+"<-- size");
            result=size;
            left=size+1;
            System.out.println(left+"<--left");
        }
        else{
        	System.out.println(right+" <--right");
            right=size-1;
        }
    }
     
    return result;
    /*int result = 0;
    int size=Integer.MAX_VALUE;
    try{
    Object [] maxArray=new Object [size];
 
    }catch (OutOfMemoryError e){
         
    int i,j,mid;
    for(i=0,j=size;i<=j;){
        mid=(i+j)/2;
        if(isAvailable(mid)==true)
            i=mid+1;
        if(isAvailable(mid)==false)
            j=mid-1;
            result=i;
    }
     
}
return result;*/
}
public static int getMaxAvailableMemory(int left, int right) { 
     
    int result = right; 
   
    while((right - left) > 1 && !isAvailable(right) ) { 
        System.out.println("left "+left +" right "+right +" result " +result); 
        result = (right + left)/2; 
        if(!isAvailable(result)) 
            right = result; 
        else if(result < right) 
            left = result; 
        else
            break;   
    } 
   
   
return result; 
       
} 
}
