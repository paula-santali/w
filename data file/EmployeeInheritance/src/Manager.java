
public class Manager extends Employee {
private int k;

	@Override
	public int computePay() {
		
		return getBasicSalary()*k;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
   public Manager(){
	
   }
   public Manager(String name,int basicSalary){
	setName(name);
	setBasicSalary(basicSalary);
   }

@Override
public String toString() {
	return "Manager [k=" + k + " " + super.toString() + "]";
}
 
}
