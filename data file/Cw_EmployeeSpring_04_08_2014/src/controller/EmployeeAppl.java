package controller;

import model.EmployeeDB;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//main pentru simple zaprosuri
//public class EmployeeAppl {

	
	//private static final String QUERY = "SELECT e FROM Employee e";
	//private static final String M_QUERY = "SELECT e.name,e.basicSalary FROM Employee e";
	

	//public static void main(String[] args) {
//		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
//		
//		EmployeeDB employees = (EmployeeDB) ctx.getBean("company");
//		
//		InputEmployee input = (InputEmployee) ctx.getBean("input");
//				EmployeeData empl;
//		while((empl=input.getEmployeeData())!=null){
//			employees.addEmployee(empl.type, empl.basicSalary, empl.id, empl.name, empl.data);
//		}
//		getAnySingleQuery(employees,QUERY);
//		getAnyMultipleQuery(employees,M_QUERY);
//		
//		
//		System.out.println("Company's budget is " +employees.getSalaryBudget());
//		
//		ctx.close();
//	}
//	
//	
//
//	private static void getAnyMultipleQuery(EmployeeDB employees, String strQuery) {
//		String result[]= employees.getAnyMultipleQuery(strQuery);
//		 for(int i = 0;i<result.length;i++)
//		 System.out.println(result[i]);
//		
//	}
//
//	private static void getAnySingleQuery(EmployeeDB employees,String strQuery){ 
//		
//		 String result[]= employees.getAnySingleQuery(strQuery);
//		 for(int i = 0;i<result.length;i++)
//		 System.out.println(result[i]);
//	}
//
//}
