import java.util.*;


public class testPrintString {

	
	public static void main(String[] args) {
     TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		
		createMap(map,args);
		printMap(map);

	}
	

	private static void createMap(TreeMap<String, Integer> map, String[] args) {
		for(int i=0;i<args.length;i++){
			
			Integer res;
			int count;

			res=map.get(args[i]);
			if(res==null)
			map.put(args[i], 1);
		else{
				count=res;
				count++;
			
				map.put(args[i], count);
			}
			
		}
		}



	private static void printMap(TreeMap<String, Integer> map) {
		Set<Map.Entry<String,Integer>> entries= map.entrySet();
		for(Map.Entry<String, Integer>entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	/*private static void createMap(TreeMap<String, Integer> map, String[] args) {
		for(int i=0;i<args.length;i++){
			
		Integer res;
		int count;
		res=map.get(args[i]);
		if(res==null)
		map.put(args[i], 1);
		else{
			count=res;
			count ++;
			map.put(args[i], count);			
		}
		
	}
	}*/
}
