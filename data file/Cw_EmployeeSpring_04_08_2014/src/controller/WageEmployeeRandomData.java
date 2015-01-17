package controller;


public class WageEmployeeRandomData extends EmployeeRandomData {
	public static final int N_FIELDS=2;
	@Override
	public String[] getSpecificData() {
		String data[]=new String[2];
		data[0]=Integer.toString(getNumber(minWage, maxWage));
		data[1]=Integer.toString(getNumber(minHours,maxHours));
		return data;
	}

	

}
