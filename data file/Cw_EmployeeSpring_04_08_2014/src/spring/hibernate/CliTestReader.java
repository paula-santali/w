package spring.hibernate;

import java.io.*;
public class CliTestReader extends CliTest {
	private BufferedReader reader;
	public CliTestReader (JpaDB db,InputStream stream){
		super(db);
		reader=new BufferedReader(new InputStreamReader(stream));
	}
	@Override
	public String getJpaString() {
		String str=null;
		try {
			str=reader.readLine();
			if(str!=null && str.equals(TERMINATOR) )
				str=null;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return str;
	}
	
	

}
