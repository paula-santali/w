package paula.model;

public interface ComanyFile extends Iterable<EmployeeInfo>{
	public boolean addEmployee(EmployeeInfo emp);
	  public EmployeeInfo removeEmployee(int id);
	  public void saveCompanyToFile() throws Exception;
	  public void restoreCompanyFromFile() throws Exception;
	  
}
