package A4_map;
import java.util.Map.*;
import java.util.*;
public class TreeMapPrintingTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		// args thes is  args from run configuration of main method
		String[] args1 = {"a","a","u","e","m","k","m","e","e","e"};
		TreeMap<String,Integer> res = new TreeMap<String,Integer>();
		createMap(res,args1);

		System.out.println("map sorted by key");
		printMap(res);// print map sorted by key
		System.out.println("map sorted by value");
		printCompareMap(res);// print map sorted by value	
	}

	static class EntryComparator implements Comparator<Entry<String, Integer>>{
		@Override 
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o1.getValue() - o2.getValue();
		}
	}

	private static void printCompareMap(TreeMap<String, Integer> res) {
		Set<Map.Entry<String, Integer>> entry = res.entrySet();
		List<Entry<String, Integer>> listE = new ArrayList<Entry<String, Integer>>(entry);
		Collections.sort(listE, new EntryComparator());
		for(Entry<String, Integer> in: listE){			
			System.out.println(in.getValue()+" - "+in.getKey());
		}
	}

	private static void printMap(TreeMap<String, Integer> res) {
		Set<Map.Entry<String, Integer>> entry = res.entrySet();
		for(Entry<String, Integer> in: entry)
			System.out.println(in.getKey()+" - "+in.getValue());
	}

	private static void createMap(TreeMap<String, Integer> res, String[] args) {
		int count = 0;
		Integer tmp = 0;
		for(int i=0;i<args.length;i++){	
			tmp = res.get(args[i]);
			if(tmp == null){
				res.put(args[i], 1);
			}else{
				count = tmp;
				count++;
				res.put(args[i], count);
			}
		}
	}
}
