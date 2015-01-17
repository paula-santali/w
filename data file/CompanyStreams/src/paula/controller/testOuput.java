package paula.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import paula.model.CompanyFile;
import paula.model.CompanyFileMap;
import paula.model.EmployeeInfo;

public class testOuput {

	
	public static void main(String[] args) throws Exception {
		CompanyFile company= new CompanyFileMap("testing.txt");
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in)) ;
		String line;
		System.out.println("id,employeeName,companyName,beginnig,salary");
		while(!(line=console.readLine()).equals("exit")){
			EmployeeInfo emp=new EmployeeInfo();
			emp.employeeFromLine(line);
			company.addEmployee(emp);
		}
		company.saveCompanyToFile();

	}

}
