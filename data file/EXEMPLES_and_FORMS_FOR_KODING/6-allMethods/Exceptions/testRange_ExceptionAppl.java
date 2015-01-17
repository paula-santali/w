package Exceptions;

public class testRange_ExceptionAppl {
	
	private static final int MAX = 100000;
	private static final int MIN = 10000;
	
	static class Range_Exception extends Exception {
		private static final long serialVersionUID = 1L;
		private int min;
		private int max;
		private int value;
		public Range_Exception(int min, int max, int value) {
			super("Wrong namber not in range");
			this.min = min;
			this.max = max;
			this.value = value;
		}
		public int getMin()   {return min;}
		public int getMax()   {return max;}
		public int getValue() {return value;}
	}

	public static void main(String[] args) {
		int countInRange=0;
		int countOutRange=0;	
		for (int i = 0; i < 1000000; i++) {
			try {
				checkRange((int)(Math.random()*Integer.MAX_VALUE));
				countInRange++;
			} catch (Range_Exception e) {
				countOutRange++;
				//System.out.println(e.getMessage());
				//System.out.println("value of val-->" + e.getValue());
			}
		}
		System.out.println("in range-->"+countInRange);
		System.out.println("not in range-->"+countOutRange);
	}

	private static void checkRange(int number) throws Range_Exception {
		if(number > MAX || number < MIN)
			throw new Range_Exception(MIN, MAX, number);	
	}
}
