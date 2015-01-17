package model;
import java.util.List;

import javax.persistence.*;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
public class EmployeeDBHibernate implements EmployeeDB {
@PersistenceContext (unitName="springHibernate")
EntityManager em;
	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	public boolean addEmployee(String employeeType, int basicSalary, int id,
			String name, String[] data) {
		boolean result =false;
		if(em.find(Employee.class, id)==null){
		try {
			Class cl =Class.forName("model."+employeeType);
			Employee emp=(Employee) cl.newInstance();
			emp.fillData(data);
			emp.setId(id);
			emp.setBasicSalary(basicSalary);
			emp.setName(name);
			em.persist(emp);
			result =true;
		} catch (Exception e) {
			
			System.out.println("Type wrong "+employeeType);
			e.printStackTrace();
		}
		
		}
		return result;
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	@Override
	public Employee removeEmployee(int id) {
		Employee empl=em.find(Employee.class, id);
		if(empl!=null){
			em.remove(empl);
		}
		return empl;
	}

	@Override
	public int getSalaryBudget() {
		Query query=em.createQuery("SELECT e FROM Employee e");
		List <Employee>employees=query.getResultList();
		int budget=0;
		for(Employee empl:employees)
		budget+=empl.computeSalary();
	
		return budget;
	}

}
