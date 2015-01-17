package controller;
import java.lang.reflect.Constructor;
public class testReadFromArgument{

	public static void main(String[] args) throws Exception {
		//new MyPersonalClass().run();

		Class<?> cl = Class.forName("imeaMaevoKlassa");//
		Object obj = cl.newInstance();	
		MyPersonalClass test = (MyPersonalClass) obj;
		test.run();

		Constructor<?>con = cl.getConstructor();
		//con.newInstance(con);
	}


}
