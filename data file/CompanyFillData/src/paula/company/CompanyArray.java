package paula.company;

import java.util.Arrays;
import java.util.Iterator;

import paula.employee.Employee;

public class CompanyArray implements CompanyModel {
	private Employee[] employees;
	public CompanyArray(){
		employees=new Employee[0];
		
	}
	@Override
	public Iterator<Employee> iterator() {
		EmployeeArrayIterator e_iterator=new EmployeeArrayIterator(employees);
		return e_iterator;
	}
	
	
	@Override
	public void addEmployee(Employee empl) {
		Employee[] employee=Arrays.copyOf(employees, employees.length+1);
		employee[employees.length]=empl;
		employees=employee;
		
		
	}
	
}
