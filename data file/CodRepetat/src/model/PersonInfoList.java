package model;

import java.util.ArrayList;
import java.util.List;

public class PersonInfoList implements PersonInfoModel {
private List<Person>persons;

public PersonInfoList() {
	super();
	this.persons=new ArrayList<Person>();
}

	@Override
	public boolean addPerson(Person person) {
		boolean res=false;
		if(person!=null&&persons.contains(person)){
			persons.add(person);
			res=true;
		}
		return res;
	}

	@Override
	public Person getPersonId(int id) {
		Person result=null;
		for(Person person:persons){
			if(person.getId()==id){
				result=person;
			}
		}
		return result;
	}

	@Override
	public List<Person> getPersonsYear(int minYear, int maxYear) {
		List<Person> prs=new ArrayList<Person>();
		for(Person person:persons){
			int year=person.getBirthYear();
			if(year>=minYear && year<=maxYear)
				prs.add(person);
		}
		return prs;
	}

	@Override
	public List<Person> getPersonsName(String name) {
		List<Person> prs=new ArrayList<Person>();
		for(Person person:persons){
			if(person.getName().equals(name)){
				prs.add(person);
			}
		}
		return prs;
	}

	@Override
	public boolean removePerson(int id) {
		Person pattern=new Person(id,null,0);
		return persons.remove(pattern);
	}

	

}
