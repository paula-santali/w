package paula.model;

import java.util.List;

public interface PersonDatabase extends Iterable<PersonInfo>{
	public void addPerson(PersonInfo pi);
	public PersonInfo removePerson(int id);
	public int size();
	public PersonInfo getPersonsById(int id);
	public List<PersonInfo> getPersonsOlderThan(int age);
	public List<PersonInfo> getPersonsYoungerThan(int age);
	public List<PersonInfo> getPersonsInAgeRange(int minAge,int maxAge);
	public void removePersonsOlderThen(int age);
	public List<PersonInfo> getPersonsByAddress(Address ad);
	public boolean updateAddress(int id,Address address);
	public List<PersonInfo> getPersonsSortedByAge();
	
	}

