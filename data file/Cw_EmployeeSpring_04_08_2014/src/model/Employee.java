package model;
import javax.persistence.*;
@Entity
public abstract class Employee {
@Id
private int id;
private int basicSalary;
private String name;
private String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(int basicSalary) {
	this.basicSalary = basicSalary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", basicSalary=" + basicSalary + ", name="
			+ name + "]";
}
public abstract int computeSalary();
public abstract void fillData(String [] data);
public void setType(String type) {
	this.type = type;
}
public String getType() {
	return type;
}
}
