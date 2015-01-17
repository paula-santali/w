package A1_list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import PerfomansTests.PerfomanseTestForCollection;
public class ArrayListMethodsTests {
	public static void main(String[] args) {
		List<Integer> test = new LinkedList<Integer>();
		test.add(12);
		test.add(12);
		test.add(15);
		test.add(12);
		test.add(15);
		test.add(13);
		System.out.println(test+" <- first print ArrayList");
		 
		System.out.println(test.size()+" <- test size");
		
		int index = 5;
		test.remove(index);
		System.out.println(test+" <- test after removing by index");
		
		test.remove(new Integer(12));
		System.out.println(test+" <- test after removing by Object");
		
		test.addAll(test);
		System.out.println(test+" <- test after adding all list");
		
		System.out.print(test.get(3)+" <- returns of method get(index);");

		//IMXO.....
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-------------------------PERFOMANSE TESTS------------------------------------------------
		int nElements = 10000;
		int nContains = 10000;
		int nPasses = 10000;
		System.out.println("array list");
		List<Integer> Arrcoll = new ArrayList<Integer>();
		new PerfomanseTestForCollection(Arrcoll, nElements, nContains, nPasses);


	}	
}


