package PerfomansTests;

import java.util.Map;

public class PerfomanseTestForMap  implements Runnable{
	private Map<Integer,String> coll;
	private int nElements;
	private int nContains;
	private int nPasses;

	public PerfomanseTestForMap(Map<Integer,String> coll, int nElements, int nContains,int nPasses) {
		this.coll = coll;
		this.nElements = nElements;
		this.nContains = nContains;
		this.nPasses = nPasses;
	}
	@Override
	public void run(){
		long timeStart = System.currentTimeMillis();
		for(int i = 0;i<nElements;i++){
			coll.put(i, "Shalom"+(int)(Math.random()*Integer.MAX_VALUE));
		}
		System.out.println("1--Time of adding-->"+(System.currentTimeMillis()-timeStart));

		timeStart = System.currentTimeMillis();
		for(int i = 0;i<nContains;i++){
			coll.containsValue("Vasy");
		}
		System.out.println("2--Time of contains-->"+(System.currentTimeMillis()-timeStart));

		timeStart = System.currentTimeMillis();
		for(int i = 0;i<nPasses;i++){
			//for(String p: coll){ 
			//TO DO
			//	}
		}
		System.out.println("3--Time of passes-->"+(System.currentTimeMillis()-timeStart));
	}
}
