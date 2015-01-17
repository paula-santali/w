package model;
import java.util.List;
import javax.persistence.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
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
			@SuppressWarnings("rawtypes")
			Class cl =Class.forName("model."+employeeType);
			Employee emp=(Employee) cl.newInstance();
			emp.setId(id);
			emp.setBasicSalary(basicSalary);
			emp.setName(name);
			em.persist(emp);
			emp.fillData(data);
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
	@Override
	public String[] getAnyMultipleQuery(String jpaStr) {
		Query query=em.createQuery(jpaStr);
		
		List <Object[]> result =query.getResultList();
		String [] array= new String[result.size()];
		int ind=0;
		for(Object[] arObj:result){
			String strResult =arObj[0].toString();
			for(int i=1;i<arObj.length;i++)
				strResult+=" "+arObj[i].toString();
			array[ind++]=strResult;
		}
		return array;
	}
	@Override
	public String[] getAnySingleQuery(String jpaStr) {
		Query query=em.createQuery(jpaStr);
		List <Object> result =query.getResultList();
		String [] array= new String[result.size()];
		int index=0;
		for( Object obj:result)
			array[index++]=obj.toString();
		return array;
		
	}

}

