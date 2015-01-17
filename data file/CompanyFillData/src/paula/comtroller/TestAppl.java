package paula.comtroller;

import paula.company.Company;
import paula.company.CompanyArray;
import paula.company.CompanyModel;

public class TestAppl {
	public static void main(String[] args) throws Exception {
		Object[]managerData=new Object[2];
		managerData[0]="Manager";
		managerData[1]=15;
		
		Object[]wageEmplData=new Object[3];
		wageEmplData[0]="WageEmployee";
		wageEmplData[1]=100;
		wageEmplData[2]=150;
		
		Object[]salesPersonData=new Object[5];
		salesPersonData[0]="SalesPerson";
		salesPersonData[1]=50;
		salesPersonData[2]=100;
		salesPersonData[3]=1000;
		salesPersonData[4]=2;
		
		CompanyModel model=new CompanyArray();
		Company company=new Company(model);
		company.addEmployee("Moshe",1000,managerData);
		company.addEmployee("Serg",1000,wageEmplData);
		company.addEmployee("Vova", 500, salesPersonData);
		System.out.println(company.getSalaryBudget());
		
		
	}

	

}
