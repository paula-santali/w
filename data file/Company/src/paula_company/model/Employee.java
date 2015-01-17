package paula_company.model;

public class Employee implements Comparable<Employee>{
	private int salary;
	private String name;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee arg0) {
		
		return salary-arg0.salary;
	}

}
