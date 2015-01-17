package paula.controller;

import paula.model.NumbersArraysList;
import paula.model.NumbersHashSet;
import paula.model.NumbersOperations;
import paula.model.NumbersTreeSet;

public class TestAppl {

	
	public static void main(String[] args) {
		int arr[]={2,7,5,4,3,9,8};
		NumbersOperations ress;
		boolean res;
		
		NumbersOperations treSet=new NumbersTreeSet(arr);
		//res=treSet.contains(0);
		//System.out.println(res);
		//ress=treSet.getDividedBy(2);display(ress);
		//ress=treSet.getNumbersGreatThan(5);display(ress);
		//ress=treSet.getNumbersLessThan(7);display(ress);
		//ress=treSet.getNumbersInRange(4, 8);display(ress);
		
		
		NumbersOperations hash=new NumbersHashSet(arr);
		//res=hash.contains(4);
		//System.out.println(res);
		//hash.addNumber(6);display(hash);
		//ress=hash.getDividedBy(3);display(ress);
		//ress=hash.getNumbersGreatThan(5);display(ress);
		//ress=hash.getNumbersLessThan(4);display(ress);
		//ress=hash.getNumbersInRange(2, 7);display(ress);
		
		NumbersOperations array=new NumbersArraysList(arr);
		//res=array.contains(9);System.out.println(res);
		//array.addNumber(11);display(array);
		//ress=array.getDividedBy(4);display(ress);
		//ress=array.getNumbersGreatThan(6);display(ress);
		//ress=array.getNumbersLessThan(5);display(ress);
		//ress=array.getNumbersInRange(4, 8);display(ress);

	}

	private static void display(NumbersOperations ress) {
		for(int num:ress)
			System.out.print(num+" ");
	}

}
