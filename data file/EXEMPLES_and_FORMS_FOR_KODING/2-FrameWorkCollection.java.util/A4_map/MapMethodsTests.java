package A4_map;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import PerfomansTests.PerfomanseTestForMap;

public class MapMethodsTests {

	public static void main(String[] args) {

		int key = 0;
		Map<Integer,String> hm = new HashMap<Integer,String>();//created new collection of hash map	

		hm.put(key++, "vasy"); // adding a value witch key to new this collection
		hm.put(key++, "pety");
		hm.put(key++, "vasy");

		Map<Integer,String>  tm = new TreeMap<Integer,String>();//created new collection of tree map

		tm.putAll(hm);          // add all this collection to new collection
		tm.put(key++, "pety");  // adding a value witch key to new this collection	
		/* 
		//-------------hash map methods--------------------------------------
		System.out.println(hm.containsKey(2));        // contains by key
		System.out.println(hm.containsValue("vasy")); // conteins by value
		//-------------tree map methods--------------------------------------
		System.out.println(tm.containsKey(2));        // contains by key
		System.out.println(tm.containsValue("vasy")); // conteins by value
		 */
		/*
		System.out.println(hm.equals(tm));// equals of two objects of map 
		 */
		/*
		System.out.println("Size of HM-> "+hm.size()+"\nSize of TM-> "+tm.size());
		 */
		/*
		hm.remove(2); // remove the element from collections by key
		tm.remove(2);// remove the element from collections by key
		 */
		/*
        hm.hashCode();// returning a hash cod from element this of collection
		 */
		/*
		//-------------hash map methods--------------------------------------
		System.out.println(hm.keySet());// returned all key from collection
		System.out.println(hm.values());// returned all value from collection
        //-------------tree map methods--------------------------------------
		System.out.println(tm.keySet());// returned all key from collection
		System.out.println(tm.values());// returned all value from collection
		 */
		/*
		System.out.println(hm.isEmpty());// method isEmpty: return false if collection not empty,
		System.out.println(tm.isEmpty());// and return true if collection is empty
		 */
		/*
		System.out.println(hm.get(0)); // get element only by key, getting elements from 0... 
		System.out.println(tm.get(1)); // get element only by key, getting elements from 0... 
		 */
		/*
		System.out.println(hm.entrySet());// printed all value of collection
		System.out.println(tm.entrySet());// printed all value of collection
		 */

		System.out.println(hm);// this System.out.println only for print exemples of collections methods
		System.out.println(tm);// this System.out.println only for print exemples of collections methods

		//----------------------------------------------------------------------------------------------
		/*
		hm.clear();// clearing all map collection to empty
		tm.clear();// clearing all map collection to empty
		System.out.println(hm);//print for exemple of collections methods clear
		System.out.println(tm);//print for exemple of collections methods clear
		 */
		/*
		System.out.println(hm.isEmpty());//print for exemple of collections methods isEmpty
		System.out.println(tm.isEmpty());//print for exemple of collections methods isEmpty
		 */

		//IMXO.....
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-------------------------PERFOMANSE TESTS------------------------------------------------
		int nElements = 10000;
		int nContains = 10000;
		int nPasses = 10000;

		System.out.println("Hash Map Perfomanse test");
		Map<Integer,String> coll1 = new HashMap<Integer,String>();
		new PerfomanseTestForMap(coll1, nElements, nContains, nPasses).run();

		System.out.println("Tree Map Perfomanse test");
		Map<Integer,String> coll2 = new TreeMap<Integer,String>();
		new PerfomanseTestForMap(coll2, nElements, nContains, nPasses).run();

	}

}
/*@Override    ENTRY METHODS !!!!!!!!!
public List<Personinfo> getPersonSortedByAge() {

Map<Integer,List<T>> 
Set<Integer> keys = personsAge.keySet();
List<T> res = new ArrayList<T>();
for(Integer k: keys)
	res.addAll(personsAge.get(k));
	
	
Set<Entry<Integer,List<Personinfo>>> rqqq = personsAge.entrySet();
for(Entry<Integer,List<Personinfo>> resq : rqqq)
	System.out.println(resq.getKey()+"----"+resq.getValue());

return res;


private List<Personinfo> mapToArray(Map<?, List<Personinfo>> pi) {		
		Collection<List<Personinfo>> res = pi.values();
		List<Personinfo> resList = new ArrayList<Personinfo>();
		for(List<Personinfo> p:res)
		resList.addAll(0,p);
		return resList;
	}
}*/