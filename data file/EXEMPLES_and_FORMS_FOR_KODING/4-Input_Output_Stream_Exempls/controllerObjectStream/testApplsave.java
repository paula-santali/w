package controllerObjectStream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

public class testApplsave {
	// this is BYTE oriented stream
	public static void main(String[] args) throws Exception {
		HashMap<String,book> bo = new HashMap<String,book>();
		createBook(bo);
		saveBook("test",bo);
	}
	// rabota s stream object 
	private static void saveBook(String fileName, HashMap<String, book> bo) throws Exception{
		// for all objects !!!
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
		out.writeObject(bo);
		//---------------------
		// for collection or another arrays	
		Collection<book> library = bo.values();
		for(book bk: library)
			out.writeObject(bk);	

		
		
		out.close();
	}

	private static void createBook(HashMap<String, book> bo) throws Exception {
		BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = cons.readLine()) != null){
			if(line .equalsIgnoreCase("exit")){break;}
			String[] parts = line.split("&");
			String title = parts[0];
			String author = parts[1];
			int price = Integer.parseInt(parts[2]);
			book b = new book(title,price,author);
			bo.put(title, b);		
		}	
	}
}
