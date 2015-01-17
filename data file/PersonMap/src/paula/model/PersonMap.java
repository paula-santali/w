package paula.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class PersonMap implements PersonDatabase {
	HashMap<Integer,PersonInfo> personId;//Integer - id(key), value- PersonInfo
    HashMap<Address,List<PersonInfo>> personAddress;
    TreeMap<Integer, List<PersonInfo>> personAge;//Integer - birth year(key), value- list of persons born in the same year

    
    
    public PersonMap(){
        personId=new HashMap<Integer,PersonInfo>();
         personAddress =new HashMap<Address,List<PersonInfo>>();
         personAge=new TreeMap<Integer, List<PersonInfo>>();
    }

	@Override
	public Iterator<PersonInfo> iterator() {
		
		return personId.values().iterator();
	}

	@Override
	public void addPerson(PersonInfo person) {
		if(person != null){
            personId.put(person.getId(), person);
            addPersonAddress(person);
            addPersonAge(person);
        }


	}

	private void addPersonAge(PersonInfo person) {
		 List<PersonInfo> persons;
	        Date data=person.getBirthday();
	        int year=getYear(data);
	        persons=personAge.get(year);
	        if(persons==null){
	            persons=new ArrayList<PersonInfo>();
	            personAge.put(year, persons);
	        }
	        persons.add(person);
	         

		
	}
	private int getYearFromAge(int age) {
		Calendar cl=new GregorianCalendar();
		return cl.get(Calendar.YEAR)-age;
	}

	
	private int getYear(Date data) {
		Calendar cl=new GregorianCalendar();
		cl.setTime(data);
		return cl.get(Calendar.YEAR);
	}


	

	private void addPersonAddress(PersonInfo person) {
		 List<PersonInfo> persons;
	        Address addr=person.getAddress();
	        persons=personAddress.get(addr);
	        if(persons==null){
	            persons=new ArrayList<PersonInfo>();
	            personAddress.put(addr, persons);
	        }
	        persons.add(person);

		
	}

	@Override
	public PersonInfo removePerson(int id) {
		PersonInfo pi=personId.remove(id);
        if(pi != null){
            int year=getYear(pi.getBirthday());
            personAge.get(year).remove(pi);
            personAddress.get(pi.getAddress()).remove(pi);
        }
        return pi;
	
	}

	@Override
	public int size() {
		
		return personId.size();
	}

	@Override
	public PersonInfo getPersonsById(int id) {
		
		return personId.get(id);
	}

	@Override
	public List<PersonInfo> getPersonsOlderThan(int age) {
		 int year=getYearFromAge(age);
	        TreeMap<Integer,List<PersonInfo>> res=
	                (TreeMap<Integer, List<PersonInfo>>) personAge.headMap(year);
	         
	        return mapToArray(res);

		
	}

	private List<PersonInfo> mapToArray(TreeMap<Integer, List<PersonInfo>> res) {
		Collection<List<PersonInfo>> ress = res.values();
		List<PersonInfo> resList = new ArrayList<PersonInfo>();
		for(List<PersonInfo> p:ress)
		resList.addAll(0,p);
		return resList;
	
	}

	

	@Override
	public List<PersonInfo> getPersonsYoungerThan(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonInfo> getPersonsInAgeRange(int minAge, int maxAge) {
		int minAg=getYearFromAge(maxAge);
		int maxAg=getYearFromAge(minAge);
		this.personAge=(TreeMap<Integer, List<PersonInfo>>) personAge.subMap(minAg,maxAg);
		
		return mapToArray(personAge);
	}

	@Override
	public void removePersonsOlderThen(int age) {
		int ag=getYearFromAge(age);
		this.personAge=(TreeMap<Integer, List<PersonInfo>>) personAge.headMap(ag);

	}

	@Override
	public List<PersonInfo> getPersonsByAddress(Address ad) {
		
		return null;
	}

	@Override
	public boolean updateAddress(int id, Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PersonInfo> getPersonsSortedByAge() {
		// TODO Auto-generated method stub
		return null;
	}

}
