package OutPutStreamJavaUtil;
import java.io.*;
public class outputTest_1 {

	public static void  main(String[] args) throws Exception {
		String str = " data base into";   
		OutputStream outFile = new FileOutputStream("amir.txt",true);// dobavit infu ne ydalaya proshlyy	
		byte[] res = str.getBytes();//perevodim iz string v byte dla zapisi v file
		outFile.write(res);
		outFile.close();
		
	}
	
}
