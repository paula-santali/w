package paula.model;
import java.util.Iterator;
import java.util.TreeSet;
public class NumbersTreeSet implements NumbersOperations {
	private TreeSet<Integer> Tset = new TreeSet<Integer>();
	@Override
	public Iterator<Integer> iterator() {	
		return Tset.iterator();
	}

	@Override
	public NumbersOperations getAllNumbers() {
		return this;
	}

	@Override
	public void addNumber(int number) {
		Tset.add(number);
	}

	@Override
	public boolean contains(int number) {
		boolean res=false;
		for(int num:Tset)
			if(num==number)
				res=true;
		return res;
	}

	@Override
	public NumbersOperations getDividedBy(int number) {
		NumbersOperations res=new NumbersTreeSet();
		for(int num:Tset)
			if(num%number==0)
				res.addNumber(num);
		return res;
	}

	@Override
	public NumbersOperations getNumbersGreatThan(int number) {
		NumbersTreeSet nb = new NumbersTreeSet();
		TreeSet<Integer> r = (TreeSet<Integer>)Tset.tailSet(number,false);
		nb.Tset = r;
		return nb;

	}

	@Override
	public NumbersOperations getNumbersLessThan(int number) {
		NumbersTreeSet nb=new NumbersTreeSet();	 
		TreeSet<Integer> res=(TreeSet<Integer>) Tset.headSet(number);
		nb.Tset=res;

		return nb;
	}

	@Override
	public NumbersOperations getNumbersInRange(int min, int max) {
		NumbersOperations res=new NumbersTreeSet();
		for(int num:Tset)
			if(num >= min && num <= max)
				res.addNumber(num);
		return res;
	}
	public NumbersTreeSet(){
		this.Tset = new TreeSet<Integer>();
	}

	public NumbersTreeSet(int[]arr){
		this.Tset = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
			Tset.add(arr[i]);
	}
}
