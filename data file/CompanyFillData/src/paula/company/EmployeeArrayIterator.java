package paula.company;

import java.util.Iterator;

import paula.employee.Employee;

public class EmployeeArrayIterator implements Iterator<Employee> {
private Employee[] employees;
private int current=0;
EmployeeArrayIterator(Employee[]employees){
	this.employees=employees;
}
	@Override
	public boolean hasNext() {
		
		boolean  result=false;
		if(current<employees.length&&employees[current]!=null)
			result =true;
			return result;
	}

	@Override
	public Employee next() {
		
		return employees[current++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
