package InpitStreamJavaUtil;
import java.io.FileInputStream;
public class inputTest_2 {

	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream("amir.txt");
		byte[]b = new byte[input.available()];// input.avalable() = length of file 
		input.read(b);// polychaem info iz file
		String str = new String(b);//constryctor stringa prinimayshiy byte[]ais		
		int num = Integer.parseInt(str)	;// preobrazyem iz cisla v string  v cislo int
		num = num + 10;
		System.out.println(num);
		System.out.println(Integer.parseInt(str));	
		input.close();		
	}
}
