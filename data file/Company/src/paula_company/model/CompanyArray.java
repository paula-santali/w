package paula_company.model;

import java.util.Arrays;

public class CompanyArray implements Company{
private Employee[]employees = new Employee[0];
	@Override
	public Employee[] getEmployee() {
		
		return Arrays.copyOf(employees, employees.length);
	}
public CompanyArray(){
		
	}

	public CompanyArray(Employee[] employees) {
		
		this.employees = employees;
	}

	@Override
	public Employee[] getBySalary(int salary) {
		Employee[] emp=new Employee[employees.length];
		int iResult = 0;
		for(int i=0;i<employees.length;i++){
			if(employees[i].getSalary()==salary)
			emp[iResult++]=employees[i];
		}
		
		return Arrays.copyOf(emp,iResult);
	}


	@Override
	public void addEmployee(Employee empl) {
		Employee[] employe =Arrays.copyOf(employees,employees.length+1);
		employe[employees.length]=empl;
		employees=employe;
		
	}
	
	
}
