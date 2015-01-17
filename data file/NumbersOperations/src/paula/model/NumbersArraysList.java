package paula.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NumbersArraysList implements NumbersOperations {
private Collection<Integer> array;
	@Override
	public Iterator<Integer> iterator() {
		
		return array.iterator();
	}

	@Override
	public NumbersOperations getAllNumbers() {
		
		return null;
	}

	@Override
	public void addNumber(int number) {
		array.add(number);
	}

	@Override
	public boolean contains(int number) {
		boolean res=false;
		for(int num :array)
			if(num==number)
				res=true;
		return res;
	}

	@Override
	public NumbersOperations getDividedBy(int number) {
		NumbersOperations res=new NumbersArraysList();
		for(int num:array)
			if(num%number==0)
				res.addNumber(num);
		return res;
	}

	@Override
	public NumbersOperations getNumbersGreatThan(int number) {
		NumbersOperations res=new NumbersArraysList();
		for(int num:array)
			if(num>number)
				res.addNumber(num);
		return res;
	}

	@Override
	public NumbersOperations getNumbersLessThan(int number) {
		NumbersOperations res=new NumbersArraysList();
		for(int num:array)
			if(num<number)
				res.addNumber(num);
		return res;
	}

	@Override
	public NumbersOperations getNumbersInRange(int min, int max) {
		NumbersOperations res=new NumbersArraysList();
		for(int num:array)
			if(num>min&&num<max)
				res.addNumber(num);
		return res;
	}
	public NumbersArraysList(){
		this.array=new ArrayList<Integer>();
	}
	public NumbersArraysList(int []arr){
		this.array=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			array.add(arr[i]);
	}

}
