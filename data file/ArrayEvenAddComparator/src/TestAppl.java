import java.util.Arrays;
import java.util.Random;


public class TestAppl {


	private static final int MAX_VALUE = 1000000;

	public static void main(String[] args) {
		Integer array[]=new Integer[100];
		fillArray(array,MAX_VALUE);
		EvenOddComparator comparator=new EvenOddComparator();
		Arrays.sort(array, comparator);
		  System.out.println(Arrays.toString(array));
		int minimal=findMinimal(array,comparator);
		System.out.println("minimal value is: "+minimal);
		int maximal=findMaximal(array,comparator);
		System.out.println("maximal value is: "+maximal);
	}

	private static int findMaximal(Integer[] array, EvenOddComparator comparator) {
		/*	  int index = array.length/2;
			int count1=0,count2=0;
			System.out.println(index +" start");
			while(array[index] > array[index+1]){  // поиск числа цикл 1
				index--;
				System.out.println(index +"  поиск числа цикл 1");
				count1++;
			}
			while(array[index] < array[index+1]){  // поиск числа цикл 2
				index++;  
				System.out.println(index +"  поиск числа цикл 2");
				count2++;
			}
			System.out.println(index +" end");
			System.out.println("счетчик 1 "+count1+"\nсчетчик 2 "+count2);
			return array[index];
		 */	
		int index = array.length/2;
		while(array[index]>array[index+1])index--;
		while(array[index]<array[index+1])index++;
		return array[index];
	}

	private static int findMinimal(Integer[] array, EvenOddComparator comparator) {
		int min;
		if(array[0]<array[array.length-1])
			min=array[0];
		else
			min=array[array.length-1];
		return min;
	}

	private static void fillArray(Integer[] array, int maxValue) {
		Random gen=new Random();
		int max=maxValue+1;
		for(int i=0; i<array.length; i++)
			array[i]=gen.nextInt(max);

	}

}


