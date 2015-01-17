package arrays;

public class SeparatorInArray  {
	public static void main(String[] args) {
		int ar[] = {-10, 8, 5, -40, 0} ; 
		String str = numbersToString(ar,'*'); 
		System.out.println(str); //output: -10*8*5*-40 
	}

	private static String numbersToString(int[] numbers, char separator) {
		StringBuffer strBuf = new StringBuffer();
		for(int i = 0;i < numbers.length;i++){
			strBuf.append(numbers[i]);
			if(i < numbers.length - 1)
			strBuf.append(separator);
		}	 
		return strBuf.toString();
	}
}
