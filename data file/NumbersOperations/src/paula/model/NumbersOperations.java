package paula.model;

public interface NumbersOperations extends Iterable<Integer>{
	public NumbersOperations getAllNumbers();
	public void addNumber(int number);
	public boolean contains(int number);
	public NumbersOperations getDividedBy(int number); // getting all numbers divided by given number
	public NumbersOperations getNumbersGreatThan(int number);
	public NumbersOperations getNumbersLessThan(int number);
	public NumbersOperations getNumbersInRange(int min, int max); //[min, max]


}
