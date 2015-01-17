package paula.employee;

public class Manager extends Employee {
	private int k;
    @Override
    public int computePay() {
         
        return getBasicSalary()*k;
    }
    public Manager()
    {
         
    }
    public Manager (String name, int basicSalary){
        setName(name);
        setBasicSalary(basicSalary);
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
    @Override
    public String toString() {
        return "Manager [k=" + k + " " + super.toString() +"manager salary = "+
    computePay()+"]";
    }
    @Override
    public boolean fillData(Object[] data) {
       boolean result = false;
       if(data[1]instanceof Integer){
    	   k=(Integer) data[1];
    	   result =true;
       }
        return result;
    }

}
