package paula.view;

import paula.model.CompanyFile;
import paula.model.EmployeeInfo;

public class CompanyConsolePresentation implements CompanyPresentation{
 private CompanyFile company; 
 
 public CompanyConsolePresentation(CompanyFile company){
	 this.company=company;
 }
	@Override
	public void showCompany() {
		for(EmployeeInfo employee:company){
			System.out.println(employee);
		}
			
	}
	

}
