package controller;

import java.util.Arrays;

public class SalesPersonRandomData extends WageEmployeeRandomData {
	@Override
	public String [] getSpecificData(){
		String [] superData=super.getSpecificData();
		String []data=Arrays.copyOf(superData, N_FIELDS+2);
		data[N_FIELDS]=Integer.toString(getNumber(minRevenue, maxRevenue));
		data[N_FIELDS+1]=Integer.toString(getNumber(minCommissions, maxCommissions));
		return data;
	}

}
