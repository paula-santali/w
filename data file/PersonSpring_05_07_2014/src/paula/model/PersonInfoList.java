package paula.model;

import java.util.ArrayList;
import java.util.List;

public class PersonInfoList implements PersonInfoModel {
private List<Person> persons;

public PersonInfoList() {
	
	this.persons = new ArrayList<Person>();
}

@Override
public boolean addPerson(Person person) {
	boolean res=false;
	if(person!=null&&!persons.contains(person)){
		persons.add(person);
		res= true;
	}
	
	return res;
}

@Override
public Person getPersonId(int id) {
	Person result=null;
	for(Person person :persons){
		if(person.getId()==id){
			result=person;
			break;
		}
	}
	return result;
}



@Override
public List<Person> getPersonsYear(int minYear, int maxYear) {
	List <Person> pi=new ArrayList<Person>();
	for(Person person:persons){
		if(person.getBirthYear()>=minYear&&person.getBirthYear()<=maxYear){
			pi.add(person);
		}
		
	}
	return pi;
}

@Override
public List<Person> getPersonsName(String name) {
	List <Person>pi=new ArrayList<Person>();
	for(Person person:persons){
		if(person.getName().equals(name)){
			pi.add(person);
		}
	}
	return pi;
}

@Override
public boolean removePerson(int id) {
	Person pattern=new Person(id,null,0);
	
	return persons.remove(pattern);
}
//public void restore(){
//	System.out.println("restore");
//}
//public void save(){
//	System.out.println("save");
//
//}

}
