/**
 * 
 */
package paula.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class NumbersHashSet implements NumbersOperations {
private Collection<Integer>Hash;

	public Iterator<Integer> iterator() {
		
		return Hash.iterator();
	}

	
	@Override
	public NumbersOperations getAllNumbers() {
		
		return null;
	}

	
	@Override
	public void addNumber(int number) {
		Hash.add(number);
	}

	
	@Override
	public boolean contains(int number) {
		boolean res=false;
		for(int num :Hash)
			if(num==number)
				res=true;
		return res;
	}

	
	@Override
	public NumbersOperations getDividedBy(int number) {
		NumbersOperations res=new NumbersHashSet();
		for(int num:Hash)
			if(num%number==0)
				res.addNumber(num);
		
		return res;
	}

	
	@Override
	public NumbersOperations getNumbersGreatThan(int number) {
		NumbersOperations res=new NumbersHashSet();
		for(int num:Hash)
			if(num>number)
				res.addNumber(num);
		return res;
	}

	
	@Override
	public NumbersOperations getNumbersLessThan(int number) {
		NumbersOperations res=new NumbersHashSet();
		for(int num:Hash)
			if(num<number)
				res.addNumber(num);
		return res;
	}

	
	@Override
	public NumbersOperations getNumbersInRange(int min, int max) {
		NumbersOperations res=new NumbersHashSet();
		for(int num:Hash)
			if(num>min&&num<max)
				res.addNumber(num);
		return res;
	}
	public NumbersHashSet(){
		this.Hash=new HashSet<Integer>();
	}
	
	public NumbersHashSet(int []arr){
		this.Hash=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
			Hash.add(arr[i]);
			
	}

}
