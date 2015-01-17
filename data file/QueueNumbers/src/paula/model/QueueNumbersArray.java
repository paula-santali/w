package paula.model;

public class QueueNumbersArray implements QueueNumbers{
private int[]numbers;
private int limit;

public   QueueNumbersArray(int limit){
	this.limit=limit;
	numbers = new int[limit];
}
	@Override
	public void add(int number)throws OutOfLimitException {
	
	if(numbers[numbers.length-1]!=0)
		throw new OutOfLimitException(limit, number);
	else{
	    int i=0;
	    while(numbers[i]!=0){
		i++;
	    }
	    numbers[i]=number;
	}
	}

	@Override
	public int process() {
		
		int newNum[] = new int[numbers.length];
		System.arraycopy(numbers, 1, newNum, 0, numbers.length-1);
		numbers=newNum;
		
		return numbers[0];
	}

}
