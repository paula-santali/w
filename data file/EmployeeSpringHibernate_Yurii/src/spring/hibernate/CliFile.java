package spring.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CliFile extends CliTestReader {

	public CliFile(JpaDB db, String fileName) throws FileNotFoundException {
		super(db, new FileInputStream(fileName));
	}

}
