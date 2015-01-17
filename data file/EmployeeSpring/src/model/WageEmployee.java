package model;
import javax.persistence.*;
@Entity
public class WageEmployee extends Employee {
 private int wage;
 private int hours;
	@Override
	public int computeSalary() {
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
	@Override
	public String toString() {
		return "WageEmployee [wage=" + wage + ", hours=" + hours
				+ ", Employee=" + super.toString() + "]";
	}

	@Override
	public void fillData(String[] data) {
	 wage=Integer.parseInt(data[0]);
	 hours=Integer.parseInt(data[1]);
		
	}
	
	
}
