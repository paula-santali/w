package paula.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class PersonTreeDB implements PersonDatabase{
	private TreeSet<PersonInfo>personDB;

	public PersonTreeDB(){
		personDB=new TreeSet<PersonInfo>();

	}
	public PersonTreeDB(PersonInfo[]persons){
		this.personDB=new TreeSet<PersonInfo>();
		for(int i=0;i<persons.length;i++)
			this.personDB.add(persons[i]);
	}
	@Override
	public Iterator<PersonInfo> iterator() {

		return personDB.iterator();
	}
	public void addPerson(PersonInfo pi) {
		personDB.add(pi);


	}
	@Override                      
	public PersonInfo removePerson(int id) {
		PersonInfo pi = getPersonsById(id);
		personDB.remove(pi);
		return pi;
	}
	@Override
	public int size() {
		
		return personDB.size();
	}
	@Override
	public PersonInfo getPersonsById(int id) {
		PersonInfo ar=null;
		for(PersonInfo pi:personDB){
			int res=pi.getId();
			if(res==id){
				ar=pi;
			}
		}

		return ar;
	}
	@Override
	public List<PersonInfo> getPersonsOlderThan(int age) {
		List<PersonInfo> pi=new ArrayList<PersonInfo>();
		for(PersonInfo per:personDB){
			int a=per.getAge();
			if(a>=age)
				pi.add(per);
		}

		return pi;
	}
	@Override
	public List<PersonInfo> getPersonsYoungerThan(int age) {
		List<PersonInfo> pi=new ArrayList<PersonInfo>();
		for(PersonInfo per:personDB){
			int a=per.getAge();
			if(a<=age)
				pi.add(per);
		}
		return pi;
	}
	@Override
	public List<PersonInfo> getPersonsInAgeRange(int minAge, int maxAge) {
		List<PersonInfo> pi=new ArrayList<PersonInfo>();
		for(PersonInfo per:personDB){
			int a=per.getAge();
			if(a>=minAge&&a<=maxAge)
				pi.add(per);
		}
		return pi;
		
	}
	@Override
	public void removePersonsOlderThen(int age) {
		Iterator<PersonInfo> it = personDB.iterator();
		while(it.hasNext()){
			PersonInfo per = it.next();
		if(per.getAge()> age)
			it.remove();
		
		}
	}
	@Override
	public List<PersonInfo> getPersonsByAddress(Address ad) {
		List<PersonInfo> pi=new ArrayList<PersonInfo>();
		for(PersonInfo per:personDB){
			if(per.getAddress()==ad)
				pi.add(per);
		}
		
		return pi;
	}
	@Override
	public boolean updateAddress(int id, Address address) {
		boolean res=false;
		List<PersonInfo>pi=new ArrayList<PersonInfo>();
		for(PersonInfo per:personDB){
			if(per.getId()==id
					&&per.getAddress()==address)
				res=true;
		}
		return res;
	}
	@Override
	public List<PersonInfo> getPersonsSortedByAge() {
		List<PersonInfo>pi=new ArrayList<PersonInfo>();
		Collections.sort(pi, new ComparatorByAge());
		return pi;
		
	}

}
