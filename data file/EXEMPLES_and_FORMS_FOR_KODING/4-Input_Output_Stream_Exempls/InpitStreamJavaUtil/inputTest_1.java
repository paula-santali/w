package InpitStreamJavaUtil;
import java.io.FileInputStream;
public class inputTest_1 {
	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream("amir.txt");
		byte[]b = new byte[input.available()];// input.avalable() = length of file 
		input.read(b);// polychaem info iz file
		String str = new String(b);//constryctor stringa prinimayshiy byte[]
		String[] strings = str.split(" ");//razdelyem string na otdelnie slova i kidaem ih v massiv string
		for(int i=0;i<strings.length;i++)
			System.out.println(strings[i]);
		//System.out.println(str);
		input.close();
	}
}
