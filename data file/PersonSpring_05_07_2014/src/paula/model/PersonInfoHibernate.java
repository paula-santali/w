package paula.model;

import java.util.*;
import javax.persistence.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
public class PersonInfoHibernate implements PersonInfoModel {
	
	@PersistenceContext (unitName="springHibernate")
	EntityManager em;

	@Transactional(readOnly=false,propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean addPerson(Person person) {
		boolean result=false;
		if(em.find(Person.class, person.getId())==null){
			em.persist(person);
			result =true;
		}
		return result;
	}

	@Override
	public Person getPersonId(int id) {

		return em.find(Person.class, id);
	}


	@Override

	public List<Person> getPersonsYear(int minYear, int maxYear) {
		Query query=em.createQuery("SELECT  prs FROM Person prs WHERE prs.birthYear  BETWEEN ?1 AND ?2");
		query.setParameter(1, minYear);
		query.setParameter(2, maxYear);
		List <Person> result =query.getResultList();
		return result;
	}

	@Override
	public List<Person> getPersonsName(String name) {
		Query query=em.createQuery("SELECT  prs FROM Person prs WHERE prs.name=?1");
		query.setParameter(1, name);
		List <Person> result =query.getResultList();
		return result;
	}

	@Transactional(readOnly=false,propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean removePerson(int id) {
		boolean result =false;
		Person res;
		res=em.find(Person.class,id);
		if(res!=null){
			em.remove(res);
			result =true;
		}
		return result;
	}

}
