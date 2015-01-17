package model;

public interface EmployeeDB {
public boolean addEmployee
(String employeeType,int basicSalary,int id,String name,String[] data);
public Employee removeEmployee(int id);
public int getSalaryBudget();

}
