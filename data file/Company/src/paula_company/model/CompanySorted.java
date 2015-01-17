package paula_company.model;
import java.util.Arrays;
public class CompanySorted implements Company {
	private Employee[]employees ; 
	public CompanySorted(){		
	}
	
	@Override
	public Employee[] getEmployee() {	
		return Arrays.copyOf(employees,employees.length);
	}

	@Override
	public Employee[] getBySalary(int salary) {
			  Employee pattern = new Employee();
			  pattern.setSalary(salary);
			  int index = Arrays.binarySearch(employees, pattern);
			  int index1 = index;
			  if(index<0)
			   return Arrays.copyOfRange(employees, 0,0);
			  else
			     while(index>=0&&employees[index].getSalary()==salary)
			      index--;
			  
			  if(index1<0)
			   return Arrays.copyOfRange(employees, 0, 0);
			  else
			   while(index1<employees.length&&employees[index1].getSalary()==salary)
			    index1++;
			  
			  return Arrays.copyOfRange(employees, index+1, index1);
	}
	@Override
	public void addEmployee(Employee empl) {
		Employee[] emp=new Employee[employees.length+1];
		int index=Arrays.binarySearch(employees, empl);
		if(index<0) 
			index=-index-1;
		System.arraycopy(employees, 0, emp, 0, index);
		emp[index]=empl;
		System.arraycopy(employees, index, emp, index+1, employees.length-index);
		employees=emp;
	
	}
    public CompanySorted(Employee[] emps){
    	this.employees=emps;
		employees=emps;
		Arrays.sort(employees);
	}
}
