package paula.employee;

public abstract class Employee {
	private String name;
	private int basicSalary;
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public int getBasicSalary() {
	    return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
	    this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
	    return "Employee [name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	public abstract int computePay();
	
	public abstract boolean fillData(Object [] data);

}
