package A2_set;
import java.util.*;
import PerfomansTests.*;
public class HashSetMethodTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//-----------initialization collections----------------------------------------------------
		Set hashSet = new HashSet();  //collection bilding from java
		Set testSet = new HashSet();  //collection bilding from user
		
		//---------Adding objects to colections----------------------------------------------------
		hashSet.add(17);                   //addin objects in to collection  bilding collectoin
		hashSet.add("vasya");              //addin objects in to collection  bilding collectoin
		hashSet.add("Adding number 9");    //addin objects in to collection  bilding collectoin
		hashSet.add(9);                    //addin objects in to collection  bilding collectoin
		//System.out.println(hashSet);       //printin result collection bilding from java
		
		//---------Adding objects to colections----------------------------------------------------
		testSet.addAll(hashSet);      //collection given input all object from java collection
		testSet.add(22);              //addin objects in to collection  bilding collectoin
		testSet.add("petr");          //addin objects in to collection  bilding collectoin
		//System.out.println(testSet);  //printin result 
		
		//-------Removing objects from collections-------------------------------------------------
		//testSet.remove(9);             //removing number 9 from  user collection
		//hashSet.remove("vasya");       //removing "vasya" from  java collection
		//System.out.println(testSet);   //printin result
		//System.out.println(hashSet);   //printin result
		
		//-------Removing All colection THIS!!!----------------------------------------------------
		//hashSet.removeAll(hashSet);      //removing all java collection
		//System.out.println(hashSet);     //printin result
		
		//---------Clearing All collections THIS and OTHERS----------------------------------------
		//hashSet.clear();                       //clearing all elements(objects) in this.collection
		//testSet.clear();                       //clearing all elements(objects) in this.collection
		//System.out.println(hashSet.isEmpty()); //printin result
		//System.out.println(testSet.isEmpty()); //printin result
		
		//------------Methods for operating witch HashSet collection-------------------------------
		//hashSet.contains(testSet);                     
		//testSet.containsAll(hashSet); 
		//System.out.println(hashSet);
		//System.out.println(testSet);

		//-------------Method given HashCode of object in to any collection------------------------
		//System.out.println(hashSet.hashCode());  //given hesh cod from this.object from this.cpllection

		//------------------------- Method Retain All (object o)-----------------------------------
		//System.out.println(testSet.retainAll(hashSet));

		//------Method SIZE given size of any collection-------------------------------------------
		//System.out.println(hashSet.size());//printing size of java collection
		//System.out.println(testSet.size());//printing size of user collection

		//------Formatin from HashSet collection to Array -----------------------------------------
		//Object[] result = testSet.toArray();   //Formatin from HashSet collection to Array
		//for(int i=0;i<result.length;i++)
		//System.out.println(result[i]);         //printin result
		
		//-------Formatin from HashSet collection to Array-----------------------------------------
		//Object[] obj = testSet.toArray(new Object[0]); //Formatin from HashSet collection to Array
		//for(int i=0;i<obj.length;i++)
	    // System.out.println(obj[i]);  		         //printin result		
		//-----------------------------------------------------------------------------------------
		//IMXO.....
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-------------------------PERFOMANSE TESTS------------------------------------------------
		int nElements = 10000;
		int nContains = 10000;
		int nPasses = 10000;
		
		System.out.println("Hash Set Perfomanse test");
		Set<Integer> coll = new HashSet<Integer>();
		new PerfomanseTestForCollection(coll, nElements, nContains, nPasses).run();

		}
	}
