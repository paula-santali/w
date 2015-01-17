package A2_set;
import java.util.*;

import PerfomansTests.PerfomanseTestForCollection;
public class TreeSetmethodsTests {
	public static void main(String[] args) {
		Collection<Integer> col = new TreeSet<Integer>();
		Collection<Integer> result = null;
		int[]arr = {1,2,7,5,6,8,33,5,8,7,6,3,2,33,8,99,22,6};
		for(int i=0;i<arr.length;i++){
			col.add(arr[i]);
		}
		System.out.println("add to set");
		display(col);	
		System.out.println("head set");
		result = ((NavigableSet<Integer>)col).headSet(33);
		display(result);
		System.out.println("head set vich true");
		result = ((NavigableSet<Integer>)col).headSet(33,true);
		display(result);
		System.out.println("tail set");
		result = ((NavigableSet<Integer>)col).tailSet(33);
		display(result);
		System.out.println("sub set ");
		result = ((NavigableSet<Integer>)col).subSet(22, 45);// from too not including from and too
		display(result);
		System.out.println("sub set vich true ");
		result = ((NavigableSet<Integer>)col).subSet(22, false, 45,true);// from too including
		display(result);
		int res = ((NavigableSet<Integer>)col).ceiling(30);
		System.out.println(res);

		Collection<String> hk = new TreeSet<String>();
		String array1[] = {"asd","jkk","rty","ikl"};
		for(int i=0; i<array1.length; i++){      //obhodim nash massiv
			hk.add(array1[i]); 
		}
		String str = ((NavigableSet<String>)hk).ceiling("asi");
		System.out.println(str);

		NavigableSet<Integer> nl = new TreeSet<Integer>();
		nl.ceiling(3);//vozvrashaet naimenshiy sredi bolwih vclychay element cto daem 
		nl.floor(5);// vernet nam naibolwiy sredi menshix vkly4aya peredanniy
		nl.add(100);
		/*SortedSet cl = new TreeSet();			
		cl.headSet(4);//vozvrashaet massiv strogo menwe ykazannogo elementa
		cl.tailSet(4);//vozvrashaet massiv bolwe ili ravno ykazannomy elementy
		cl.subSet(3, 5);//vozvrashaet massiv bolwe ili ravno from elem, i strogo menwe to elem(bez to elem)
		NavigableSet<Integer> nl = new TreeSet();
		nl.ceiling(3);//vozvrashaet naimenshiy sredi bolwih vclychay element cto daem 
		nl.floor(5);// vernet nam naibolwiy sredi menshix vkly4aya peredanniy
		nl.add(100);*/
		int[]arr2 = {1,2,7,5,6,8,33,5,8,7,6,3,2,33,8,99,22,6};
		for(int i=0;i<arr2.length;i++){
			nl.add(arr2[i]);
		}
		display(nl);	

		//IMXO.....
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-------------------------PERFOMANSE TESTS------------------------------------------------
		int nElements = 10000;
		int nContains = 10000;
		int nPasses = 10000;

		System.out.println("Tree set Perfomanse test");
		Set<Integer> coll2 = new TreeSet<Integer>();
		new PerfomanseTestForCollection(coll2, nElements, nContains, nPasses).run(); 
	}

	private static void display(Collection<Integer> col) {
		for(int print:col)
			System.out.println(print);

	}}

