package spring.hibernate;

public class CliConsole extends CliTestReader {

	public CliConsole(JpaDB db) {
		super(db, System.in);
	}

}
