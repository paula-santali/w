package company.model;

import spring.hibernate.JpaDB;

public interface EmployeeDB extends JpaDB{
boolean addEmployee
(String employeeType, int basicSalary, int id,
		String name, String [] data);
int getSalaryBudget();

}
