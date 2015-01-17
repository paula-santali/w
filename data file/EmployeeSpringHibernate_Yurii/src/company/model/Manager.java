package company.model;
import javax.persistence.*;
@Entity
public class Manager extends Employee {
	int grade;
	@Override
	public int computeSalary() {
		return getBasicSalary()*grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Manager [grade=" + grade + ", Employee=" + super.toString()
				+ "]";
	}
	@Override
	public void fillData(String[] data) {
		grade=Integer.parseInt(data[0]);
		
	}

}
