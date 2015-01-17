package company.controller;
import java.util.*;
import java.io.*;
public class RandomInput implements InputEmployee {
private HashMap<String, Integer> types;
private static final String RANDOM_SUFFIX="RandomData";
public RandomInput(String fileName) throws Exception{
	try{
		BufferedReader input = new BufferedReader(new FileReader(fileName)); 
	
		types = new HashMap<String, Integer>();
		String line;
		while (true) {
			line = input.readLine();
			if (line == null)
				break;
			String[] tokens = line.split(" ");
			types.put(tokens[0], Integer.parseInt(tokens[1]));
		}
	} catch (Exception e) {
		System.out.println("Not file with name "+fileName);
	}
}
	@Override
	public EmployeeData getEmployeeData() {
		EmployeeData result=null;
		if (!types.isEmpty()) {
			Set<String> strTypes = types.keySet();
			for (String type : strTypes) {
				int number = types.get(type);
				try {
					Class cl = Class.forName("company.controller."
				+ type+ RANDOM_SUFFIX);
					EmployeeRandomData emplData=(EmployeeRandomData) cl.newInstance();
					result=emplData.getEmployeeData(type);
					number--;
					if(number == 0)
						types.remove(type);
					else
						types.put(type, number);
					break;	

				} catch (Exception e) {
					System.out.println("Wrong type or no default constructor "
							+ e.getMessage());

				}
			}
		}
		return result;
	}

}
