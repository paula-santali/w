package controllerObjectStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
public class testApplrestore {
// this is BYTE oriented stream
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws Exception, IOException {
		HashMap<String,book> bo = null;
		// for all objects !!!
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("test"));
		bo = (HashMap<String, book>) input.readObject();
		System.out.println(bo);
		
		//---------------------------------------------------
		// for collection or another arrays			
		while(true){
			book bk;
			try {		
				bk = (book) input.readObject();
				bo.put(bk.getTitle(), bk);
			} catch (Exception e) {
				break;
			} 
		}
		
		
		input.close();
	}
}
