
public class WageEmployee extends Employee {
private int wage;
private int hours;


	@Override
	public int computePay() {
		
		return getBasicSalary()+wage*hours;
	}


	public int getWage() {
		return wage;
	}


	public void setWage(int wage) {
		this.wage = wage;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}
	public WageEmployee(){
		
	}
	
	public WageEmployee(String name,int basicSalary,int wage,int hours){
		setName(name);
		setBasicSalary(basicSalary);
		this.wage=wage;
		this.hours=hours;

		}


	@Override
	public String toString() {
		return "WageEmployee [wage=" + wage + ", hours=" + hours
				+ " " + super.toString() ;
	}


}
