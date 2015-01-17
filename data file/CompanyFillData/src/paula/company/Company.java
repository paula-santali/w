package paula.company;

import java.util.Iterator;

import paula.employee.Employee;

public class Company {
private CompanyModel model;

public Company(CompanyModel employees){
	this.model=employees;
}
@SuppressWarnings("rawtypes")
public  void addEmployee(String name,int basicSalary,Object[]data) throws Exception{
	if(data[0] instanceof String ){
		String typeName = (String)data[0];
		Class cl = Class.forName("paula.employee."+typeName);
		Object obj = cl.newInstance();
		if (obj instanceof Employee){
			Employee employee = (Employee) obj;
			employee.fillData(data);
			employee.setName(name);
			employee.setBasicSalary(basicSalary);
			model.addEmployee(employee);
			
		}
	}
}public int getSalaryBudget(){
    int salary=0;
    for(Employee empl : model){
        salary+= empl.computePay();
    System.out.println(empl);
    }
    return salary;
}


}





