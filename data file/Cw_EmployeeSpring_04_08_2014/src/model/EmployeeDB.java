package model;

import spring.hibernate.JpaDB;

public interface EmployeeDB extends JpaDB{
public boolean addEmployee
(String employeeType,int basicSalary,int id,String name,String[] data);
public Employee removeEmployee(int id);
public int getSalaryBudget();

}
