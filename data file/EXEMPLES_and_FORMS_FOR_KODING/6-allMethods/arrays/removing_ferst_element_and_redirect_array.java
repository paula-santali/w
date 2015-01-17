package arrays;

public class removing_ferst_element_and_redirect_array {
	public int process() {
		int[] numbers = new int[10];	
		int size = 0;
		
		int res = numbers[0];	
		if(size > 0){
			size--;
			for(int i = 0;i < size;i++)
				numbers[i] = numbers[i+1];
		}
		return res; 
	}
}
