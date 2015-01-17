package A1_list;

import java.util.LinkedList;
import java.util.List;

import PerfomansTests.PerfomanseTestForCollection;

public class LinkedListMethodsTests {

	public static void main(String[] args) {
		List<Integer> test = new LinkedList<Integer>();
		test.add(12);
		test.add(12);
		test.add(15);
		test.add(12);
		test.add(15);
		test.add(13);
		System.out.println(test+" <- first print LinkedList");
		
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
		System.out.println("linked list");
		List<Integer> Licoll = new LinkedList<Integer>();
		new PerfomanseTestForCollection(Licoll, nElements, nContains, nPasses);


		long TimeStart = System.currentTimeMillis();
		LinkedList<Object> list = new LinkedList<Object>();
		passLinkedList(list,nPasses);
		System.out.println(System.currentTimeMillis()-TimeStart+" <-current time of work personale test");

	}
	/** etot obxod pravilno !!!*/
	public static  void passLinkedList(LinkedList<Object> list, int nPassed) {
		for(int i=0;i<nPassed;i++){
			for(Object num:list){	
				//	TO DO		                              
			}
		}
	}
}
/**                           etot obxod NEPRAVILNIY SPOSOB!!!!!!!!!!!!!

	private static void passLinkedList2(LinkedList<Integer> list, int nPassed) {
	for(int i=0;i<nPassed;i++){
		for(int j=0;j<list.size();i++){
			Integer num = list.get(j);                   
		}}}
 */

