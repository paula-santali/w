package controller;
public abstract class EmployeeRandomData {
	int nNames=50;
	int minBasicSalary=1000;
	int maxBasicSalary=2000;
	int minWage=25;
	int maxWage=1000;
	int minHours=100;
	int maxHours=250;
	int minGrade=1;
	int maxGrade=15;
	int minCommissions=10000;
	int maxCommissions=500000;
	int minRevenue=1;
	int maxRevenue=30;
	public void setnNames(int nNames) {
		this.nNames = nNames;
	}
	public void setMinBasicSalary(int minBasicSalary) {
		this.minBasicSalary = minBasicSalary;
	}
	public void setMaxBasicSalary(int maxBasicSalary) {
		this.maxBasicSalary = maxBasicSalary;
	}
	public void setMinWage(int minWage) {
		this.minWage = minWage;
	}
	public void setMaxWage(int maxWage) {
		this.maxWage = maxWage;
	}
	public void setMinHours(int minHours) {
		this.minHours = minHours;
	}
	public void setMaxHours(int maxHours) {
		this.maxHours = maxHours;
	}
	public void setMinGrade(int minGrade) {
		this.minGrade = minGrade;
	}
	public void setMaxGrade(int maxGrade) {
		this.maxGrade = maxGrade;
	}
	public void setMinCommissions(int minCommissions) {
		this.minCommissions = minCommissions;
	}
	public void setMaxCommissions(int maxCommissions) {
		this.maxCommissions = maxCommissions;
	}
	public void setMinRevenue(int minRevenue) {
		this.minRevenue = minRevenue;
	}
	public void setMaxRevenue(int maxRevenue) {
		this.maxRevenue = maxRevenue;
	}
	public EmployeeRandomData(){
		
	}
	public EmployeeData getEmployeeData(String type){
		int id=getNumber(1,Integer.MAX_VALUE);
		String name="name"+getNumber(0,nNames);
		int basicSalary=getNumber(minBasicSalary,maxBasicSalary);
		String [] data=getSpecificData();
		EmployeeData emplData=new EmployeeData
				(id,name,basicSalary,type,data);
		return emplData;
	}
	protected int getNumber(int min, int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
	public abstract String[] getSpecificData() ;
}
