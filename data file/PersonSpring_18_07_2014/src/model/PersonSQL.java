package model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import database.DatabaseConnection;

public class PersonSQL implements PersonInfoModel{
	private Statement statement;
	
	public PersonSQL() throws ClassNotFoundException, SQLException{
		statement = DatabaseConnection.getDatabaseConnection("root","12345.com");
		String sql ="CREATE TABLE IF NOT EXISTS persondb(id INTEGER,name VARCHAR(254),birthYear INTEGER, PRIMARY KEY(id),INDEX(name),INDEX(birthYear))";
		statement.executeUpdate(sql);
	}

	
	@Override
	public boolean addPerson(Person person)  {
		 boolean res=false;
	        int id=person.getId();
	        String name=person.getName();
	        int birthYear=person.getBirthYear();
	        if(getPersonId(person.getId())==null){
	            String sql="INSERT INTO Person (id,name,birthYear) "
	        + "VALUES ("+id+",'"+name+"',"+birthYear+')';
	            try {
	                statement.executeUpdate(sql);
	                res=true;
	            } catch (SQLException e) {
	                 
	            }
	            }
	        return res;

	}

	@Override
	public Person getPersonId(int id) {
		String sql="SELECT * FROM Person WHERE id="+id;
        List<Person> persons=new ArrayList<Person>();
        getPersons(sql, persons);
        Person res=null;
        if(!persons.isEmpty())
            res=persons.get(0);
        return res;

	
	}

	@Override
	public List<Person> getPersonsYear(int minYear, int maxYear) {
		 String sql="SELECT * FROM Person WHERE birthYear BETWEEN "+ minYear+" AND "+maxYear;
	        List<Person> persons=new ArrayList<Person>();
	        getPersons(sql, persons);
	        return persons;

	}

	@Override
	public List<Person> getPersonsName(String name) {
		 String sql="SELECT * FROM Person WHERE name='"+name+"'";
	        List<Person> persons=new ArrayList<Person>();
	        getPersons(sql, persons);
	        return persons;

	}
	@Override
	public boolean removePerson(int id)  {
		String sql="DELETE FROM Person WHERE id="+id;
        boolean res=false;
        try {
            statement.executeUpdate(sql);
            res=true;
        } catch (SQLException e) {
             
        }
        return res;
    }
	



	private void getPersons(String sql, List<Person> persons) {
		 ResultSet rs;
	        try {
	            rs = statement.executeQuery(sql);
	            while (rs.next()) {
	                String name=rs.getString("name");
	                int id=rs.getInt("id");
	                int birthYear=rs.getInt("birthYear");
	                Person prs=new Person(id,name,birthYear);
	                persons.add(prs);
	            }
	        } catch (SQLException e) {
	           
	            e.printStackTrace();
	        }

	}

}
	