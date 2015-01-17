package paula.company.controller;

import java.util.Arrays;

import javax.swing.text.View;

import paula_company.model.Company;
import paula_company.model.CompanyArray;
import paula_company.model.Employee;
import paula_company.view.CompanyConsoleView;
import paula_company.view.CompanyView;

public class EmployeeApp {

	private static final int N_EMPLOYEES = 10;
	private static final int MAX_SALARY = 500;
	private static final int MIN_SALARY = 300;

	public static void main(String[] args) {
	Company comp =new CompanyArray();	
	Employee[] employees=new Employee[N_EMPLOYEES];
	fillEmployees(employees);
	createModel(comp,employees);
	
	CompanyView view =new CompanyConsoleView();
	view.setCompany(comp);
	//Arrays.sort(employees);
	view.showCompany("\nemployee\n");
	
	}

	
	private static void fillEmployees(Employee[] employees) {
	
			for(int i=0;i<employees.length;i++){
				employees[i]=createRandEmploee();
			}
				
		}
		
	

	private static Employee createRandEmploee() {
		int randSalary=(int) ((Math.random()*(MAX_SALARY-MIN_SALARY+1))+MIN_SALARY);
		String[] names={"Moshe","Alla","David","Andrey","Irina","Alex"};
		int indNames=(int)(Math.random()*names.length);
		String randNames= names[indNames];
		Employee emp =new Employee();
		emp.setSalary(randSalary);
		emp.setName(randNames);
		return emp;
		
	}
private static void createModel(Company comp, Employee[] employees) {
		for(int i=0;i<employees.length;i++){
			comp.addEmployee(employees[i]);
		}
		
	}


}
