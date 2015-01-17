package Strings;
import java.util.Random;


public class Test {
	public static void main(String[] args) {
		int ar[] = new int [10000]; 
		long timeStart;
		long timeStop;
		Random rand = new Random();
		
		for(int i=0;i<ar.length;i++){
			ar[i] = rand.nextInt(1000);
		}
		
		timeStart = System.currentTimeMillis();
		numbersToString(ar,'*');
		timeStop = System.currentTimeMillis();
		System.out.println("time ellasted for string solution - 1 "+(timeStart-timeStop));				
	
		
		
		timeStart = System.currentTimeMillis();
		numbersToString1(ar,'*');
		timeStop = System.currentTimeMillis();
		System.out.println("time ellasted for string solution - 2 "+(timeStart-timeStop));
		 
//		
//		timeStart = System.currentTimeMillis();
//		numbersToString2(ar,'*');
//		timeStop = System.currentTimeMillis();
//		System.out.println("time ellasted for string solution - 3 "+(timeStart-timeStop));
	
	}

	private static String numbersToString(int[] numbers, char separator) {
		StringBuffer strBuf = new StringBuffer(Integer.toString(numbers[0]));
		for(int i = 1;i < numbers.length;i++){
		strBuf.append(separator).append(Integer.toString(numbers[i]));
		}	 
		return strBuf.toString();
	}


	private static String numbersToString1(int[] ar, char c) {
		StringBuffer strBuf = new StringBuffer();
		for(int i = 0;i < ar.length;i++){
			strBuf.append(ar[i]);
			if(i < ar.length - 1)
			strBuf.append(c);
		}	 
		return strBuf.toString();
	}
//	private static String numbersToString2(int[] ar, char c) {
//		String str = Integer.toString(ar[0]);
//		for(int i = 1;i < ar.length;i++){
//			str = str + c + Integer.toString(ar[i]);
//		}
//		return str;
//	}
	}
	
	

