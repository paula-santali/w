package Exceptions;
public class ExceptiontestAppl {

	private static final int MAX = 100000;
	private static final int MIN = 10000;

	static class RangeMaxException extends Exception {
		private static final long serialVersionUID = 1L;
		private int max;
		private int value;
		public RangeMaxException(int max, int value) {
			super("Wrong namber not in range max");
			this.max = max;
			this.value = value;
		}
		public int getMax()   {return max;}
		public int getValue() {return value;}
	}

	static class RangeMinException extends Exception {
		private static final long serialVersionUID = 1L;
		private int min;
		private int value;
		public RangeMinException(int min, int value) {
			super("Wrong namber not in range min");
			this.min = min;
			this.value = value;
		}
		public int getMin()   {return min;}
		public int getValue() {return value;}
	}

	public static void main(String[] args) {
		int countInRange=0;
		int countOutRangemin=0;	
		int countOutRangemax=0;
		for (int i = 0; i < 1000000; i++) {
			try {
				checkRange((int)(Math.random()*Integer.MAX_VALUE));
				countInRange++;
			} catch (RangeMinException e) {
				countOutRangemin++;
				//System.out.println(e.getMessage());
				//System.out.println("value of min-->" + e.getValue());
			}catch (RangeMaxException e) {
				countOutRangemax++;
				//System.out.println(e.getMessage());
				//System.out.println("value of max-->" + e.getValue());
			}
		}
		System.out.println("in range-->"+countInRange);
		System.out.println("not in range min-->"+countOutRangemin);
		System.out.println("not in range max-->"+countOutRangemax);
	}

	private static void checkRange(int number) throws RangeMaxException,RangeMinException   {
		if(number > MAX )
			throw new RangeMaxException( MAX, number);
		if( number < MIN)
			throw new RangeMinException( MIN, number);
	}	
}
