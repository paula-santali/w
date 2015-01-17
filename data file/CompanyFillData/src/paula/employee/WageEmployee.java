package paula.employee;

public class WageEmployee extends Employee {
	private int wage;
	private int hours;
	public WageEmployee(){}
	    @Override
	    public int computePay() {
	        return getBasicSalary()+wage*hours;
	    }
	    public int getWage() {
	        return wage;
	    }
	    public void setWage(int wage) {
	        this.wage = wage;
	    }
	    public int getHours() {
	        return hours;
	    }
	    public void setHours(int hours) {
	        this.hours = hours;
	    }
	    @Override
	    public String toString() {
	        return "WageEmployee [wage=" + wage + ", hours=" + hours
	                + " " + super.toString() + "wage employee salary = "
	                +computePay()+"]";
	    }
	    public WageEmployee(String name, int basicSalary, int wage, int hours){
	        setName(name);
	        setBasicSalary(basicSalary);
	        this.wage=wage;
	        this.hours=hours;
	    }

	@Override
	public boolean fillData(Object[] data) {
		boolean result=false;
        if( data[1] instanceof Integer &&
                data[2] instanceof Integer){
            wage=(Integer)data[1];
            hours=(Integer)data[2];
            result=true;
        }
        return result;
    
	}

}
