package Exceptions;
public class TestForCheckAvalableMemorySize {
	
public static void main(String[] args)  {
		new CheckMemory();
		int maxMemorySize = CheckMemory.getMaxAvalableMemory();
		System.out.println("Max Memory Size is-->"+maxMemorySize+" type (Integer)");
	}

	static class CheckMemory {
		@SuppressWarnings("unused")
		public static boolean isAvalable(int size){
			boolean res = true;
			try{
				Object[]arr = new Object[size];
			}catch(OutOfMemoryError e){
				res = false;
			}	
			return res;	
		}
		
		public static int getMaxAvalableMemory(){
			int left = 0;
			int right = Integer.MAX_VALUE;		
			int size = right;
			int res = 0;
			while(left <= right){	
				size = (right + left)/2;	
				if(isAvalable(size)){	
					res = size; 
					left =  size+1;			
				}else{
					right = size-1;
				}
			} 
			return res;	
		}
	}	
}
