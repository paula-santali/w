package paula.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeInfo implements Serializable{
private int id;
private String employeeName;
private String companyName;
private Date beginning;
private int salary;
 public EmployeeInfo(){
	 
 }
public EmployeeInfo(int id, String employeeName, String companyName,
		Date beginning, int salary) {
	
	this.id = id;
	this.employeeName = employeeName;
	this.companyName = companyName;
	this.beginning = beginning;
	this.salary = salary;
}
public int getId() {
	return id;
}
public String getEmployeeName() {
	return employeeName;
}
public String getCompanyName() {
	return companyName;
}
public Date getBeginning() {
	return beginning;
}
public int getSalary() {
	return salary;
}
private void setId(int id) {
	this.id = id;
}
private void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
private void setCompanyName(String companyName) {
	this.companyName = companyName;
}
private void setBeginning(Date beginning) {
	this.beginning = beginning;
}
private void setSalary(int salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((beginning == null) ? 0 : beginning.hashCode());
	result = prime * result
			+ ((companyName == null) ? 0 : companyName.hashCode());
	result = prime * result
			+ ((employeeName == null) ? 0 : employeeName.hashCode());
	result = prime * result + id;
	result = prime * result + salary;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeInfo other = (EmployeeInfo) obj;
	if (beginning == null) {
		if (other.beginning != null)
			return false;
	} else if (!beginning.equals(other.beginning))
		return false;
	if (companyName == null) {
		if (other.companyName != null)
			return false;
	} else if (!companyName.equals(other.companyName))
		return false;
	if (employeeName == null) {
		if (other.employeeName != null)
			return false;
	} else if (!employeeName.equals(other.employeeName))
		return false;
	if (id != other.id)
		return false;
	if (salary != other.salary)
		return false;
	return true;
}
public String  employeeToLine(){
	return companyName;
	
}
public void employeeFromLine(String line){
	
}
@Override
public String toString() {
	return "EmployeeInfo [id=" + id + ", employeeName=" + employeeName
			+ ", companyName=" + companyName + ", beginning=" + beginning
			+ ", salary=" + salary + "]";
}
 
}
