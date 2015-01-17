
public class SalesPerson extends WageEmployee {
private int salesRevenue;
private int commisions;

public int getSalesRevenue() {
	return salesRevenue;
}
public void setSalesRevenue(int salesRevenue) {
	this.salesRevenue = salesRevenue;
}
public int getCommisions() {
	return commisions;
}
public void setCommisions(int commisions) {
	this.commisions = commisions;
}
public SalesPerson(){
	
}
public SalesPerson(String name,int basicSalary,int wage,int hours,int salesRevenue,int commisions){
	super(name,basicSalary,wage,hours);
	//setName(name);
	//setBasicSalary(basicSalary);
	//setWage(wage);
	//setHours(hours);
	this.salesRevenue=salesRevenue;
	this.commisions=commisions;	
}
public int computePay(){
	return getWage()+salesRevenue*commisions/100;
	
}
@Override
public String toString() {
	return "SalesPerson [salesRevenue=" + salesRevenue + ", commisions="
			+ commisions + " " + super.toString() + "]";
}
}
