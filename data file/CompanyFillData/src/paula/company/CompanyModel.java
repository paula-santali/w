package paula.company;

import paula.employee.Employee;

public interface CompanyModel extends Iterable<Employee>{
	public void addEmployee(Employee empl);

}
