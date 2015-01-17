package paula.employee;

public class SalesPerson extends WageEmployee {
	private int salesRevenue;
	private int commisions;
	public SalesPerson(){}
	public SalesPerson(String name,int basicSalary, int wage, int hours, 
	        int salesRevenue,int commissions){
	    super(name,basicSalary,wage,hours);
	    this.salesRevenue=salesRevenue;
	    this.commisions=commissions;
	}


	@Override
	public int computePay() {
		
		return super.computePay()+salesRevenue*commisions/100;
	}

	@Override
	public boolean fillData(Object[] data) {
		boolean result =false;
		super.fillData(data);
		if(data[3]instanceof Integer &&
				data[4]instanceof Integer){
			salesRevenue=(Integer) data[3];
			commisions=(Integer) data[4];
			result=true;
		}
		return result;
		
	}

}
