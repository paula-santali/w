package contoller;

import model.EmployeeDB;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeAppl {

	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		EmployeeDB employees= (EmployeeDB) ctx.getBean("company");

		String [] wageData={"200","150"};
		String [] managerData={"10"};
		String [] salesData={"80","100","1000","3"};
		employees.addEmployee("WageEmployee", 2000, 1234, "Vasea", wageData);
		employees.addEmployee("Manager", 10, 1244, "Serj", managerData);
		employees.addEmployee("SalesPerson",  20,1245, "Alla", salesData);
		System.out.println("Company's budget is " +employees.getSalaryBudget());
	}

}
