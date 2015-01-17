package paula_company.view;

import paula_company.model.Company;
import paula_company.model.Employee;

public class CompanyConsoleView implements CompanyView{
private Company company;
	@Override
	public void showCompany(String str) {
		System.out.println(str);
		Employee[] CompView=company.getEmployee();
		for(int i=0;i<CompView.length;i++)
		System.out.println(CompView[i]);
		
	}

	@Override
	public void setCompany(Company company) {
		this.company=company;
	}
	
}
