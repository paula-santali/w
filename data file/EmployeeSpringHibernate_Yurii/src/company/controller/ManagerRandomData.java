package company.controller;

public class ManagerRandomData extends EmployeeRandomData {

	@Override
	public String[] getSpecificData() {
		String data[]=new String[1];
		data[0]=Integer.toString(getNumber(minGrade, maxGrade));
		return data;
	}

}
