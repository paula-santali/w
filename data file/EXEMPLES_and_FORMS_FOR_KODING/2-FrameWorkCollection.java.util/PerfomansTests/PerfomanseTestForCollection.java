package PerfomansTests;
import java.util.*;
public class PerfomanseTestForCollection {

	private Collection<Integer> coll;
	private int nElements;
	private int nContains;
	private int nPasses;
	public PerfomanseTestForCollection(Collection<Integer> coll, int nElements, int nContains,int nPasses) {
		this.coll = coll;
		this.nElements = nElements;
		this.nContains = nContains;
		this.nPasses = nPasses;
	}
	
	@SuppressWarnings("unused")
	public void run(){
		long timeStart = System.currentTimeMillis();
		for(int i = 0;i<nElements;i++){
			coll.add((int)(Math.random()*Integer.MAX_VALUE));
		}
		System.out.println("1--Time of adding-->"+(System.currentTimeMillis()-timeStart));

		timeStart = System.currentTimeMillis();
		for(int i = 0;i<nContains;i++){
			coll.contains(100);
		}
		System.out.println("2--Time of contains-->"+(System.currentTimeMillis()-timeStart));

		timeStart = System.currentTimeMillis();
		for(int i = 0;i<nPasses;i++){
			for( Integer print: coll){
			// TO DO
		}
		}
		System.out.println("3--Time of passes-->"+(System.currentTimeMillis()-timeStart));
	}		
}

