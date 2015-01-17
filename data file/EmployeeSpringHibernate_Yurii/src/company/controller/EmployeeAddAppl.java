package company.controller;

import org.springframework.context.support.*;

import company.model.EmployeeDB;


public class EmployeeAddAppl {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=
				new FileSystemXmlApplicationContext("beans.xml");
		InputEmployee input=(InputEmployee) ctx.getBean("data_source");
		EmployeeDB db=(EmployeeDB)ctx.getBean("database");
		while(true){
			EmployeeData data=input.getEmployeeData();
			if(data==null)
				break;
			db.addEmployee(data.type, data.basicSalary, data.id, data.name, data.data);
			
		}
		ctx.close();
		
	}

}
