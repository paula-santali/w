package paula.model;

public interface CompanyFile extends Iterable<EmployeeInfo> {
  public boolean addEmployee(EmployeeInfo emp);
  public EmployeeInfo removeEmployee(int id);
  public void saveCompanyToFile() throws Exception;
  public void restoreCompanyFromFile() throws Exception;
  public void createPersons(EmployeeInfo emp);
  public void savePersons(EmployeeInfo emp);

}
