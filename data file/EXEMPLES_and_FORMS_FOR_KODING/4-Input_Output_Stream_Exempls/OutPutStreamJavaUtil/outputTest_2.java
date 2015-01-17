package OutPutStreamJavaUtil;
import java.io.*;
public class outputTest_2 {

	public static void  main(String[] args) throws Exception {
		String str = "2";   
		OutputStream outFile = new FileOutputStream("amir.txt");// dobavit infu  ydalaya proshlyy	
		outFile.write(str.getBytes());
		outFile.close();
		
	}
	
}
