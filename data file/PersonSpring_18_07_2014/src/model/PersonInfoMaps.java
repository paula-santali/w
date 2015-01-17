package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonInfoMaps implements PersonInfoModel {
private HashMap<Integer,Person> personsId;
private TreeMap<Integer,List<Person>>personsYear;
private HashMap<String,List<Person>>personsName;

public PersonInfoMaps(){
	this.personsId=new HashMap<Integer,Person>();
	this.personsYear=new TreeMap<Integer,List<Person>>();
	this.personsName=new HashMap<String,List<Person>>();
	
}

	@Override
	public boolean addPerson(Person person) {
		boolean res=false;
		int id=person.getId();
		if(!personsId.containsKey(id)){
			personsId.put(id, person);
			addPersonYear(person);
			addPersonName(person);
			res=true;
		}	
		return res;
	}

	private void addPersonName(Person person) {
		String name=person.getName();
		List <Person>pi = personsName.get(name);
		if(pi==null){
			pi=new ArrayList<Person>();
			personsName.put(name, pi);
		}
		pi.add(person);
	}

	private void addPersonYear(Person person) {
		int year=person.getBirthYear();
		List<Person>pi=personsYear.get(year);
		if(pi==null){
			pi=new ArrayList<Person>();
			personsYear.put(year,pi);	
		}
		pi.add(person);
	}

	@Override
	public Person getPersonId(int id) {
		
		return personsId.get(id);
	}

	@Override
	public List<Person> getPersonsYear(int minYear, int maxYear) {
	NavigableMap<Integer,List<Person>>	subMap=personsYear.subMap(minYear, true, maxYear, true);
		return mapToList(subMap);
	}

	private List<Person> mapToList(NavigableMap<Integer, List<Person>> subMap) {
		List<Person> res =null;
		if(subMap!=null){
			Collection<List<Person>>collect=subMap.values();
			if(collect!=null){
				 res = new ArrayList<Person>();
				 for(List<Person>list:collect)
					 res.addAll(list);
			}
		}
		return res;
	}

	@Override
	public List<Person> getPersonsName(String name) {
		
		return personsName.get(name);
	}

	@Override
	public boolean removePerson(int id) {
		boolean res=false;
	 Person prs =personsId.remove(id);
	if(prs!=null){
		removePersonYear(prs);
		removePersonName(prs);
		res=true;
	}
		return res;
	}

	private void removePersonName(Person prs) {
		
		personsName.get(prs.getName()).remove(prs);
		
	}

	private void removePersonYear(Person prs) {
		//personsYear.get(prs.getBirthYear()).remove(prs);
		
		List<Person> persons =personsYear.get(prs.getBirthYear());
	}

		

}
