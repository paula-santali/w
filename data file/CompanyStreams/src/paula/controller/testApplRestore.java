package paula.controller;

import paula.model.CompanyFile;
import paula.model.CompanyFileMap;
import paula.model.EmployeeInfo;
import paula.view.CompanyConsolePresentation;
import paula.view.CompanyPresentation;

public class testApplRestore {

	
	public static void main(String[] args) throws Exception {
		CompanyFile company=new CompanyFileMap("testing.txt");
		CompanyPresentation cp=new CompanyConsolePresentation(company);
		company.restoreCompanyFromFile();
		company.removeEmployee(3456);
		cp.showCompany();
		
		company.saveCompanyToFile();

	}
	

}
