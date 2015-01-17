package spring.hibernate;

public abstract class CliTest implements ICliTest {
	protected JpaDB database;
	public CliTest(JpaDB database) {
		this.database=database;
	}

	@Override
	public String[] execute(String jpaStr) {
		String [] tokens=jpaStr.split(" ",2);
		String result[]=null;
		if(tokens[1].indexOf(',')<0)
			result=database.getAnySingleQuery(jpaStr);
		else
			result=database.getAnyMultipleQuery(jpaStr);
		return result;
	}

	

}
