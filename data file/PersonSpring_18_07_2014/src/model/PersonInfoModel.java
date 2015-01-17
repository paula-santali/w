package model;

import java.sql.SQLException;
import java.util.List;

public interface PersonInfoModel {
public boolean addPerson(Person person) ;
public Person getPersonId(int id) ;
public List<Person> getPersonsYear(int minYear,int maxYear) ;
public List<Person> getPersonsName(String name) ;
public boolean removePerson(int id)  ;
}
