package model;

import javax.persistence.*;

@Entity
public class SalesPerson extends WageEmployee {
private int revenue;
private int percent;
public int getRevenue() {
	return revenue;
}
public void setRevenue(int revenue) {
	this.revenue = revenue;
}
public int getPercent() {
	return percent;
}
public void setPercent(int percent) {
	this.percent = percent;
}
@Override
public String toString() {
	return "SalesPerson [revenue=" + revenue + ", percent=" + percent + "]"+super.toString();
}
@Override
public int computeSalary() {
	return super.computeSalary()+revenue*percent/100;
}
@Override
public void fillData(String[] data) {
	super.fillData(data);
	@SuppressWarnings("unused")
	int index =WageEmployee.N_FIELDS;
 revenue=Integer.parseInt(data[2]);
 percent=Integer.parseInt(data[3]);
	
}
}
