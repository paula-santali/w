package controller;

public class EmployeeData {
	int id;
	String name;
	int basicSalary;
	String type;
	String data[];
	public EmployeeData(int id, String name, int basicSalary, String type,
			String[]data) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.type = type;
		this.data=data;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public String getType() {
		return type;
	}
	}
