package paula_company.model;

public interface Company {
	public Employee[]getEmployee();
	public Employee[]getBySalary(int salary);
	public void addEmployee(Employee empl);

}
