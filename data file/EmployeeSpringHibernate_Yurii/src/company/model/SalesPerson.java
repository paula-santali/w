package company.model;
import javax.persistence.*;
@Entity
public class SalesPerson extends WageEmployee {
	private int revenue;
	private int commissions;
	@Override
	public int computeSalary() {
		return super.computeSalary()+revenue*commissions/100;
	}

	@Override
	public void fillData(String[] data) {
		super.fillData(data);
		int index=WageEmployee.N_FIELDS;
		revenue=Integer.parseInt(data[index]);
		commissions=Integer.parseInt(data[index+1]);
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getCommissions() {
		return commissions;
	}

	public void setCommissions(int commissions) {
		this.commissions = commissions;
	}

	@Override
	public String toString() {
		return "SalesPerson [revenue=" + revenue + ", commissions="
				+ commissions + ", WageEmployee=" + super.toString() + "]";
	}

}
